import java.util.Scanner;

public class digit_size {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N : ");
        int k = scan.nextInt();
        int y = 0;
        int z = 0;
        int ak = 1000000000;
        for (int i = 1 ; i <= 10 ; i ++){
            if( k / 1000000000 == 0){
                ak = ak /10;
                z ++;
            }
            if (k / ak != 0 ){ break;}

        }
        z = 10 - z;
        System.out.println(ak); // the digit size
        System.out.println(z);

        //for (int i_1 ; i_1<=  ;  )


        System.out.println(y);
    }
}
