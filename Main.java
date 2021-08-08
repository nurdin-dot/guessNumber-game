import java.util.Random;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            guessNumber();
        }

        public static void guessNumber() {
            
            //import the scanner method
            Scanner scanner =  new Scanner(System.in);
                      
            //import the random method
            Random keyNum = new Random();
            int rand = keyNum.nextInt(10);

            //some Variables
            boolean running = true;
            int live = 2;

            //game logic starts here
            while(running) {

                //player input
                System.out.print("Enter your number: ");
                int answer = scanner.nextInt();

                //game over text
                if(live == 0) {
                	System.out.println("YOU LOSE! the number is "+ rand);
                	running = false;
                }
                
                // if player guess the number
                else if (answer == rand && live > 0) {
                	System.out.println("you guess the number!");
                    running = false;
                } else if (answer > rand && live > 0) {     //if not
                	System.out.println("The number is too big!");
                }else if (answer < rand && live > 0) {      //if not
					System.out.println("The number is too low!");                	
                }
                

                live -= 1;
            }

        }

}