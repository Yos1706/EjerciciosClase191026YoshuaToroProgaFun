abstract class Empleado(
    val nombre: String,
    val salarioBase: Double
) {
    def salarioTotal: Double
}

class Desarrollador(
    nombre: String,
    salarioBase: Double,
    val bonoFijo: Double
) extends Empleado(nombre, salarioBase) {
    override def salarioTotal: Double = {
        salarioBase + bonoFijo
    }
}

class Vendedor(
    nombre: String,
    salarioBase : Double,
    val ventasRealizadas : Double,
    val porcentajeComision: Double
) extends Empleado(nombre, salarioBase) {
    override def salarioTotal: Double = {
        salarioBase + (ventasRealizadas * porcentajeComision)
    }
}

class Gerente(
    nombre: String,
    salarioBase: Double,
    val porcentajeBono: Double
) extends Empleado(nombre, salarioBase) {
    override def salarioTotal: Double = {
        salarioBase + (salarioBase * porcentajeBono)
    }
}

object Ejercicio3Main {
    def main(args: Array[String]): Unit = {
        val dev = new Desarrollador("Lucia", 3000, 500)
        val vendedor = new Vendedor("Carlos", 2000, 10000, 0.1) 
        val gerente = new Gerente("Elena", 5000, 0.2)             
        println(s"Desarrollador (${dev.nombre}): Salario Total = ${dev.salarioTotal} Bs")
        println(s"Vendedor (${vendedor.nombre}): Salario Total = ${vendedor.salarioTotal} Bs")
        println(s"Gerente (${gerente.nombre}): Salario Total = ${gerente.salarioTotal} Bs")
    }
}