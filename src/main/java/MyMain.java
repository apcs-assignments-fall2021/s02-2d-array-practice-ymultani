

public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int count = 0;
        for (int[] x : mat) {
            for (int y : x) {
                if (y % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int index = mat[0][0];
        for (int[] x : mat) {
            for (int y : x) {
                if (y > index) {
                    index = y;
                }
            }
        }
        return index;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        for (int[] z : mat) {
            int temp = z[0];
            for (int i = 1; i < z.length; i++) {
                z[i - 1] = z[i];
            }
            z[z.length - 1] = temp;
        }
        return mat;

    }

    // Creates a new array list of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int[][] sumIndex = new int[arraySize][arraySize];
        for (int row = 0; row < sumIndex.length; row++) {
            for (int column = 0; column < sumIndex[0].length; column++) {
                sumIndex[row][column] = row + column;
            }
        }
        return sumIndex;
    }


    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double sum = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int column = 0; column < mat[0].length; column++) {
                sum += mat[row][column];
            }
        }
        return sum / (mat.length * mat[0].length);
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        int i = 0;
        double[] replicate = new double[mat.length * mat[0].length];

            for (int row = 0; row < mat.length; row++) {
                for (int column = 0; column < mat[0].length; column++) {
                    replicate[i] = mat[row][column];
                    i++;
                }
            }


        if (replicate.length % 2 == 0) {
            return (replicate[(replicate.length / 2) - 1] + replicate[(replicate.length / 2)]) / 2;
        }
        return replicate[replicate.length / 2];


    }




    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        int i = 0;
        double[] copy = new double[mat.length * mat[0].length];
        for (int row = 0; row < mat.length; row++) {
            for (int column = 0; column < mat[0].length; column++) {
                copy[i] = mat[row][column];
                i++;
            }
        }
        double mode = 0.0;
        int indexCounter = 0;

        for(double potMode : copy){
            int counter = 0;
            for(double index : copy){
                if(potMode == index){
                    counter++;
                }
            }
            if(counter > indexCounter){
                indexCounter = counter;
                mode = potMode;
            }
        }
        return mode;

    }




    public static void main(String[] args) {

    }
}
