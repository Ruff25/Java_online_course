public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Wolrd!!");
        System.out.println("Hello Wolrd!!");

        int a = 4, b = 2;
        int c = a + b;
        System.out.println("a + b =" + " " + c);
        c = a - b;
        System.out.println("a - b =" + " " + c);
        c = a * b;
        System.out.println("a * b =" + " " + c);
        c = a / b;
        System.out.println("a / b =" + " " + c);
        System.out.println(a % b); // mnacordner cuyc talis

        int x = 5 + 1;
        x += 1;
        x++;
        ++x;
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);


        x = 4;
        c = 5;
        b = x++ - --c; //b = 4 - --c b in veragreluc heto ye x++ anum
        System.out.println("x = " + x);
        System.out.println("c = " + c);
        System.out.println("b = " + b);

        // ++ increment
        // -- decrement

        boolean bb = x == 5;
        System.out.println(bb);
        System.out.println(x != 6);
        System.out.println(x > 0 && x < 10); // && i depqum ete ka false misht false e tpelu

        boolean vv = false;
        System.out.println(!vv);


        System.out.println(5&6); //hashvel erkuakan@ bazmapatkel heto stacac@ veracel tasakani
        System.out.println(5|6); //hashvel erkuakan@ gumarel heto stacac@ veracel tasakani
        System.out.println(5^6); //XOR


    }
}