package estruturasControle

fun main() {
    var continuar = true
    while(continuar){
        continuar = readLine()!!.toLowerCase().equals("sim")
    }
    var valor : Int
    for(valor in 1..10){
        println(valor)
    }
}