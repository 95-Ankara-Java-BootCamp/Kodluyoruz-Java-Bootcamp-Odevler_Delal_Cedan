package SecondWeek;

import java.util.*;

/**
 * Bir kirtasiye dükkanina mal geliyor.
 * Kýrtasiyeci kalem, silgi gibi malzemelerin kaydini sisteme girecek.
 * soru 1: Toplam kaç adet mal aldi.
 * soru 2: Hangi maldan kaç adet aldi.
 * soru 3: Kac çesit mali var.
 */

public class Kirtasiye {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            // soru 1: Toplam kaç adet mal aldi.

            List<String> depo = new ArrayList<>();
            while (true) {
                System.out.println("Meyve giriniz : ");
                String goods = scan.nextLine();
                if (goods.equals("cikis")) {
                    break;
                }
                depo.add(goods);
            }
            System.out.println("Toplam kaç adet ürün aldı ? " + depo.size());


//        HashMap<Integer , String> hashMapMal = new HashMap();
//       hashMapMal.get(depo);
//        String value = hashMapMal.get(depo);
//        System.out.println(" " +value);


            //  soru 3: Kac çesit mali var.
            HashSet<Object> hashSet = new HashSet<>(depo);
            System.out.println("Kaç çeşit ürünü var? " + hashSet.size());
        }

}






