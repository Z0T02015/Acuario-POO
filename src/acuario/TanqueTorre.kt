package acuario

import kotlin.math.PI

class TanqueTorre(
    override var alto: Int,
    var diametro: Int
) : Acuario(alto = alto, ancho = diametro, largo = diametro) {


    override var volumen: Int
        get() = (ancho / 2 * largo / 2 * alto / 1000 * PI).toInt()
        set(valor) {
            alto = ((valor * 1000 / PI) / (ancho / 2 * largo / 2)).toInt()
        }

    // Agua = 80% del volumen
    override var agua = volumen * 0.8

    // Forma cilíndrica
    override val forma = "cilindro"
}
