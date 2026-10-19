trait Figura {
    def area: Double
}

class Rectangulo(
    val base: Double,
    val altura: Double
) extends Figura {
    override def area: Double = {
        base * altura
    }
}

class Circulo(
    val radio: Double
) extends Figura {
    override def area: Double = {
        Math.PI * radio * radio
    }
}

class Triangulo(
    val base: Double,
    val altura: Double
) extends Figura {
    override def area: Double = {
        (base * altura) / 2.0
    }
}

object main {
    def mostrarArea(figura: Figura): Double = {
        figura.area
    }

    def main(args: Array[String]): Unit = {
        val rectangulo = new Rectangulo(5.0, 3.0)
        val circulo = new Circulo(4.0)
        val triangulo = new Triangulo(6.0, 2.0)
        println(s"Área del rectángulo (5x3): ${mostrarArea(rectangulo)}")
        println(s"Área del círculo (radio 4): ${mostrarArea(circulo)}")
        println(s"Área del triángulo (base 6, altura 2): ${mostrarArea(triangulo)}")
    }
}