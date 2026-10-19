abstract class Vehiculo(
    val marca: String,
    val velocidadMaxima: Double
) {
    def descripcion(): String
}

trait Electrico {
    val autonomiaKm: Double
    def modoSilencioso(): String = {
        "Conduciendo en modo eléctrico y silencioso"
    }
}

trait Recargable {
    def recargar(): String = {
        "Conectando al cargador: Recargando batería..."
    }
}

class Automovil(
    marca: String,
    velocidadMaxima: Double,
    val numeroPuertas: Int
) extends Vehiculo(marca, velocidadMaxima) {
    override def descripcion(): String = {
        s"Automóvil de marca $marca, Velocidad Máxima: $velocidadMaxima km/h, Puertas: $numeroPuertas"
    }
}

class Motocicleta(
    marca: String,
    velocidadMaxima: Double,
    val cilindradaCc: Int
) extends Vehiculo(marca, velocidadMaxima) {
    override def descripcion(): String = {
        s"Motocicleta de marca $marca, Velocidad Máxima: $velocidadMaxima km/h, Cilindrada: ${cilindradaCc}cc"
    }
}

class AutoElectrico(
    marca: String,
    velocidadMaxima: Double,
    val numeroPuertas: Int,
    val autonomiaKm: Double
) extends Vehiculo(marca, velocidadMaxima)
    with Electrico
    with Recargable {
    
    override def descripcion(): String = {
        s"Auto Eléctrico de marca $marca, Velocidad Máxima: $velocidadMaxima km/h, Autonomía: $autonomiaKm km"
    }
}

object Ejercicio5Main {
    def main(args: Array[String]): Unit = {
        val auto = new Automovil("Toyota", 180, 4)
        val moto = new Motocicleta("Yamaha", 220, 600)
        val tesla = new AutoElectrico("Tesla", 250, 4, 500)
        println(auto.descripcion())
        println(moto.descripcion())
        println(tesla.descripcion())
        println(tesla.modoSilencioso())
        println(tesla.recargar())
    }
}