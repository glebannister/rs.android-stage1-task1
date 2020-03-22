package subtask4

class StringParser {


    fun getResult(inputString: String): Array<String> {
        var resultArray = arrayListOf<String>()
        val stringBuilder = StringBuilder()
        for (i in inputString.indices) {
            if (inputString[i] == '[') {
                var count = 1
                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == '[') {
                        count++
                    }
                    if (inputString[j] == ']') {
                        count--
                        if (count == 0) {
                            resultArray.add(stringBuilder.toString())
                            stringBuilder.clear()
                            break
                        }
                    }
                    stringBuilder.append(inputString[j])
                }
            } else if (inputString[i] == '<') {
                var count2 = 1
                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == '<') {
                        count2++
                    }
                    if (inputString[j] == '>') {
                        count2--
                        if (count2 == 0) {
                            resultArray.add(stringBuilder.toString())
                            stringBuilder.clear()
                            break
                        }
                    }
                    stringBuilder.append(inputString[j])
                }
            } else if (inputString[i] == '(') {
                var count3 = 1
                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == '(') {
                        count3++
                    }
                    if (inputString[j] == ')') {
                        count3--
                        if (count3 == 0) {
                            resultArray.add(stringBuilder.toString())
                            stringBuilder.clear()
                            break
                        }
                    }
                    stringBuilder.append(inputString[j])
                }
            }
        }
        return resultArray.toTypedArray()
    }
}
