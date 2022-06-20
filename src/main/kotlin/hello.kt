fun sayHello(greeting: String,vararg itemsToGreet: String) {
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    val interestingThings = mutableListOf("Kotlin", "Android", "Swift", "iOS")
    sayHello("Hello", "Kotlin", "Android", "Swift", "iOS")
}