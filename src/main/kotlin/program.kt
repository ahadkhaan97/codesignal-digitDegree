fun main() {
    print(solution(100))
}

fun solution(n: Int): Int {
    var numString = n.toString()
    var counter = 0
    while (numString.length > 1) {
        counter++
        numString = sum(numString)
    }
    return counter
}

fun sum(number: String): String {
    var sum = 0
    for (i in number) {
        sum += i.digitToInt()
    }
    return sum.toString()
}
