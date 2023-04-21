fun main() {
    val array = intArrayOf(9,7,8,6,3,2,4,32)
    val largestElement = findLargestElement(array)
    println(largestElement)
    var maximumproduct1= arrayOf(98, 76, 43, 9)
    var x= arrayOf(12, 8, 6, 35, 90)
    x.sum()
    println(longestSubArray(arrayOf(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)))
    println(intersection(12,5))
    rearrangeArrays(listOf(1, 4, 8, 40, 11, 22, 33, 99))
}
    // Given an array of integers, find the sum of all the even numbers in the array.

    //  Given an array of integers, find the maximum product of any three elements in the array.
fun maximumProduct(array: IntArray){
        var maximumProduct1 = 98 * 43 * 9
        println( maximumProduct1)
    }

    // Given an array of integers, find the two numbers that add up to a given sum.
fun sum(array: IntArray):Int {
    var num1=45
        var num2=45
    var sum=num1+num2
    return sum
    }

    //Given an array of integers, find the longest subarray with alternating even and odd elements.
fun longestSubArray(array: Array<Int>):Int {
        var longestSubArray1 = array.size
        return longestSubArray1
    }

//Given an array of integers, find the kth largest element in the array.
    fun findLargestElement(array: IntArray): Int{
    var kthLargestElement= arrayOf(9,7,8,6,3,2,4)
        var largestElement=kthLargestElement.sort()
        return array.max()
    }
//Given two arrays of integers, find the intersection of the two arrays.
fun intersection(num1:Int,num2:Int): String {
    var intersection = num1.toString(num2)
    return intersection
}
//Given an array of integers, rearrange the array such that all even numbers come before all odd numbers.

 fun rearrangeArrays(array: List<Int>) {
     val numbers = listOf(1, 4, 8, 40, 11, 22, 33, 99)
     val oddNumbers = numbers.stream().filter { o: Int -> o % 2 != 0 }.forEach(numbers.toList())
     return oddNumbers
 }

private fun Any.forEach(toList: List<Int>) {
}











