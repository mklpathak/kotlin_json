fun main() {
    val array = intArrayOf(35, 50, 15, 25, 80, 20, 90, 45)
    quickSort(array, 0, array.size - 1)
    array.printRaw()
}

fun quickSort(array: IntArray, low: Int, high: Int) {
    if (low < high) {
        val pidx = partition(array, low, high)
        quickSort(array, low, pidx - 1)
        quickSort(array, pidx + 1, high)
    }
}

fun partition(array: IntArray, low: Int, high: Int): Int {
    val pivot = array[high]
    var i = low -1
    for (j in low until high) {
        if (array[j] < pivot) {
            i++
            //swap
            val temp = array[i]
            array [i] = array [j]
            array [j] = temp
         }
    }
    i++
    val temp = array[i]
    array [i] = pivot
    array [high] = temp
    return i;
}

