package sortingAlgoritmVisualizers

object InsertionSort {
    def sort(elements: Int): Unit = {
        val window = new RenderWindow((1280, 720), "Insertion sort", elements)

        val initVec: Seq[Int]   = for (i <- 0 until elements) yield (math.random() * 100).toInt
        val xs:      Array[Int] = initVec.toArray

        def swap(a: Int, b: Int): Unit =
            val temp: Int = xs(a)
            xs(a)  = xs(b)
            xs(b)  = temp

        def drawEverything(): Unit =
            for i <- 0 until xs.length do
                window.draw(i, xs(i))
        
        def drawCompaison(j: Int): Unit =
            window.clear()
            drawEverything()
            window.highlightComparison(j - 1, xs(j - 1))
            window.highlightComparison(j, xs(j))
            Thread.sleep(7)
        
        def drawSwap(j: Int): Unit =
            window.clear()
            drawEverything()
            window.highlightSwap(j - 1, xs(j - 1))
            window.highlightSwap(j, xs(j))
            Thread.sleep(7)
        

        drawEverything()
        Thread.sleep(1500)
        
        for i <- 1 until xs.length do {
            var j = i
            while j > 0 && xs(j - 1) > xs(j) do
                drawCompaison(j)
                swap(j, j - 1)
                drawSwap(j)
                j -= 1
        }

        window.clear()
        drawEverything()

        window.highlightOrder(xs)
        
    }
}