package estruturasControle

fun main() {
    val numero = 16
    if(numero %2 ==0)
        println("par")
    else
        println("impar")

    //Simular um ternario
    val numero2 = 43
    val resultado = if(numero%2==0) "par" else "impar"
    println("$resultado")
    println("Resultado ${if(numero%2==0) "par" else "impar"}")

    //Elvis operator
    //Deixa explicito que a variavel pode receber um valor nulo
    var nome : String?
    nome = "Miguel"
    println(nome)
    nome = null
    println(nome)
    println("${nome ?: "Ryu"}")
}