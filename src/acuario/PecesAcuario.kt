package acuario

// Clase abstracta
abstract class Pez {
    abstract val color: String
}

// Interfaz
interface AccionPez {
    fun comer()
}

// Tiburon implementa Pez y AccionPez
class Tiburon : Pez(), AccionPez {
    override val color: String = "gris"
    override fun comer() {
        println("cazar y comer peces")
    }
}

// PezPayaso implementa Pez y AccionPez
class PezPayaso : Pez(), AccionPez {
    override val color: String = "dorado"
    override fun comer() {
        println("comer algas")
    }
}