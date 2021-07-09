package SecondWeek;

import java.util.Scanner;

public class cinemaTickets {

    /*
    Sinema Bileti Satışı :
      18 yaş altı için %10
      18 ve 25 yaş arası %5 indirim
      Korku filmi seçimi %10 indirim
     */

    static int price = 100;

    public static void main(String[] args) {

        double discont;
        int age , mType ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Your Age: ");
         age = scan.nextInt();
        System.out.print("Please Choose 1. For not a horror movie 2. For a horror movie: ");
        mType = scan.nextInt();        //movie type

        while (age<18 && mType==2){
            System.out.println("Sorry for your age is not allowed this kind of movies. Please choose number 1");
            mType=scan.nextInt();
        }

        switch (mType) {
            case 1 -> {  //for normal movies
                if (age < 18) {   //not allowed horror movies for kids
                    discont = price - (price * 0.10);
                } else if (age <= 25) {
                    discont = price - (price * 0.10);
                } else {
                    discont = price;
                }
                System.out.println("Your Ticket Price: " + discont + "TL");
            }
            case 2 -> { //For horror movies
                if (age <= 25) {
                    discont = price - (price * 0.15);
                } else {
                    discont = price - (price * 0.10);
                }
                System.out.println("Your Ticket Price: " + discont + "TL");
            }
        }
    }
}
