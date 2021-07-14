package SecondWeek;

import java.util.*;

/**
 * Bir kırtasiye dükkanına ürünler geliyor.
 * Kırtasiyeci kalem, silgi gibi malzemelerin kaydını sisteme girecek.
 * 1: Toplam kaç adet ürün aldı?
 * 2: Hangi üründen kaç adet aldı?
 * 3: Kaç çeşit ürünü var?
 */

public class Kirtasiye {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            //  1: Toplam kaç adet ürün aldı?

            List<String> store = new ArrayList<>();
            while (true) {
                System.out.println("Enter stop if you finish  \n  Please Enter Your Product : ");
                String goods = scan.nextLine();
                if (goods.equals("stop")) {
                    break;
                }
                store.add(goods);
            }
            System.out.println("Total number of products:  ? " + store.size());


//        HashMap<Integer , String> hashMapMal = new HashMap();
//       hashMapMal.get(depo);
//        String value = hashMapMal.get(depo);
//        System.out.println(" " +value);


            //  3: Kaç çeşit ürünü var?
            HashSet<Object> hashSet = new HashSet<>(store);
            System.out.println("Total number of categories ? " + hashSet.size());
        }

}






