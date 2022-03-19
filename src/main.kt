fun main(){
    var x = arrayProduct(arrayOf(2,3,5))
    println(x)
    var y = sumOfDecimals(arrayOf("Bazz",5.86,64,20F,14.14,true,25.0))
    println(y)
    var z = arrayVowels(arrayOf('a','b','c','d','e','f','g'))
    println(z)

}
fun arrayProduct(numbers: Array<Int>): Int{
    var multiply = 1
    numbers.forEach { number->
        multiply *= number
    }
    return multiply
}
fun sumOfDecimals(nums: Array<Any>): Double{
    var sum = 0.0
    nums.forEach { num ->
        if(num is Double)
            sum += num
    }
    return sum
}

fun arrayVowels(vowels: Array<Char>): Int{
    var char = 0
    vowels.forEach { letter ->
    if(letter == 'a'||letter == 'a'||letter == 'e'||letter == 'i'||letter == '0'||letter == 'u')
        ++char
    }
    return char
}