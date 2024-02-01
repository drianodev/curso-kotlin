package avancado

/*
    Polimorfismo
*/
interface dev {
    var salario: Float
    fun bonus(): Float
}

class mobile(override var salario: Float): dev {
    override fun bonus(): Float {
        return salario*0.5f
    }
}

class game(override var salario: Float): dev {
    override fun bonus(): Float {
        return salario*1.0f
    }
}

class back(override var salario: Float): dev {
    override fun bonus(): Float {
        return salario*1.5f
    }
}

fun exibirBonus(d: dev) {
    println(d.bonus())
}

fun main() {
    exibirBonus(mobile(1000f))
    exibirBonus(game(1000f))
    exibirBonus(back(1000f))
}
