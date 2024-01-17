package padroes

class OldCurrencyConverter {
    fun convertUSDtoGBP(amount: Double): Double {
        return amount * 0.80 // 80% do valor em USD
    }
}

class CurrencyAdapter(private val oldConverter: OldCurrencyConverter) {
    private val usdToGBPConversionRate = 0.80
    private val gbpToEURConversionRate = 1.0625

    fun convertUSDtoEUR(amount: Double): Double {
        val amountInGBP = oldConverter.convertUSDtoGBP(amount)
        val amountInEUR = amountInGBP * gbpToEURConversionRate
        return amountInEUR
    }
}

fun main() {
    println("Adicione o valor em dolar:")
    val input = readLine()?.toDoubleOrNull() ?: return

    val oldConverter = OldCurrencyConverter()
    val adapter = CurrencyAdapter(oldConverter)

    val amountInEUR = adapter.convertUSDtoEUR(input)

    println("USD: $input")
    println("EUR: $amountInEUR")
}

