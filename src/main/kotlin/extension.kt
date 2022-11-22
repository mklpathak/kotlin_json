fun IntArray.printFormatted() {
    this.forEachIndexed { i,j ->
        print("Element at : $i => $j \n")
    }
}

fun IntArray.printRaw() {
    var string = "["
    this.forEachIndexed {
        i,j ->
        if (i != this.size-1) {
            string += "$j,"
        }else {
            string += "$j"
        }
    }
    string += "]"
    print(string)
}


