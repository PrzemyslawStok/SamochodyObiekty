abstract class Samochod {
    abstract val silnik: Silnik

    abstract fun jedz()
    abstract fun nacisnijHamulec()
    abstract fun skrec()

    open fun info(){
        println("Podstawowe informacje")
        println("Silnik: ${silnik.info()}")
    }
}
