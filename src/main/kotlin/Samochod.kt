abstract class Samochod {
    abstract val silnik: String

    abstract fun jedz()
    abstract fun zatrzymajSie()
    abstract fun skrec()

    fun info(){
        println("Podstawowe informacje")
        println("Silnik: $silnik")
    }
}
