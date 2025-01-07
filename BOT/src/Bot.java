import java.util.Scanner;
public class Bot {

    public static void botWelcome() {
        System.out.println("Դուք հաջողությամբ մուտք եք գործել");
        System.out.println("Կխնդրեմ գրեք ձեր անունը");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        System.out.println("Դուք կապ եք հաստատել բոտի հետ: Տվեք ձեր հարցերը");

        while (true){
            String harc = sc.nextLine();
            switch (harc){
                case "ինչպես ես":
                    System.out.println("Շնորհակալություն, լավ եմ " + user);
                    System.out.println("Պատմիր քո մասին " + user);
                    break;

                case "ինչ պատմեմ":
                    System.out.println("Եթե չգիտես ինչ պատմես ուրեմն արի այսպես պայմանավորվենք, ես քեզ հարցեր տամ դու պատասխանիր լա՞վ");
                    break;

                case "լավ":
                    System.out.println("Քեզ հետաքրքրում է ծրագրավորումը");
                    break;

                case "այո":
                    System.out.println("Հիանալի է, բայց վերջ այսքանը շնորհակալություն ինձ հետ զրուցելու համար");
                    System.out.println("Ցանկանում ես իմանալ թե ինչ է ջավան, ուրեմն սեղմիր 1, եթե ոչ 2");
                    break;

                case "1":
                    System.out.println("Ծրագրավորման մեջ C++ ծրագրավորման լեզվի հեղափոխությունից հետո քչերն էին սպասում ավելի բեկումնային հեղափոխության, որը կատարեց Java-ն։ Կանխատեսելով շարժական էլեկտրոնային սարքերի լայն տարածումը, Sun-ը 1991–ին հիմնեց այդ ուղղությամբ զբաղվող ներքին կորպորատիվ հետազոտական նախագիծ, որը ստացավ Green անվանումը։ Նախագծի արդյունքում ստեղծվեց C/C++ վրա հիմնված ծրագրավորման լեզու, որին նրա ստեղծող Ջեյմս Գոսլինգը անվանեց Oak (կաղնի) ի պատիվ այն կաղնու, որը երևում էր նրա աշխատասենյակից։ Հետագայում հայտնաբերվեց, որ արդեն գոյություն ունի ծրագրավորման լեզու Oak անունով և Sun-ը նրան տվեց նոր անուն Java, որով էլ այն հետագայում ներկայացվեց հասարակությանը։ Այն անվանվել է ի պատիվ Java սուրճի տեսակի (որը այն ժամանակ շատ տարածված էր ծրագրավորողների շրջանում), որն էլ իր հերթին իր անվանումը ստացել է Ինդոնեզական Յավա կղզուց։ Sun-ի սպասված շարժական էլեկտրոնային սարքերի արագ առաջընթացը չէր ստացվում և նրա հրապարակումը ուշանում էր։ ՄիաԺամանակ համացանցը սկսել էր մեծ զարգացում ապրել և 1993 թվականին Sun-ի աշխատակիցները սկսեցին Java-ն համալրել համացանցում դինամիկ էջեր ստեղծելու ունակություններով։ Sun Microsystems-ը ներկայացրեց Java-ի առաջին տարբերակը՝ Java 1.0 1995 թ.-ին։ Java-ի երկրորդ տարբերակի հետ ( ներկայացվեց 1998 թ. Սեպտեմբերին որպես J2SE 1.2) նոր տարբերակները ունեին բազմաթիվ կոնֆիգուրացիաներ տարբեր տեսակի պլատֆորմների համար։ J2EE-ն ներառում տեխնոլոգիաներ սերվերների վրա աշխատող ծրագրերի համար, մինչդեռ J2ME- ն օպտիմիզացված էր շարժական պլատֆորմների համար։ Դեսկտոպ տարբերակը վերանվանվեց J2SE: 2006 թ. մարքեթինգային նկատառուներից ելնելով Sun-ը վերանվանեց J2-ի տարբերակները Java EE, Java ME և Java SE համապատասխանաբար։ Java-ն համարվում է փաստացի ստանդարտավորված, կառավարվում է JCP-ի կողմից (JCP – Java Community Process)։ 2006 թ. նոյեմբերի 13-ին Sun–ը ներկայացրեց Java-ի մեծ մասը որպես FOSS (Free and open source software), համապատասխան GNU- ի Հիմանական հասարակական լիցենզիայի (GPL – General Public License) սկզբունքների։ 2007 թ. մայիսի 8-ին Sun–ը վերջացրեց այդ պրոցեսսը։ Java ծրագրերը աշխատում են ամենուրեք, սկսած շարժական համակարգիչներից (laptops) մինչև տվյալների կենտրոններ ( data centers), խաղային կոնսոլներից մինչև գիտական սուպերհամակարգիչներ։ Java-ն օգտագործվում է դինամիկ պարունակությամբ վեբ էջեր, բազմատեսակ սպառողական ծրագրեր ստեղծելու, շարժական բազմապիսի էլեկտրոնային սարքերը ծրագրերով ապահովելու համար։");
                    System.out.println("Եթե ցանկանում ես ավել տեղեկություն իամանալ java ի մասին գրիր 3");
                    break;

                case "2":
                    System.out.println("Շնորհակալություն դու չցանկացար օգտվել տեղեկատվությունից, ցտեսություն");
                    break;

                case "3":
                    System.out.println("Ջավան (Java) պլատֆորմից անկախ, ընդհանուր նշանակության ծրագրավորման լեզու է, որը զուգահեռ, կլասսների վրա հիմնված, օբյեկտ – կողմնորոշված և հատուկ մշակված է, որպեսզի ունենա ինչքան հնարավոր է շատ իրագործումներ։ Այն նախատեսված է, որպեսզի «Գրվի մեկ անգամ, աշխատի ամենուր» (\"Write once, run anywhere\", WORA), որը նշանակում է, կոմպիլացված Java կոդը կարող է կատարվել բոլոր Java աջակցող պլատֆորմների վրա առանց նորից կոմպիլացվելու։ Java ծրագրերը կոմպիլացվում են բայթկոդ-ի, որոնք կարող են իրագործվել ցանկացած Java վիրտուալ մեքենայի (JVM) վրա, անկախ համակարգչային ճարտարապետությունից։ Մինչ 2015 թ. Java-ն հանդիսանում է ամենահայտնի օգտագործվող ծրագրավորման լեզուներից մեկը, մասնավորապես կլիենտ – սերվեր ծրագրերի համար, մոտ 9 միլլիոն գրանցված ծրագրավորողներով։ Java-ն ստեղծվել է Ջեյմս Գոսլինգի կողմից Sun Microsystems – ում (որը հետագայում Oracle կազմակերպությունը գնեց) և ներկայացվեց 1995 թ. որպես Java պլատֆորմի հիմնական մաս։ Այն ծրագրավորվել է C++-ի միջոցով։ Լեզվի սինտաքսիսը մեծ մասամբ համընկնում է C և C++ լեզուների հետ, բայց այն ունի ավելի քիչ ցածր – մակարդակի միջոցներ, քան նրանցից յուրաքանչյուրը։ Ի տարբերություն C++-ի Java-ն ունի նաև ինտեգրված լայն կլասսների գրադարան (օրինակ բազմապրոցեսային, համացանց, ֆայլային և այլն), որոնք ի շնորհիվ պլատֆորմային անկախության աշխատում են տարատեսակ օպերացիոն համակարգերում։ Որպեսզի Java լեզվով ստեղծված ծրագիրը կարողանա աշխատել ձեր համակարգչում կամ շարժական էլեկտրոնային սարքում, դուք պետք է ունենաք համապատասխան միջավայր՝ JRE (Java Runtime Environment)։ Օրիգինալ և ներդրված Java կոմպիլյատորների, վիրտուալ մեքենաների և կլասսների գրադարանի իրագործումը ի սկզբանե թողարկվել է Sun – ի պատենտավորված լիցենզիայի տակ։ 2007 թ. մայիսի դրությամբ, Sun – ը Java տեխնոլոգիայի մեծ մասի լիցենզիան փոխել է GNU General Public License:");
                    System.out.println("Շնորհակալություն ինձ հետ զրուցելու համար");
                    System.out.println("հաջողություն " + user);
                    break;

                case "ոչ":
                    System.out.println("Շատ ափսոս, շնորհակալություն այսքանը");
                    break;

                default:
                    System.out.println("Չհասկացա քեզ " + user);

            }

        }

    }

}

