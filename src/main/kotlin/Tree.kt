class Tree {
    private var rootNode: Node? = null

    fun add(data: Int) {
        rootNode?.let {
            add(data,it)
        } ?: kotlin.run {
            rootNode = Node(data)
        }
    }

    fun inOrderTraverse() {
        rootNode?.let { inOrderTraverse(it) } ?: print("Root is empty")
    }

    fun preOrderTraverse() {
        rootNode?.let { preOrderTraverse(it) } ?: print("Root is empty")
    }

    fun postOrderTraverse() {
        rootNode?.let { postOrderTraverse(it) } ?: print("Root is empty")
    }

    private fun add(data: Int, node: Node) {
        if (node.data < data) {
            if (node.rightNode != null) {
                add(data, node)
            } else {
                node.rightNode = Node(data)
            }
        } else {
            if (node.leftNode != null) {
                add(data, node.leftNode!!)
            } else {
                node.leftNode = Node(data)
            }
        }
    }

    private fun search(data: Int, node: Node) {
        if (node.data != data) {

        }
    }

    private fun inOrderTraverse(node: Node) {
        rootNode?.leftNode?.let {
            inOrderTraverse(it)
        }
        print(rootNode?.data)
        rootNode?.rightNode?.let {
            inOrderTraverse(it)
        }
    }

    private fun preOrderTraverse(node: Node) {
        print(node.data)
        node.leftNode?.let {
            preOrderTraverse(it)
        }
        node.rightNode?.let {
            preOrderTraverse(it)
        }
    }

    private fun postOrderTraverse(node: Node) {
        node.leftNode?.let {
            inOrderTraverse(it)
        }
        node.rightNode?.let {
            inOrderTraverse(it)
        }
        print(node.data)
    }


    private class Node(
        val data: Int,
        var leftNode: Node? = null,
        var rightNode: Node? = null
    )
}

