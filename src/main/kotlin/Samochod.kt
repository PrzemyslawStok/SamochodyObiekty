abstract class Samochod {
    abstract val silnik: Silnik
    abstract val skrzyniaBiegow: SkrzyniaBiegow

    abstract fun jedz()
    abstract fun nacisnijHamulec()
    abstract fun skrec()

    abstract fun zaciagnijHamulecReczny()

    open fun info(){
        println("Podstawowe informacje")
        println("Silnik: ${silnik.info()}")
        println(skrzyniaBiegow.info())
    }
}
