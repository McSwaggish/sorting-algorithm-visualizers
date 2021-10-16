package sortingAlgoritmVisualizers

object Bogosort {
    def sort(elements: Int): Unit = {

        val window = new RenderWindow((1280, 720), "Bogosort", elements)
        var looping: Boolean = true

        val initVec:   Seq[Int]    = for(i <- 0 until elements) yield (math.random() * 100).toInt
        val xs:        Array[Int]  = initVec.toArray
        var finale:    Array[Int]  = initVec.toArray
        
        def drawEverything(ys: Array[Int]): Unit =
            for i <- 0 until ys.length do
                window.draw(i, ys(i))

        window.window.show()
        drawEverything(xs)
        Thread.sleep(1500)

        while(looping) {
            val xl: Array[Int] = scala.util.Random.shuffle(xs).toArray
            window.window.clear()
            drawEverything(xl)
            Thread.sleep(14) 

            if xl.toVector == xs.sorted.toVector
                then looping = false
                     finale = xl
        }

        window.highlightOrder(finale)
    }
}