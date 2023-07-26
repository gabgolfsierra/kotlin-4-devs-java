package br.com.erudio

fun main(){

    println(fizzBuzz(30))

}
fun fizzBuzz (n: Int) : List<String>{

    val list = mutableListOf<String>()

    for (i in 1..n){
       val item = when{
           i % 3 == 0 && i % 5 == 0 -> "FizzBuzz";
           i % 3 == 0 -> "Fizz";
           i % 5 == 0 -> "Buzz"
           else -> i.toString();
       }
        list.add(item);
    }

    return list;
}