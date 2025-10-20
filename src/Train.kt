class Train {
    val cars = mutableListOf<Vagons>()

    fun addCar(car: Vagons) {
        cars.add(car)
    }

    fun totalCapacity(): Int {
        return cars.sumOf { it.capacity }
    }

    fun totalPassengers(): Int {
        return cars.sumOf { it.passangers }
    }

    fun getCarsInfo(): String {
        return cars.joinToString(", ") { "Вагон: вместимость ${it.capacity}, пассажиров ${it.passangers}\n" }
    }
}