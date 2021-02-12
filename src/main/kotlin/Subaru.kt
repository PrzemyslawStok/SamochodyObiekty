class Subaru(override val silnik: Silnik, override val skrzyniaBiegow: SkrzyniaBiegow) : Samochod(){
    override fun jedz() {
        println("samochód jedzie")
    }

    override fun nacisnijHamulec() {
        TODO("Not yet implemented")
    }

    override fun skrec() {
        TODO("Not yet implemented")
    }

    override fun zaciagnijHamulecReczny() {
        TODO("Not yet implemented")
    }
}
