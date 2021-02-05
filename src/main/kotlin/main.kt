fun main() {
    val samochod1 = Passat(Silnik("Benzyna",150))
    samochod1.jedz()
    samochod1.nacisnijHamulec()
    samochod1.info()

    val samochod2 = Bmw(Silnik("Benzyna",260))
    samochod2.jedz()
    samochod2.nacisnijHamulec()
}
