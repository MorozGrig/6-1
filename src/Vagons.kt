class Vagons (var capacity: Int, var passangers: Int = 0) {
    fun addPassengers(num: Int): Int {
        return if (passangers + num <= capacity) {
            passangers += num
            0  // Все пассажиры добавлены
        } else {
            val remaining = capacity - passangers
            passangers = capacity
            num - remaining  // Не удалось добавить всех пассажиров
        }
    }
}