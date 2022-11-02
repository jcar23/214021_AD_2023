public class CharacterDrawingUtilities {
    public static void drawElements(char c){
        System.out.print(c);
    }
    public static void drawNewLine() {
        System.out.println(" ");
    }
    public static void drawHorizontalSegmentWith(char c, int width){
        for (int i = 0; i < width ; i++) {
            drawElements(c);
        }
    }
    public static void drawHorizontalEmptySegmentWith(char c, int width){
        for (int i = 0; i < width; i++) {
            if (i == 0 || i == width-1) {
                drawElements(c);
            }
            else {
                drawElements(' ');
            }
        }
    }
    public static void drawFilledRectangleWith(char c, int width, int height) {
        for (int i = 0; i < height; i++) {
            drawHorizontalSegmentWith(c,width);
            drawNewLine();
        }
    }


    public static void drawEmptyRectangleWith(char c, int width, int height) {
        for (int i = 0; i  < height; i++) {
            if(i == 0 || i== height -1){
                drawHorizontalSegmentWith(c,width);
            }
            else {
                drawHorizontalEmptySegmentWith(c,width);
            }
            drawNewLine();
        }
    }
}
