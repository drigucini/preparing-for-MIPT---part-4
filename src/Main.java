import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
    }

    public static int[][] getRandomValuesForMatrix(int[][] array) {
        int min = 0;
        int max = 5;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int)(Math.random()*(max-min+1)+min);
            }
        }
        return array;
    }
    public static double[][] getRandomValuesForMatrix(double[][] array) {
        int min = -100;
        int max = 100;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (Math.random()*(max-min+1)+min);
            }
        }
        return array;
    }

    public static int findMinInMatrix(int[][] array) {
        int min = array [0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static int findMaxInMatrix(int[][] array) {
        int max = array [0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static void task1 () {
        System.out.println("Task 1");
        int rows = 2;
        int columns = 4;
        int[][] array = new int[rows][columns];
        getRandomValuesForMatrix(array);

        System.out.println("The matrix is");
        System.out.println(Arrays.deepToString(array));

        System.out.println("The min value is " + findMinInMatrix(array));
    }

    public static void task2 () {
        System.out.println("\nTask 2");
        int rows = 6;
        int columns = 3;
        int[][] array = new int[rows][columns];
        getRandomValuesForMatrix(array);

        System.out.println("The matrix is");
        System.out.println(Arrays.deepToString(array));

        System.out.println("The max value is " + findMaxInMatrix(array));
    }



    public static void task3 () {
        System.out.println("\nTask 3");
        int rows = 4;
        int columns = 4;
        int[][] array = new int[rows][columns];
        getRandomValuesForMatrix(array);

        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < array[indexA][indexB]) {
                    indexA = i;
                    indexB = j;
                }
            }
        }
        System.out.println("The matrix is: ");
        System.out.println(Arrays.deepToString(array));

        System.out.println("The min value is " + findMinInMatrix(array));
        System.out.println("The indices of the min value are " + indexA + ", " + indexB);
    }

    public static void task4 () {
        System.out.println("\nTask 4");
        int rows = 5;
        int columns = 7;
        int[][] array = new int[rows][columns];
        getRandomValuesForMatrix(array);

        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > array[indexA][indexB]) {
                    indexA = i;
                    indexB = j;
                }
            }
        }
        System.out.println("The matrix is: ");
        System.out.println(Arrays.deepToString(array));

        System.out.println("The max value is " + findMaxInMatrix(array));
        System.out.println("The indices of the max value are " + indexA + ", " + indexB);
    }

    public static void task5 () {
        System.out.println("\nTask 5");
        int rows = 3;
        int columns = 3;
        int[][] array = new int[rows][columns];
        getRandomValuesForMatrix(array);

        int[][] arrayTemp = new int[rows + 2][columns + 2];

        for (int i = 1; i < arrayTemp.length - 1; i++) {
            for (int j = 1; j < arrayTemp[0].length - 1; j++) {
                arrayTemp[i][j] = array[i - 1][j - 1];
            }
        }

        System.out.println(Arrays.deepToString(arrayTemp));
        int counter = 0;
        for (int i = 1; i < arrayTemp.length - 1; i++) {
            for (int j = 1; j < arrayTemp[0].length - 1; j++) {
                if (arrayTemp[i][j] > arrayTemp[i + 1][j] && arrayTemp[i][j] > arrayTemp[i][j + 1]
                        && arrayTemp[i][j] > arrayTemp[i - 1][j] &&arrayTemp[i][j] > arrayTemp[i][j - 1]) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    public static void task6 () {
        System.out.println("\nTask 6");
        int rows = 4;
        int columns = 4;
        int[][] array = new int[rows][columns];
        getRandomValuesForMatrix(array);
        System.out.println(Arrays.deepToString(array));

        int[][] arrayFinal = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j) {
                    arrayFinal[i][j] = array[i][j];
                } else{
                    arrayFinal[i][j] = array[j][i];
                }
            }
        }
        System.out.println(Arrays.deepToString(arrayFinal));
    }

    public static void task7 () {
        System.out.println("\nTask 7");
        int rows = 4;
        int columns = 4;
//        double[][] array = new double[rows][columns];
//        getRandomValuesForMatrix(array);
        double[][] array = new double[][]{
            {1, 2, 2, 1},
            {2, 0, 3, 4},
            {10, 9, 9, 10}

        };
        System.out.println(Arrays.deepToString(array));


        System.out.println("\nTask 7a");
        Boolean[] vectorA = new Boolean[array[0].length];
        for (int j = 0; j < array[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            if (Math.abs(sum) < 1e-10) {
                vectorA[j] = true;
            } else {
                vectorA[j] = false;
            }
        }
        System.out.println(Arrays.deepToString(vectorA));

        System.out.println("\nTask 7b");
        Boolean[] vectorB = new Boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = 0; j < array[0].length - 1; j++) {
                if (array[i][j] < array[i][j + 1]) {
                    temp = 1;
                }

                if (temp == 0) {
                    vectorB[i] = true;
                } else {
                    vectorB[i] = false;
                }
            }
        }
        System.out.println(Arrays.deepToString(vectorB));

        System.out.println("\nTask 7c");
        Boolean[] vectorC = new Boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] != array[i][array[0].length - j - 1]) {
                    temp = 1;
                }
            }
            if (temp == 0) {
                vectorC[i] = true;
            } else {
                vectorC[i] = false;
            }
        }
        System.out.println(Arrays.deepToString(vectorC));
    }

    public static void task8 () {
        System.out.println("\nTask 8");
        int[][] array ={
                {1, 2, 2, 0, 9},
                {0, -9, 4, 9, 2},
                {-2, 3, 1, -3, -4}
        };

        System.out.println("Task a");
        Integer[] arrayA = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
            arrayA[i] = sum;
        }
        System.out.println(Arrays.deepToString(arrayA));

        System.out.println("Task b");
        Integer[] arrayB = new Integer[array.length];
        int n = array.length;
        int m = array[0].length;
        for (int i = 0; i < array.length; i++) {
            int mult = 1;
            for (int j = 0; j < array[0].length; j++) {
                mult *= array[i][j];
            }
            arrayB[i] = mult;
        }
        System.out.println(Arrays.deepToString(arrayB));

        System.out.println("Task c");
        Double[] arrayC = new Double[array.length];
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < m; j++) {
                sum += array[i][j];
            }
            arrayC[i] = sum/m;
        }
        System.out.println(Arrays.deepToString(arrayC));
    }

    public static void task9 () {
        System.out.println("\nTask 9");
        int[][] array ={
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };

        Integer[] min = new Integer[array.length];
        Integer[] max = new Integer[array[0].length];

        for (int i = 0; i < array.length; i++) {
            min[i] = array[i][0];
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < min[i]) {
                    min[i] = array[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(min));

        for (int j = 0; j < array[0].length; j++) {
            max[j] = array[0][j];
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] > max[j]) {
                    max[j] = array[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(max));

        int iAns = 0;
        int jAns = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == min[i] && array[i][j] == max[j]) {
                    iAns = i;
                    jAns = j;
                }
            }
        }
        System.out.println("Index: " + iAns + ", " + jAns);


    }

    public static void task10 () {
//        System.out.println("\nTask 10");
//        int[][] array = new int[5][7];
//        getRandomValuesForMatrix(array);
//        System.out.println("Input K");
//        Scanner scanner = new Scanner(System.in);
//        int k = scanner.nextInt();
//        if (k > 12 || k < 2) {
//            System.out.println("There is no solution");
//            return;
//        }
//
//        System.out.println(Arrays.deepToString(array));
//        double sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            int j = k - i - 2;
//            if (j >= 0 && j < array[0].length){
//                sum += array[i][j];
//                System.out.println("Indexes: " + i + ", " + j + ". Number: " + array[i][j]);
//            }
////            for (int j = 0; j < array[0].length; j++) {
////                if (i + j + 2 == k) {
////                    sum += array[i][j];
////                }
////            }
//        }
//
//        System.out.println("The sum of elements is: " + sum);
    }

    public static void task11 () {
        System.out.println("\nTask11");
        int[][] array = {
                {1, 2, 3, 4, 5},
                {0, -1, 5, 9, 9},
                {8, 7, 6, 100, 4}
        };

        int max = array[0][0];
        int indexI = 0;
        int indexJ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println("Index " + indexI + ", " + indexJ + "; Value " + max);


        for (int j = 0; j < array[0].length; j++) {
            int temp = array[0][j];
            array[0][j] = array[indexI][j];
                array[indexI][j] = temp;
            }
        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            int temp = array[i][0];
            array[i][0] = array[i][indexJ];
            array[i][indexJ] = temp;
        }
        System.out.println(Arrays.deepToString(array));
    }

    public static void task12 () {
        System.out.println("\nTask 12");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n:");
        int n = scanner.nextInt();
        System.out.println("Input array:");
        int[][] array = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                array[i][j] = scanner.nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(array));
        int temp = 1;
        for (int k = 0; k <= n/2; k++) {
            for (int i = k; i < n - k; i++) {
                array[k][i] = temp;
                temp++;
            }

            for (int i = k + 1; i < n - k; i++) {
                array[i][n - k - 1] = temp;
                temp++;
            }

            for (int i = n - 2 - k; i >= k; i--) {
                array[n - 1 - k][i] = temp;
                temp++;
            }

            for (int i = n - 2 - k; i > k; i--) {
                array[i][k] = temp;
                temp++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}