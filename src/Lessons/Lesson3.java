package Lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        int[] mussiv = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mussiv.length; i++) {
            if (mussiv[i] == 1) {
                mussiv[i] = 0;
            } else {
                mussiv[i] = 1;
            }
        }

        for (int i = 0; i < mussiv.length; i++) {
            System.out.print(mussiv[i] + " ");
        }
        System.out.println();


        int[] massiv = new int[100];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = i + 1;
        }
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println();

        int[] arrayLoop = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayLoop.length; i++) {
            if (arrayLoop[i] < 6) {
                arrayLoop[i] *= 2;
            }


        }
        for (int i = 0; i < arrayLoop.length; i++) {
            System.out.print(arrayLoop[i] + " ");
        }
        System.out.println();

        int[][] arrayDouble = new int[5][5];
        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i][i] = 1;
        }

        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i][arrayDouble.length - 1 - i] = 1;
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            for (int a = 0; a < arrayDouble[0].length; a++) {
                System.out.print(arrayDouble[i][a] + " ");
            }
            System.out.println();
        }
        System.out.println();


        int[] j = twoArguments(15, 6);
        for (int i = 0; i < j.length; i++) {
            System.out.print(j[i] + " ");

        }
        System.out.println();
    }

        public static int[] twoArguments ( int len, int initialValue) {
            int[] l = new int[len];
            for (int i = 0; i < l.length; i++) {
                l[i] = initialValue;
            }
            return l;
        }

}
