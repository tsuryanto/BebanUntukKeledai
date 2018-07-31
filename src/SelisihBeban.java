import java.util.Scanner;

public class SelisihBeban {

    private Scanner scanner;
    private int count, bebanKiri, bebanKanan;

    private SelisihBeban() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args){
        SelisihBeban selisihBeban = new SelisihBeban();
        do {
            selisihBeban.input();
        } while (true);
    }

    private void input(){
        int i = 0;

        String input = scanner.nextLine();
        String[] splited = input.split("\\s+");

        for (final String s : splited){
            int beban = Integer.valueOf(s);
            if (i == 0){
                bebanKanan = beban;
            } else {
                if ((bebanKanan - bebanKiri) > 0) {
                    bebanKiri = bebanKiri + beban;
                } else {
                    bebanKanan = bebanKanan + beban;
                }
            }
            i++;
        }

//        while (scanner.hasNextInt()){
//            int beban = scanner.nextInt();
//            if (i == 0){
//                bebanKanan = beban;
//            } else {
//                if ((bebanKanan - bebanKiri) < 0) {
//                    bebanKiri = bebanKiri + beban;
//                } else {
//                    bebanKanan = bebanKanan + beban;
//                }
//            }
//            i++;
//        }
        count++;
        output();
    }

    private void output(){
        System.out.print("\nBeban Kanan : " + bebanKanan);
        System.out.print("\nBeban Kiri : " + bebanKiri);
        System.out.print("\nh#" + count + " : " + Math.abs(bebanKanan-bebanKiri) + "\n\n");
        bebanKanan = bebanKiri = 0;
    }
}
