package acuario

open class Acuario(
    open var largo: Int = 100,
    open var ancho: Int = 20,
    open var alto: Int = 40
) {
    open var volumen: Int
        get() = (ancho * alto * largo) / 1000
        set(valor) { alto = (valor * 1000) / (ancho * largo) }

    open val forma = "rectángulo"
    open var agua: Double = 0.0
        get() = volumen * 0.9

    fun imprimirTamano() {
        println("$forma: $largo x $ancho x $alto cm")
        println("Volumen: $volumen l Agua: $agua l")
    }

    constructor(numeroDePeces: Int) : this() {
        val tanque = (numeroDePeces * 2000 * 1.1).toInt()
        alto = tanque / (largo * ancho)
    }
}
