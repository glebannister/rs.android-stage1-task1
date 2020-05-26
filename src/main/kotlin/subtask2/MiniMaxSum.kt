package subtask2

class MiniMaxSum {


    fun getResult(input: IntArray): IntArray {
        var sum = 0
        val minInInput = input.min()
        val maxInInput = input.max()
        for (i in input){
            sum+= i
        }
        return intArrayOf(sum - maxInInput!!, sum - minInInput!!)
    }
}
