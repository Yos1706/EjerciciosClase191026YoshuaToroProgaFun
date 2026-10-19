trait Notificacion {
    def enviar(mensaje: String): String
}

class Email extends Notificacion {
    override def enviar(mensaje: String): String = {
        s"Enviando correo: $mensaje"
    }
}

class SMS extends Notificacion {
    override def enviar(mensaje: String): String = {
        s"Enviando SMS: $mensaje"
    }
}

class Push extends Notificacion {
    override def enviar(mensaje: String): String = {
        s"Enviando notificación: $mensaje"
    }
}

object Ejercicio4Main {
    def procesarNotificacion(
        notificacion: Notificacion,
        mensaje: String
    ): String = {
        notificacion.enviar(mensaje)
    }

    def main(args: Array[String]): Unit = {
        val email = new Email()
        val sms = new SMS()
        val push = new Push()
        val textoPrueba = "Hola"
        println(procesarNotificacion(email, textoPrueba)) 
        println(procesarNotificacion(sms, textoPrueba))   
        println(procesarNotificacion(push, textoPrueba)) 
    }
}