class Passat(override val silnik: String) : Samochod(){
    override fun jedz() {
        println("samochód jedzie")
    }

    override fun zatrzymajSie() {
        hamulce()
        println("samochód zatrzymuje się")
    }

    override fun skrec() {
        kierunkowskaz()
        println("samochód skręca")
    }

    private fun hamulce(){
        println("samochód włącza hamulce, ewentualnie abs")
    }

    private fun kierunkowskaz(){
        println("włączam kierunkowskaz")
    }
}
