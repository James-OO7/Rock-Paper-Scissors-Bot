import java.util.Scanner;
import java.lang.Math;

//Rock == 1, Paper == 2, Scissors == 3

class Main{   
public static void main(String[] args) 
{
  Scanner scan = new Scanner (System.in);
  do{
    System.out.println("Welcome to Rock, Paper, Scissors! Please input your choice: ");
    String playerIn = scan.nextLine();
    String restart;
    double randNum = Math.random();
    int computerChoice = (int)(((randNum * 300) + 100)/100);
    while (true) {
      Integer i;
          if (i == 0) {
            System.out.println(i + "!");
            i = 3;
            TimeUnit.SECONDS.sleep(1);
            i--;
            if (i < 0) {
              break;
            }
          }  
    }      
    if (computerChoice == 1){
      if ("Rock".equals(playerIn)){
        System.out.println("Rock ties with rock! Tie!");
        System.out.println("Would you like to play again? (Y or N)");
        restart = scan.nextLine();
        if ("Y".equals(restart)){
          continue;
        }else if ("N".equals(restart)){
          System.out.println("Thanks for playing!");
          break;
        }
      }else if ("Paper".equals(playerIn)){
        System.out.println("Paper beats Rock! Player 1 Wins!");
        System.out.println("Would you like to play again? (Y or N)");
        restart = scan.nextLine();
        if ("Y".equals(restart)){
          continue;
        }else if ("N".equals(restart)){
          System.out.println("Thanks for playing!");
          break;
        }
      }else if ("Scissors".equals(playerIn)){
        System.out.println("Rock beats Scissors! Computer Wins!");
        System.out.println("Would you like to play again? (Y or N)");
        restart = scan.nextLine();
        if ("Y".equals(restart)){
          continue;
        }else if ("N".equals(restart)){
          System.out.println("Thanks for playing!");
          break;
        }
      }else{
        System.out.println("Please re-check your input and try again!");
      }
    }
    if (computerChoice == 2){
      if ("Rock".equals(playerIn)){
        System.out.println("Paper beats Rock! Computer Wins!");
        System.out.println("Would you like to play again? (Y or N)");
        restart = scan.nextLine();
        if ("Y".equals(restart)){
          continue;
        }else if ("N".equals(restart)){
          System.out.println("Thanks for playing!");
          break;
        }
      }else if ("Paper".equals(playerIn)){
        System.out.println("Paper ties with Paper! Tie!");
        System.out.println("Would you like to play again? (Y or N)");
        restart = scan.nextLine();
        if ("Y".equals(restart)){
          continue;
        }else if ("N".equals(restart)){
          System.out.println("Thanks for playing!");
          break;
        }
      }else if ("Scissors".equals(playerIn)){
        System.out.println("Scissors beats paper! Player 1 Wins!");
        System.out.println("Would you like to play again? (Y or N)");
        restart = scan.nextLine();
        if ("Y".equals(restart)){
          continue;
        }else if ("N".equals(restart)){
          System.out.println("Thanks for playing!");
          break;
        }
      }
    }
    if (computerChoice == 3){
      if ("Rock".equals(playerIn)){
        System.out.println("Rock beats Scissors! Player 1 Wins!");
        System.out.println("Would you like to play again? (Y or N)");
        restart = scan.nextLine();
        if ("Y".equals(restart)){
          continue;
        }else if ("N".equals(restart)){
          System.out.println("Thanks for playing!");
          break;
        }
      }else if ("Paper".equals(playerIn)){
        System.out.println("Scissors beats Paper! Computer Wins!");
        System.out.println("Would you like to play again? (Y or N)");
        restart = scan.nextLine();
        if ("Y".equals(restart)){
          continue;
        }else if ("N".equals(restart)){
          System.out.println("Thanks for playing!");
          break;
        }
      }else if ("Scissors".equals(playerIn)){
        System.out.println("Scissors ties with Scissors! Tie!");
        System.out.println("Would you like to play again? (Y or N)");
        restart = scan.nextLine();
        if ("Y".equals(restart)){
          continue;
        }else if ("N".equals(restart)){
          System.out.println("Thanks for playing!");
          break;
        }
      }else{
        System.out.println("Please re-check your input and try again!");
      }
    }
  }while (true);
  }
}
  