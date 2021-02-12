fun main() {
    val samochod1 = Passat(Silnik("Benzyna",150),SkrzyniaBiegow())
    samochod1.jedz()
    samochod1.nacisnijHamulec()
    samochod1.info()
    samochod1.skrec()

    val samochod2 = Bmw(Silnik("Benzyna",260),SkrzyniaBiegow())
    samochod2.jedz()
    samochod2.nacisnijHamulec()
    samochod2.skrec()
    samochod2.info()
}
