package sortingAlgoritmVisualizers

object Bogosort {
    def sort(elements: Int): Unit = {
        val elements: Int = 3

        val window = new RenderWindow((1280, 720), "Bubble Sort", elements)
        //var noSwaps: Boolean = false
        
        val initVec:   Seq[Int]    = for(i <- 0 until elements) yield (math.random() * 100).toInt
        val xs:        Array[Int]  = initVec.toArray
        
        def drawEverything(): Unit =
            for i <- 0 until xs.length do
                window.draw(i, xs(i))

        //drawEverything()
        
        var xl = xs

        while(!(xl == xs.sorted)){
            val xl = scala.util.Random.shuffle(xs)
            //println(s"${xl(0)}, ${xl(1)}, ${xl(2)}")
            //println(s"${xs.sorted(0)}, ${xl(1)}, ${xl(2)}")
            Thread.sleep(200)
        }

        println("DONE !")
        
    }
}