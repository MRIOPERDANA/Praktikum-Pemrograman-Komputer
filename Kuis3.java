import java.util.Scanner;

public class Kuis3 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Masukan bilangan Prima ");
          int x = input.nextInt();

          if (Prima(x)){
               System.out.println("Bilangan " + x + " Merupakan Bilangan Prima");
          } else {
               System.out.println(" Bilangan " + x + " Bukan Bilangan Prima ");
          }
          input.close();
     }
     private static boolean Prima(int x){
          if ( x < 2 ){
               return false;
          }


          for( int i = 2; i < Math.sqrt(x); i++ ){
               if ( x % i == 0 ){
                    return false;
               }
          }
          return true;
     }

}
