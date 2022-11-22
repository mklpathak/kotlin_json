fun IntArray.mergeSort() : IntArray {
   mergeSort(this,0,this.size-1)
    return this
}

fun mergeSort(a: IntArray, leftIndex: Int, rightIndex: Int) {

    if (leftIndex < rightIndex) {
        val mid = (leftIndex + rightIndex) / 2
        mergeSort(a, leftIndex, mid)
        mergeSort(a, mid + 1, rightIndex)
        merge(a, leftIndex, mid, rightIndex)
    }

}

fun merge(a: IntArray, leftIndex: Int, mid: Int, rightIndex: Int) {

    val n1 = mid-leftIndex+1
    val n2 = rightIndex-mid
    val tempLeftArray = IntArray(n1)
    val tempRightArray = IntArray(n2)

    for (i in 0 until  n1) {
        tempLeftArray [i] = a[leftIndex+i]
    }
    for (i in 0 until  n2) {
        tempRightArray [i] = a[mid+1+i]
    }

    var i = 0
    var j = 0
    var k = leftIndex

    while (i < n1 && j < n2) {
        if(tempLeftArray[i] < tempRightArray [j]) {
            a[k] = tempLeftArray[i]
            i++
        }else {
            a[k] = tempRightArray[j]
            j++
        }
        k++
    }

    while (i < n1) {
        a[k] = tempLeftArray[i]
        i++
        k++
    }

    while (j < n2) {
        a[k] = tempRightArray[j]
        j++
        k++
    }

}

