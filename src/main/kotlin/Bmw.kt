class Bmw(override val silnik: String) : Samochod() {
    override fun jedz() {
        println("samochód jedzie")
    }

    override fun nacisnijHamulec() {
        hamulce()
    }

    override fun skrec() {

    }

    private fun hamulce(){
        println("samochód włącza hamulce")
        abs()
    }

    private fun abs(){
        println("Abs nie działa, ktoś chyba wyciągnął bezpiecznik ...")
    }
}
