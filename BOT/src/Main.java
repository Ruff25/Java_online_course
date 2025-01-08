import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        welcome();
    }
    public static void welcome() {
        System.out.println("Բարի գալուստ");
        System.out.println("Գրեք 1 մուտք գործելու համար կամ 2 գրանցվելու համար");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if (c == 1) {
            login();
        } else if (c == 2) {
            registration();
        } else {
            System.out.println("Սծալ թիվ եք մուտք գործել,խնդրում ենք ընտրել 1 կամ 2");
            welcome();
        }
    }
    public static void welcome(String username, String pass, int age) {
        System.out.println("Բարի գալուստ");
        System.out.println("Գրեք 1 մուտք գործելու համար կամ 2 գրանցվելու համար");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if (c == 1) {
            login(username,pass,age);
        } else if (c == 2) {
            registration();
        } else {
            System.out.println("Սծալ թիվ եք մուտք գործել,խնդրում ենք ընտրել 1 կամ 2");
            welcome();
        }
    }

    public static void registration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Գրեք Ձեր մուտքանունը");
        String username = sc.nextLine();
        if (username.length() < 5) {
            System.out.println("Մուտքանունը պետք է պարունակի առնվազն 6 նիշ");
            registration();
        }
        System.out.println("Գրեք Ձեր գաղտնաբառը");
        String pass = sc.nextLine();
        if (pass.length() < 6) {
            System.out.println("Գաղտնաբառը պետք պարունակի առնվազն 8 նիշ");
            registration();
        }
        System.out.println("Գրեք ձեր տարիքը");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Գրանցվելու համար ձեր տարիքը բավարար չէ");
            registration();
        }
        welcome(username, pass, age);

    }
    public static void login() {
        System.out.println("Մուտք գործելու համար նախ և առաջ հարկավոր է գրանցվել");
        welcome();
    }
    public static void login(String username, String pass, int age){
        Scanner sc = new Scanner(System.in);
        System.out.println("Գրեք Ձեր մուտքանունը");
        String usernameForCheck = sc.nextLine();
        System.out.println("Գրեք Ձեր գաղտնաբառը");
        String passForCheck = sc.nextLine();
        System.out.println("Գրեք ձեր տարիքը");
        int tariqistugum = sc.nextInt();
        if (passForCheck.equals(pass) & usernameForCheck.equals(username) & tariqistugum >= 18)
            BOT.botWelcome();
        else {System.out.println("Սխալ եք Մուտք գործել, փորձեք կրկին");
            login(username,pass,age);
        }
    }
}