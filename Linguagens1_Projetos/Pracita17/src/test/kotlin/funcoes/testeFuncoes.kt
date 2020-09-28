package funcoes

//declarar uma funcao
fun SomarDoisNumeros(numero1:Int,numero2: Int):Int{
    return numero1+numero2
}
//para funcoes de apenas uma instrucao
fun MultDoisNumeros(numero1: Int,numero2: Int) = numero1*numero2
fun main() {
    println("${SomarDoisNumeros(4,79)}")
    println("${MultDoisNumeros(5,7)}")
}