package padroes

class Product(val name: String, val price: Double, val quantity: Int)

class CustomOrder private constructor(
    val customerName: String,
    val products: List<Product>,
    val total: Double,
    val deliveryAddress: String
) {
    class Builder {
        private var customerName: String = ""
        private var products: MutableList<Product> = mutableListOf()
        private var deliveryAddress: String = ""

        fun setCustomerName(name: String) = apply { customerName = name }
        fun addProduct(product: Product) = apply { products.add(product) }
        fun setDeliveryAddress(address: String) = apply { deliveryAddress = address }

        fun build(): CustomOrder {
            val total = products.sumByDouble { it.price * it.quantity }
            return CustomOrder(customerName, products, total, deliveryAddress)
        }
    }

    fun printReceipt() {
        println("${this.customerName}")
        this.products.forEachIndexed { index, product ->
            println("${index + 1}. ${product.name} | ${product.price} | ${product.quantity}")
        }
        println("Total: ${"%.1f".format(this.total)}")  // Format total to one decimal place
        println("End: ${this.deliveryAddress}")
    }
}

fun main() {
    println("Digite o nome:")
    val customerName = readLine() ?: ""

    val orderBuilder = CustomOrder.Builder().setCustomerName(customerName)

    println("Digite a quantidade de produtos:")
    val numProducts = readLine()?.toIntOrNull() ?: 0

    for (i in 1..numProducts) {
        println("Digite o nome do produto número $i:")
        val productName = readLine() ?: ""

        println("Digite o preço do produto número $i:")
        val productPrice = readLine()?.toDoubleOrNull() ?: 0.0

        println("Digite a  qauntidade do produto número $i:")
        val productQuantity = readLine()?.toIntOrNull() ?: 0

        orderBuilder.addProduct(Product(productName, productPrice, productQuantity))
    }

    println("Digite o endereço:")
    val deliveryAddress = readLine() ?: ""

    val customOrder = orderBuilder.setDeliveryAddress(deliveryAddress).build()

    customOrder.printReceipt()
}
