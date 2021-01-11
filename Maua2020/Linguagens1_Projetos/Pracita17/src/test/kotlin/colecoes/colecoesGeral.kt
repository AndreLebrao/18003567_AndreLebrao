package colecoes

fun main() {
    val meuVetor = arrayOf(1,2,3)
    println(meuVetor)
    var item:Int
    for(item in meuVetor){
        println(item)
    }
    println("Tamanho do array: ${meuVetor.size}")
    println("Primeiro elemento: ${meuVetor[0]}")
    println("Maior valor: ${meuVetor.max()}")
    //Lista
    //objeto List nao eh mutavel
    val minhaLista = listOf("oi","ola","denovo")
    println(minhaLista)
    val minhaListaQueMuda = mutableListOf("oi","ola","denovo")
    minhaListaQueMuda.add("Goku")
    println(minhaListaQueMuda)
}