package acuario

fun main() {
    println("=== Demo Acuario ===")
    val acuario = Acuario(largo=25, ancho=25, alto=40)
    acuario.imprimirTamano()

    val torre = TanqueTorre(diametro=25, alto=40)
    torre.imprimirTamano()

    println("=== Peces ===")
    val tiburon = Tiburon()
    val payaso = PezPayaso()
    println("Tiburón (${tiburon.color}) -> "); tiburon.comer()
    println("Pez Payaso (${payaso.color}) -> "); payaso.comer()
}
