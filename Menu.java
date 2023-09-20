import java.util.Scanner;

/**
 * Menu
 */
public class Menu {

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        while(true){
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = (int)(100*Math.random());
            }
            System.out.println("1- Find minimum of an array\n2- Find maximum of an array\n3- Find average of an array\n4- Find the sum of elements with odd-numbered indexes \n5- Find the sum of elements with even-numbered indexes\n6- Exit\nPlease select your action");
            int choice = userIn.nextInt();
            if(choice == 1){

                System.out.println(GameOperations.ArrayMin(arr));
            }
            else if(choice == 2){
                System.out.println(GameOperations.ArrayMax(arr));
            }
            else if(choice == 3){
                System.out.println(GameOperations.Average(arr));
            }
            else if(choice == 4){
                System.out.println(GameOperations.oddIndex(arr));
            }
            else if(choice == 5){
                System.out.println(GameOperations.oddIndex(arr));
            }
            else if(choice== 6){
                userIn.close();
                break;
            }
            else{
                System.out.println("Please enter a valid option.");
            }
            
        }
    }
}