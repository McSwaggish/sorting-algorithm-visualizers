package sortingAlgoritmVisualizers

class RenderWindow(
    windowSize:       (Int, Int),
    title:            String,
    amountOfElements: Int
) {
    import introprog.PixelWindow
    
    val window: PixelWindow = new PixelWindow(windowSize._1, windowSize._2, title)
    val barWidth_plus_space: Int = (windowSize._1 / amountOfElements).toInt
    val offset: Int = ((windowSize._1 % amountOfElements) / 2).toInt

    def draw(x: Int, height: Int): Unit = {
        window.fill(x * barWidth_plus_space + offset, 720 - height * 7, barWidth_plus_space - 2, height * 7, java.awt.Color.white)
    }

    def highlightComparison(x: Int, height: Int): Unit = {
        window.fill(x * barWidth_plus_space + offset, 720 - height * 7, barWidth_plus_space - 2, height * 7, java.awt.Color(0xff, 0x00, 0x00))
    }
    
    def highlightSwap(x: Int, height: Int): Unit = {
        window.fill(x * barWidth_plus_space + offset, 720 - height * 7, barWidth_plus_space - 2, height * 7, java.awt.Color(0x00, 0xff, 0x00))
    }
}