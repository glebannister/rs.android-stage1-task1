package subtask5

import java.lang.StringBuilder

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val digitLength = digitString.length
        val stringBuilder = StringBuilder(digitString)
        var count = 0
        val maxInDigitString = digitString.max()
        var result = ""

     for (i in 0 until digitLength/2){
         if (digitString[i] != digitString[digitLength - i - 1]){
             stringBuilder[i] = maxInDigitString!!
             stringBuilder[digitLength - i - 1] = maxInDigitString
             result = stringBuilder.toString()
             count++
         }
         if (k < count){
             result = (-1).toString()
         }
     }
        return result
    }
}
