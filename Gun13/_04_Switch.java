package Gun13;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {
        // kullanicinin girdigi gun numarasina karsilik gelen gunun adini yaziniz

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();

        //if (gunNo==1)
          //  System.out.println("Pazartesi");
        //else if (gunNo==2) {
          //  System.out.println("Sali"); .... gitmesi yerine

        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");break;
            case 2:
                System.out.println("Sali");break;
            case 3:
                System.out.println("Carsamba");break;
            case 4:
                System.out.println("Persembe");break;
            case 5:
                System.out.println("Cuma");break;
            case 6:
                System.out.println("Cumartesi");break;
            case 7:
                System.out.println("Pazar");break;
            default:
                System.out.println("Hatali gun no");

        }


    }
}
