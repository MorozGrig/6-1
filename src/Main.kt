fun generateCities(): List<City> {
    val cityNames = listOf(
        "Москва", "Санкт-Петербург", "Казань", "Новосибирск", "Екатеринбург",
        "Нижний Новгород", "Челябинск", "Ростов-на-Дону", "Воронеж", "Уфа",
        "Самара", "Красноярск", "Иркутск", "Волгоград", "Тюмень", "Барнаул"
    )
    return cityNames.map { City(it) }
}

fun main() {
    val cities = generateCities()
    while (true) {
        println("Введите 'EXIT' для завершения работы или любую клавишу для продолжения.")
        val input = readLine()
        if (input.equals("EXIT", ignoreCase = true)) break

        val startCity = cities[(0 until cities.size).random()]
        val endCity = cities.filter { it != startCity }[(0 until cities.size - 1).random()]

        println("Направление: ${startCity.name} - ${endCity.name}")

        val passengersCount = (5..201).random()
        println("Количество купленных билетов: $passengersCount")

        val train = Train()
        var remainingPassengers = passengersCount
        while (remainingPassengers > 0) {
            val capacity = (5..25).random()
            val car = Vagons(capacity)
            remainingPassengers = car.addPassengers(remainingPassengers)
            train.addCar(car)
        }

        println("Поезд из ${startCity.name} в ${endCity.name} отправлен, состоящий из ${train.cars.size} вагонов.")
        println("Информация о вагонах: ${train.getCarsInfo()}")
    }
}