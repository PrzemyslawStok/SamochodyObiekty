class Passat(override val silnik: Silnik) : Samochod(){
    override fun jedz() {
        println("samochód jedzie")
    }

    override fun nacisnijHamulec() {
        hamulce()
        println("samochód zwalnia")
    }

    override fun skrec() {
        kierunkowskaz()
        println("samochód skręca")
    }

    override fun zaciagnijHamulecReczny() {
        println("Zaciągnięto hamulec ręczny")
    }

    private fun hamulce(){
        println("samochód włącza hamulce")
        abs()
    }

    private fun abs(){
        println("Jeżeli trzeba włącza się abs")
    }

    private fun kierunkowskaz(){
        println("włączam kierunkowskaz")
    }

    override fun info() {
        println("Passat")
        super.info()
    }
}
