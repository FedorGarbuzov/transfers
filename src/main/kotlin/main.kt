fun main() {
    val amount = 500000
    val commission = amount / 100 * 0.75

    val result = if (commission > 3500) commission else 3500
    println("Перевод в сумме: $amount коп. комиссия: $result коп.")
}