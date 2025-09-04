package acuario

fun crearPeces() {
    val tiburon = Tiburon()
    val payaso = PezPayaso()

    println("Color Tiburón: ${tiburon.color}")
    tiburon.comer()

    println("Color Pez Payaso: ${payaso.color}")
    payaso.comer()
}

fun construirAcuario() {
    // Acuario rectangular de ejemplo
    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()

    // Tanque cilíndrico de ejemplo
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()
}

fun main() {
    // Aquí decides qué quieres ejecutar:
    construirAcuario()
    println("----- Peces -----")
    crearPeces()
}