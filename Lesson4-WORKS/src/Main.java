public class Main {
    public static void main(String[] args) {
        System.out.println("Print numbers from 1 to 15");
        for (int i = 1; i <= 15; i++) {
            System.out.println(i);
        }

        System.out.println("Print even numbers from 1 to 20");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Print * symbols using given number");
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Print * symbols using given number");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Print * symbols using given number");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println(); // ciklic durs e galis u tpum hajord toxin@
        }

        System.out.println("\n\n Create an array with number 1-11");
        int[] array = new int[11];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\n Create an array with even numbers from -10 to 10");
        int[] array2 = new int[11];

        for (int i = 0, j = -10; i < array2.length; i++, j += 2) {
            array2[i] = j;
            System.out.print(array2[i] + " ");
        }

        System.out.println("\n\n Given an array. print count of odd elements");
        int[] array3 = {3, 4, 9, 11, 99, 87, 11, 65, 54, 48, 69, 99};

        for (int a : array3) {
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
        }

        System.out.println("\n\n Given an array. print elements from -10 to 5");
        for (int a : array3) {
            if (a >= -10 && a <= 5) {
                System.out.print(a + " ");
            }
        }

        System.out.println("\n\n Given an array. print elements which can be divided 3 or 4");
        for (int a : array3) {
            if (a % 3 == 0 || a % 4 == 0) {
                System.out.print(a + " ");
            }
        }

        System.out.println("\n\n Given an array. print count of even elements");
        int countOfEvens = 0;

        for (int a : array3) {
            if (a % 2 == 0) {
                countOfEvens++;
            }
        }
        System.out.println(countOfEvens);

        array3 = new int[]{4, 2, 9, 3, 11, 5, 8};

        System.out.println("\n\n Given an array. print sum of elements");
        int sum = 0;

        for (int i = 0; i < array3.length; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("\n\n Given an array. print sum of positive elements");
        sum = 0;

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > 0) {
                sum += array3[i];
            }
        }
        System.out.println(sum);


        System.out.println("\n\n Given an array. print multiplication of positive elements");
        int m = 1;

        for (int i = 0; i < array3.length; i++) {
            m *= array3[i];
        }

        System.out.println(m);

        System.out.println("\n\n Find maximal element from array");
        int max = array3[0];

        for (int i = 1; i < array3.length; i++) {
            if (array3[i] > max) {
                max = array3[i];
            }
        }
        System.out.println(max);

        System.out.println("\n\n Find minimal element from array");
        int min = array3[0];

        for (int i = 1; i < array3.length; i++) {
            if (min > array3[i]){
                min = array3[i];
            }
        }
        System.out.println(min);

        System.out.println("\n\n Find element which is alone");
        array = new int[]{4, 5, 7, 6, 4, 5, 7, 6, 9};
        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            result = result ^ array[i];
        }
        System.out.println(result);



        System.out.println("\n\n Sort array in asc");
        array = new int[]{4, 1, 5, 5, 3, 77, 55, 98, 12, -1};

        boolean IfIn = true;

        int countOfFors = 0;
        while (IfIn) {
            IfIn = false;
            for (int i = 0; i < array.length - 1 - countOfFors; i++) {
                if (array[i] > array[i + 1]) {
                    int z = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = z;
                    IfIn = true;
                }
            }
            countOfFors++;
        }

        System.out.println();
        System.out.println(countOfFors);

        for (int a : array) {
            System.out.print(a + " ");
        }











    }
}