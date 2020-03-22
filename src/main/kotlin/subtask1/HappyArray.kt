package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var j = 1
        val happyList = sadArray.toMutableList()

        while (j < happyList.size - 1) {
            if ( j != 0 && happyList[j] > happyList[j + 1] + happyList[j - 1]) {
                happyList.removeAt(j)
                j --
            } else {
                j ++
            }
        }
        return happyList.toIntArray()
    }
}
