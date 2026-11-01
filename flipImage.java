import java.util.Arrays;

class flipImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int[] row : image) {
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                if (row[left] == row[right]) {
                    row[left] ^= 1;
                    if (left != right) {
                        row[right] ^= 1;
                    }
                }
                left++;
                right--;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        flipImage solver = new flipImage();
        
        int[][] testImage = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };

        System.out.println("Original Image: " + Arrays.deepToString(testImage));
        
        // Run the algorithm
        int[][] result = solver.flipAndInvertImage(testImage);
        
        System.out.println("Flipped & Inverted: " + Arrays.deepToString(result));
    }
}
