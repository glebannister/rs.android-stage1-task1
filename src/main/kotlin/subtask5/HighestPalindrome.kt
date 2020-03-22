package subtask5

import java.lang.StringBuilder

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val digitLength = digitString.length
        val stringBuilder = StringBuilder(digitString)
        var count = 0
        val maxInDigitString = digitString.max()

        for (i in 0 until digitLength / 2) {
            if (digitString[i] != digitString[digitLength - i - 1]) {
                if (maxInDigitString != null) {
                    stringBuilder[i] = maxInDigitString
                    stringBuilder[digitLength - i - 1] = maxInDigitString
                    count++
                }
            }
            if (count > k) {
                return (-1).toString()

            }
        }
        return stringBuilder.toString()
    }
}
