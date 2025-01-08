public class Main {
    public static void main(String[] args) {

        char [] nisher = new char[78];
        int tiv = 0;

        for (int i = 1329; i < 1367; i++) {
            char tar = (char) i;
            nisher[tiv] = tar;
            tiv++;

        }
        for (int i = 1377; i <1416 ; i++) {
            char tar = (char) i;
            nisher[tiv] = tar;
            tiv++;
        }

        String banali = "297757417558945066731151821231477690301797232456221465718574631578954619599684524487486270674342275488264564376825288335728955926093796918323436399186403821";
        String haxord = "4189362152843448342732219189218493846027352139844521878936936721263284443284698932288435218472888432648936282138214879219148623589692164928432188435893628214828";

        String [] banaliM = new String[banali.length()/2];
        String  [] haxordM = new String[haxord.length()/2];
        nisher [tiv] = ' ';
        int c = 0;

        for (int i = 0; i <haxord.length() ; i++) {
            if (i%2 == 0 ){

                haxordM[c] = "" +haxord.charAt(i);
            } else {

                haxordM[c] += haxord.charAt(i);
                c++;

            }

        }
        c = 0;

        for (int i = 0; i <banali.length() ; i++) {
            if (i%2 == 0 ){

                banaliM[c] = "" +banali.charAt(i);
            } else {

                banaliM[c] += banali.charAt(i);
                c++;

            }

        }

        String patasxan = "";
        for (int i = 0; i < haxordM.length; i++) {
            for (int j = 0; j < banaliM.length; j++) {
                if (haxordM[i].equals(banaliM[j])){
                    patasxan += nisher[j];
                    break;
                }

            }

        }
        System.out.println(patasxan);
        for (String b:banaliM
        ) {
            System.out.print(b);
        }


    }
}
