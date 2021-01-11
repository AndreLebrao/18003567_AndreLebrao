package estruturasControle

fun main() {
    val valor = readLine()
    when(valor){
        "Murilo"-> println("achei vc")
        "Teste2"-> println("aqui 2")
        "lala"->{
            println("teste de varios comando")
            println("Ate aqui blz")

        }
        else->
            println("valor padrao")
    }
    //para validacoes de valores numericos
    when(valor!!.length){
        in 1..10-> println("ate 10 digitos")
        15-> println("Size==15")
        else-> println("caso padrao")
    }
}