package ExtraHomework;

public class Stars {
    public static void main(String[] args) {


        int[] star = new int[4];
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("");

        int[] star2 = new int[4];
        for (int i=star2.length ; i>=0; i--){
            for (int j=1 ; j<=i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
