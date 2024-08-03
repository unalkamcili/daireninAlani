import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* kullanicidan r alınacak > daire alani bulunacak
        merkez açı ölçüsü kullanıcıdan alınacak, tam daierye oranlanıp küçük
        alanın degeri bulunacal

         */
        double r, merkezAci,pi=3.14,buyukAlan,cevre;
        Scanner inp =new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıçapını giriniz : ");
        r = inp.nextDouble();
        buyukAlan= pi*(r*r);
        cevre=2*pi*r;

        System.out.println("Dairenizin alanı : " + buyukAlan);
        System.out.println("Dairenizin çevresi : " + cevre);

        System.out.println("Lütfen küçük daire dilimiin merkez açısını giriniz : ");
        merkezAci = inp.nextDouble();
        double oran = 360/merkezAci,kucukAlan= buyukAlan/oran;

        System.out.println("Daire dilimizin alanı : " + kucukAlan);








    }
}