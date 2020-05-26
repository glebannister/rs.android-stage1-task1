package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var j = 1
        val happyArray = sadArray.toMutableList()

        while (j < happyArray.size - 1) {
            if ( j != 0 && happyArray[j] > happyArray[j + 1] + happyArray[j - 1]) {
                happyArray.removeAt(j)
                j --
            } else {
                j ++
            }
        }
        return happyArray.toIntArray()
    }
}
