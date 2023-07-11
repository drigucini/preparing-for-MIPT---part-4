import java.util.Arrays;

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
        int min = -100;
        int max = 100;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int)(Math.random()*(max-min+1)+min);
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
        System.out.println("\nTask 7a");
        int rows = 4;
        int columns = 4;
        int[][] array = new int[rows][columns];
        getRandomValuesForMatrix(array);
        System.out.println(Arrays.deepToString(array));

        int[] vectorA = new int[columns];
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {

            }
        }

        System.out.println("\nTask 7b");
    }

    public static void task8 () {
        System.out.println("\nTask 8");
    }

    public static void task9 () {
        System.out.println("\nTask 9");
    }

    public static void task10 () {
        System.out.println("\nTask 10");
    }

    public static void task11 () {
        System.out.println("\nTask11");
    }

    public static void task12 () {
        System.out.println("\nTask 12");
    }
}