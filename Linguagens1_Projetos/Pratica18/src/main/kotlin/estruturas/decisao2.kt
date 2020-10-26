package estruturas

fun main() {
    val valor = 12
    when(valor){
        56-> println("achei")
        in 1..10->println("Entre 1 e 10")
        // Teste de paridade não funciona
        // valor%2-> println("PAR")
        else-> println("Sou opcional")
    }
}