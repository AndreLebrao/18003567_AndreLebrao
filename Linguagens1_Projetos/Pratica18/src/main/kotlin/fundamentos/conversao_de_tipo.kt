package fundamentos

fun main() {
    var numero1 : Double
    var numero2 : Int
    var resultado : Double
    println("Informe 2 numeros: ")
    print("numero real: ")
    numero1 = readLine()!!.toDouble()
    print("numero inteiro: ")
    numero2 = readLine()!!.toInt()
    resultado = numero1+numero2
    println("Resultado: $resultado")
    println("Resultado: ${numero1+numero2}")
    println("Resultado: %.3f".format(resultado))
}