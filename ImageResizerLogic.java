public class ImageResizerLogic {
    public static int[] calculateNewDimensions(int originalWidth, int originalHeight, int newSize, boolean isWidthBased) {
        if (isWidthBased) {
            int newHeight = (originalHeight * newSize) / originalWidth;
            return new int[]{newSize, newHeight};
        } else {
            int newWidth = (originalWidth * newSize) / originalHeight;
            return new int[]{newWidth, newSize};
        }
    }
}

