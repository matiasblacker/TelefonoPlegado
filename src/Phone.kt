open class Phone {
    open fun switchOn() {
        println("La pantalla del teléfono se enciende.")
    }

    fun switchOff() {
        println("La pantalla del teléfono se apaga.")
    }
}

class FoldablePhone : Phone() {
    var isFolded: Boolean = false

    override fun switchOn() {
        if (isFolded) {
            println("El teléfono está plegado. No se enciende la pantalla.")
        } else {
            println("El teléfono no está plegado. La pantalla se enciende.")
        }
    }

    fun fold() {
        isFolded = true
        println("El teléfono está ahora plegado.")
    }

    fun unfold() {
        isFolded = false
        println("El teléfono está ahora desplegado.")
    }
}

fun main() {
    val myPhone = FoldablePhone()
    myPhone.switchOn()
    myPhone.fold()
    myPhone.switchOn()
    myPhone.unfold()
    myPhone.switchOn()
    myPhone.switchOff()
}
