class Bmw(override val silnik: Silnik, override val skrzyniaBiegow: SkrzyniaBiegow) : Samochod() {
    override fun jedz() {
        println("samochód jedzie")
    }

    override fun nacisnijHamulec() {
        hamulce()
    }

    override fun skrec() {
        kierunkowskaz()
        println("Bmw skręca")
    }

    override fun zaciagnijHamulecReczny() {
        println("Zaciągnięto hamulec ręczny")
    }

    private fun hamulce(){
        println("samochód włącza hamulce")
        abs()
    }

    private fun kierunkowskaz(){
        println("...")
    }

    private fun abs(){
        println("Abs nie działa, ktoś chyba wyciągnął bezpiecznik ...")
    }

    override fun info() {
        println("BMW")
        super.info()
    }
}
