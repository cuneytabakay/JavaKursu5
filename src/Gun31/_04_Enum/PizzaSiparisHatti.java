package Gun31._04_Enum;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    // TODO : Her pizza tipi için ücret belirleyerek toplam ücreti yazdırınız.

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        ArrayList<Pizza> siparisler=new ArrayList<>();

        int secim=0;
        do{
            // menu
            menu();
            secim = oku.nextInt();
            // scanner la secimi alalım
            // secilen pizza ArrayListe ekleyelim
            // eğer 4 ü seçerse arraylist i bir metoda gönder
            // orada hangi pizzadan kaç sipariş verdiğini göster
        }while(secim <= 4);
    }

    public static void menu()
    {
        System.out.println("******** Pizza Menü *******");
        System.out.println("1 - Small");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");
        System.out.println("4 - İşleme Al-Spiariş Göster");
        System.out.println("5 - Çıkış");
        System.out.print("Seciminiz=");
    }

}
