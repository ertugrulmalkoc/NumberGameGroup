import java.util.Scanner;

/**
 * Menu
 */
public class Menu {

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        while(true){
            System.out.println("1- Find minimum of an array\n2- Find maximum of an array\n3- Find average of an array\n4- Find the sum of elements with odd- and even-numbered indexes\n5- Exit\nPlease select your action");
            int choice = userIn.nextInt();
            if(choice == 1){

            }
            else if(choice == 2){

            }
            else if(choice == 3){
                
            }
            else if(choice == 4){
                
            }
            else if(choice == 5){
                userIn.close();
                break;
            }
            else{
                System.out.println("Please enter a valid option.");
            }
            
        }
    }
}