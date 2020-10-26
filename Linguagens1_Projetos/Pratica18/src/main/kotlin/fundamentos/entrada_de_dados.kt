package fundamentos

fun main(){
    print("Informe seu nome: ")
    val nome = readLine() ?: ""
    println("Nome informado: $nome")
    println("Tamanho: ${nome.length}")
}