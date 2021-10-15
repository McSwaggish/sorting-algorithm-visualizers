package sortingAlgoritmVisualizers

object BubbleSort {

    /* val initVec = for(i <- 0 until 10) yield (math.random() * 100).toInt
    val theThingy: Array[Int] =
        initVec.toArray

    def swap(a: Int, b: Int): Unit = {
        val temp: Int = theThingy(a)
        theThingy(a) = theThingy(b)
        theThingy(b) = temp
    }

    def bubbleSort(xs: Array[Int]): Array[Int] = {
        val n:       Int     = xs.length
        var noSwaps: Boolean = false

        while(!noSwaps)
            noSwaps = true
            for j <- 0 until n - 1 do
                if xs(j) > xs(j + 1) then
                    swap(j, j + 1)
                    noSwaps = false

        xs
    }


    def main(THIS_FUNCTION_IS_TEMPORARY_TEST: Array[String]): Unit = {
        for i <- theThingy.indices do
            print(s"${theThingy(i)}, ")
        
        val xl: Array[Int] = bubbleSort(theThingy)
        
        print(s"\n\n")

        for i <- xl.indices do
            print(s"${xl(i)}, ")
    } */


    def main(penis: Array[String]): Unit = {
        val elements: Int = 25

        val window = new RenderWindow((1280, 720), "Bubble Sort", elements)
        var noSwaps: Boolean = false
        
        val initVec:   Seq[Int]    = for(i <- 0 until elements) yield (math.random() * 100).toInt
        val theThingy: Array[Int]  = initVec.toArray
        
        def swap(a: Int, b: Int): Unit =
            val temp: Int = theThingy(a)
            theThingy(a)  = theThingy(b)
            theThingy(b)  = temp

        def drawEverything(): Unit =
            for i <- 0 until theThingy.length do
                window.draw(i, theThingy(i))
        
        drawEverything()
        Thread.sleep(1500)

        def updateComparasin(i: Int): Unit =
            window.window.clear()
            drawEverything()
            window.highlightComparasin(i, theThingy(i))
            window.highlightComparasin(i + 1, theThingy(i + 1))
        
        def updateSwap(i: Int): Unit =
            window.window.clear()
            drawEverything()
            window.highlightSwap(i, theThingy(i))
            window.highlightSwap(i + 1, theThingy(i + 1))

        while(!noSwaps) {
            noSwaps = true
            for i <- 0 until theThingy.length - 1 do
                updateComparasin(i)
                if theThingy(i) > theThingy(i + 1) then
                    Thread.sleep(7)
                    swap(i, i + 1)
                    noSwaps = false
                    updateSwap(i)
                    Thread.sleep(7)
                else
                    window.window.clear()
                    drawEverything()
                    Thread.sleep(14)
        }

        for i <- 0 until theThingy.length do
            window.highlightComparasin(i, theThingy(i))
            Thread.sleep(25)
            window.highlightSwap(i, theThingy(i))
            Thread.sleep(25)

        println("DONE !")


    
    }
}