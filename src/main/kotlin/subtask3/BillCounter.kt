package subtask3

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val string = "Bon Appetit"
        val totalSum = bill.sum()
        val annaAllergic = bill[k]
        val annaSum = (totalSum - annaAllergic) / 2
        return if (annaSum == b){
            string
        } else {
            (b - annaSum).toString()
        }
    }
}
