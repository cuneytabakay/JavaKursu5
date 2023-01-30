package Gun32._03_Encapsulation;

import java.util.Scanner;
public class Kampus {
    public static void main(String[] args) {

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        Okul yeniOkul=new Okul("Kabataş Okulu", 3); // maxOgr 3

        do{

        }while(yeniOkul.getOgrenciler().size() < yeniOkul.getKontenjan()    );

    }
}
