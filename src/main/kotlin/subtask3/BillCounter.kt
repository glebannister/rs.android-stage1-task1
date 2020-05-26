package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var result: String
        val BonAppetit = "Bon Appetit"
        val totalSum = bill.sum()
        val annaAllergic = bill[k]
        val annaSum = (totalSum - annaAllergic) / 2
        if (annaSum == b){
            result = BonAppetit
        } else {
            result = (b - annaSum).toString()
        }
        return result
    }
}
