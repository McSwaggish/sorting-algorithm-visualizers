package sortingAlgoritmVisualizers

object Main {
    def main(args: Array[String]): Unit = {
        print("\u001b[2J\u001b[;H")

        println("Choose algorithm:")
        println(" [1] Bubble sort")
        println(" [2] Insertion sort")
        println(" [3] Bogosort")

        print("\nChoice: ")
        val algorithmChoice: Int = scala.io.StdIn.readInt()
        print("Amount of elements: ")
        val elements:        Int = scala.io.StdIn.readInt()

        if algorithmChoice == 1
            then BubbleSort.sort(elements)
        else if algorithmChoice == 2
            then InsertionSort.sort(elements)
        else if algorithmChoice == 3
            then Bogosort.sort(elements)
    }
}