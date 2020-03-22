package subtask2

class MiniMaxSum {


    fun getResult(input: IntArray): IntArray {
        var sum = 0
        var minInInput = input.min()
        var maxInInput = input.max()
        for (i in input){
            if (i < minInInput!!){
                minInInput = i
            } else if (i > maxInInput!!){
                maxInInput = i
            }
            sum +=i
        }
        return intArrayOf(sum - maxInInput!!, sum - minInInput!!)
    }
}
