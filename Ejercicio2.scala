abstract class Animal(
    val nombre: String
) {
    def sonido(): String
}

trait Volador{
    def volar(): String = {
        "El animal vuela"
    }
}

trait Nadador {
    def nadar(): String = {
        "Nada en el agua"
    }
}

class Perro(
    nombre: String
) extends Animal(nombre) {
    override def sonido(): String = {
        "Guau guau"
    }
}

class Pato(
    nombre: String
) extends Animal(nombre)
    with Volador
    with Nadador {
    override def sonido(): String = {
        "Cuac cuac"
    }
}

class Pez(
    nombre: String
) extends Animal(nombre)
    with Nadador {
    override def sonido(): String = {
        "Glub glub"
    }
}

object Ejercicio2Main{
    def main(args: Array[String]): Unit = {
        val perro = new Perro("Milo")
        val pato = new Pato("Lucas")
        val pez = new Pez("Nemo")
        println(s"Perro (${perro.nombre}):")
        println(s"  Sonido: ${perro.sonido()}")
        println(s"Pato (${pato.nombre}):")
        println(s"  Sonido: ${pato.sonido()}")
        println(s"  Capacidad: ${pato.volar()}")
        println(s"  Capacidad: ${pato.nadar()}")
        println(s"Pez (${pez.nombre}):")
        println(s"  Sonido: ${pez.sonido()}")
        println(s"  Capacidad: ${pez.nadar()}")
    }
}