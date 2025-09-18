/*
 * Class: CMSC203 
 * Instructor: professor Ahmed Tarek
              * Description:Write a program that tests your ESP (extrasensory perception).
 * Due: 09/10/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Giran Park
*/


    import java.util.Scanner;
    import java.util.Random;

public class RandomMainn
    {

    public static void main(String[] args)
        {
        // define constant color for switch statement to assign color name to number
        final int COLOR_RED = 0;
        final int COLOR_GREEN = 1;
        final int COLOR_BLUE = 2;
        final int COLOR_YELLOW = 3;
        final int COLOR_ORANGE = 4;
        final int COLOR_GRAY = 5;
        final int COLOR_PINK = 6;

        int randomColorNumber;
        int userColorNumber=-1;
        String userAnswer;
        String showRandomColor=null;
        int correctColor = 0;

        Random randomNumbers = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        // get general user information
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.print("Enter your MC M#: ");
        String mNumber = keyboard.nextLine();
        System.out.print("Describe yourself: ");
        String describeUser = keyboard.nextLine();
        System.out.print("Due Date: ");
        String dueDate = keyboard.nextLine();
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        
        //use for loop to repeat the game eleven times
        for (int round =1; round<=11; round++){
    	
            System.out.println("Round "+round + "\n\n");
            System.out.print("I am thinking of a color."+"\n"+"Is it Red, Green, Blue, Orange, Yellow, Gray or Pink?"+"\n"+"Enter your guess:"+"\n");

        // Get a random integer number
        randomColorNumber = randomNumbers.nextInt(7);    

         //convert color words into integer number.
         switch (randomColorNumber){
            case COLOR_RED:showRandomColor = "Red";
                break;   
            case COLOR_GREEN:showRandomColor = "Green";
                break;   
            case COLOR_BLUE:showRandomColor = "Blue";
                break;   
            case COLOR_YELLOW:showRandomColor = "Yellow";
                break;   
            case COLOR_ORANGE:showRandomColor = "Orange";
                break;   
            case COLOR_GRAY:showRandomColor = "Gray";
                break;   
            case COLOR_PINK:showRandomColor = "Pink";
                break;   
          }
         
          // get user's guessed color
          userAnswer = keyboard.nextLine();

          //convert color words into integer number.
          if(userAnswer.equalsIgnoreCase("red"))
          {
             userColorNumber = 0;
          }
          else if(userAnswer.equalsIgnoreCase("green"))
          {
             userColorNumber = 1;
          }
              else if(userAnswer.equalsIgnoreCase("blue"))
              {
                  userColorNumber = 2;
              }
                  else if(userAnswer.equalsIgnoreCase("yellow"))
                  {
                      userColorNumber = 3;
                  }
                      else if(userAnswer.equalsIgnoreCase("orange"))
                      {
                          userColorNumber = 4;
                      }
                          else if(userAnswer.equalsIgnoreCase("gray"))
                          {
                              userColorNumber = 5;
                          }
                              else if(userAnswer.equalsIgnoreCase("pink"))
                              {
                                  userColorNumber = 6;  
                              }
                                  else
                                  {
    	                              userColorNumber = -1;
                                  }
    
             // input validation and reassign user input color into number
             while (userColorNumber< 0 || userColorNumber > 6)
             {
                 System.out.println("You entered incorrect color Please, Is it Red, Green, Blue, Orange, Yellow, Gray or Pink?\nEnter your guess again: ");
                 userAnswer = keyboard.nextLine();
    
                 if(userAnswer.equalsIgnoreCase("red"))
                 {
                     userColorNumber = 0;
                 }
                 else if(userAnswer.equalsIgnoreCase("green"))
                 {
                     userColorNumber = 1;
                 }
                     else if(userAnswer.equalsIgnoreCase("blue"))
                     {
                         userColorNumber = 2;
                     }
                         else if(userAnswer.equalsIgnoreCase("yellow"))
                         {
                             userColorNumber = 3;
                         }
                             else if(userAnswer.equalsIgnoreCase("orange"))
                             {
                                 userColorNumber = 4;
                             }
                                 else if(userAnswer.equalsIgnoreCase("gray"))
                                 {
                                     userColorNumber = 5;
                                  }
                                     else if(userAnswer.equalsIgnoreCase("pink"))
                                     {
                                         userColorNumber = 6;  
                                     }
                                         else
                                         {
   	                                         userColorNumber = -1;

                                         }
                }


                //check if user's answer matches with generated random color. 
                if(userColorNumber == randomColorNumber)
                {
                    System.out.println("I was thinking of "+ showRandomColor +".");
                    correctColor++;
                }
                else
                {
                    System.out.println("\nI was thinking of "+ showRandomColor+".");
                }

            }
    // print out general user information and the number of correct guessed color 
    System.out.println("Game Over\n\n\nYou guessed " + correctColor + " out of 11 colors correctly.\n"+"Student Name: "+ name +"\nProgrammer's Name: "+ name + "\nMC Student M#: "+mNumber+"\nUser Description: "+ describeUser + "\nDue Date: " + dueDate);
        }
    }