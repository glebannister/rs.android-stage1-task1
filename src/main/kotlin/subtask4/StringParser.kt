package subtask4

class StringParser {

    private val stringBuilder = StringBuilder()
    val resultArray = arrayListOf<String>()

    fun getResult(inputString: String): Array<String> {
        for (i in inputString.indices){
            getSymbols(inputString, i,'<', '>')
            getSymbols(inputString, i,'(', ')')
            getSymbols(inputString, i,'[', ']')
        }
        return resultArray.toTypedArray()
    }

    private fun getSymbols(inputString: String, i:Int, symbolFirst: Char, symbolLast: Char) {

            if (inputString[i] == symbolFirst) {
                var count = 1
                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == symbolFirst) {
                        count++
                    }
                    if (inputString[j] == symbolLast) {
                        count--
                    }
                    if (count == 0) {
                        resultArray.add(stringBuilder.toString())
                        stringBuilder.clear()
                        break
                    }
                    stringBuilder.append(inputString[j])
                }
            }

    }
}
