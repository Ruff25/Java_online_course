public class Main {
    public static void main(String[] args) {
        int[] a = new int[8];
        // zangvacum tver@ difolt 0 en
        System.out.println(a[4]);
        a[0] = 5;
        a[1] = 25;
        a[3] = -5;
        a[4] = 66;
        a[7] = 55;
        System.out.println(a[0] + a[4]);
        System.out.println(a.length); // arayi erkarutyun@
        System.out.println(a[0] + a[a.length - 1]); // ankax nra chapseric misht veradarcnelu e verjin ev arajin tveri gumar@

        int[] array = {4, 1, 5, -98, 0, 8, 9}; // ete haytni en elementi skzbnakan arjeqner@ grum enq asys dzevov
        System.out.println(array[array.length - 1]);

        int[] x;
        x = new int[]{5, 4, 6, 8};

        int c = 5;

        if (c > 0) {
            System.out.println("Barev");
        } else {
            System.out.println("hajox");
        }


        int b;
        b = c > 0 ? 1 : 0;
        System.out.println(b);
        System.out.println(c > 0 ? "Positie" : "Non Positive");
        System.out.println(c > 0 ? "Positie" : c < 0 ? "Negative" : "Zero");

        int counter = 1;


        while (counter < 11) {
            System.out.print(counter + " ");
            counter++;
        }

        counter = 1;

        do {
            System.out.println("barev"); // do n skzbic e gorcum heto nor nayum paymanin
            counter++;
        } while (counter <= 4);

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }


        System.out.println("\n---------------------------");
        String[] names = {"Hayk", "Anna", "Ani", "Mariam"};

        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i]);
        }

        for (int i = 0; i < names.length; i += 2) {
            System.out.println(names[i]);
        }

        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 00) {
                System.out.println(names[i]);
            }
        }

        System.out.println("-----------------------------------------------");

        for (String s : names) { //sa cikle hatuk zangvacneri hamar
            System.out.println(s); // aveli hesht greladzeve ete ashxatum en 0-minchev verj
        }

        for (int i = 0; i <= names.length - 1; i++) {  // sa verevi nuyn ciklne bacvac dzevov
            String s = names[i];
            System.out.println(names[i]);
        }

        System.out.println("-----------------------------------------------");

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        System.out.println("-----------------------------------------------");

        int[] array2 = {4, -8, 4, 1, 3, -1};

        for (int element : array2) {
            if (element < 0) {
                System.out.println("ayo");
                break; // @ndhatum enq cikl@
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Եթե i == 5, այս ցիկլը կանցնի հաջորդին:
            }
            System.out.println(i); // Այս տողը կաշխատի միայն եթե i != 5:
        }

    }
}