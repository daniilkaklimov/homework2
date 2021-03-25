package lesson02;

public class Main {
    public static void main(String[] args) {
//Задание 1
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxArray = array.length;

        for (int i = 0; i < maxArray; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else array[i] = 1;
        for (int i = 0; i < maxArray; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
//Задание 2
        int[] numbers = new int[7];
        int maxNumbers = numbers.length;
        int j = 0;

        for (int i = 0; i < maxNumbers; ++i, j = j + 3) {
            array[i] = j;
            System.out.print(array[i] + " ");
        }
        System.out.println("");
//Задание 3
        int[] multiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int numbersMultuplication = multiplication.length;

        for (int i = 0; i < numbersMultuplication; i++) {
            if (multiplication[i] < 6)
                multiplication[i] = multiplication[i] * 2;
        }
        for (int i = 0; i < numbersMultuplication; i++) {
            System.out.print(multiplication[i] + " ");
        }
        System.out.println("");
//Задание 4
        int n = 4;
        int[][] twoDimenArray = new int[n][n];

        for (int i = 0; i < n; i++) {
            twoDimenArray[i][i] = 1;
            twoDimenArray[i][n - i - 1] = 1;
        }

    }
}

