//ROCK, PAPER, SCISSORS GAME:

//1. Player vs computer 
//2. Ability to keep playing 
//3. A running score for both computer and player 
//4. Check the user has enetered something valid


package rock_paper_scissors_game;

import java.util.Scanner;
import java.util.Random; 

public class Rock_Paper_Scissors_Game {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random(); 
        
        
        //Set formalities:
        
        System.out.println("Hello and welcome to rock paper scissors!");
        System.out.println("Please only select rock paper scissors in the game...");
        System.out.println("Anything else will not be accepted!");
        System.out.println("To end the game, say DONE, after the game has started!"); 
        System.out.println("");
        System.out.println("If you beat the computer you get 1 point");
        System.out.println("If the computer wins they get 1 point"); 
        System.out.println("If you draw then you both get 0 points");

        
        //Setting veriables:
        
        int playerScore = 0;
        int computerScore = 0; 

        
        //Starting the game: 
        
        //rock beats scissors 
        //paper beats rock 
        //scissors beats paper 
        
        boolean play = true;
        
        while(play == true){
            
            try{ 
                 int max = 3;
                 int min = 1;
                 int random = rand.nextInt((max-min)+1)+min; 
                 
                 if(random == 1){
                     String computerGod = "Rock"; 
                 } 
                 if(random == 2){
                     String computerGo = "Paper"; 
                 }
                 if(random == 3){
                     String computerGo = "Scissors";  
                 }
                 
                 System.out.println(""); 
                 System.out.println(""); 
                 System.out.println("Rock,Paper,Scissors:   (or done to finsih)"); 
                 String playerGo = input.next(); 
                 System.out.println(""); 
                 
                 //they want to end the game:
                 if(playerGo.equalsIgnoreCase("Done")){
                     System.out.println("Your final score is... " + playerScore);
                     System.out.println("The computers score was... " + computerScore); 
                     
                     if(playerScore>computerScore){
                         int winnerBy = playerScore - computerScore; 
                         System.out.println("This means you have beaten the computer by " + winnerBy + " points :) "); 
                     }
                     else{
                         int winnerBy = computerScore - playerScore;
                         System.out.println("This means that the computer beat you by " + winnerBy + " points :( ");
                     }
                     
                     break; 
                 }
                 
                 
                 //Both select rock: 
                 if(playerGo.equalsIgnoreCase("rock")){
                     if(random == 1){
                         System.out.println("the computer also chose Rock!");
                         playerScore = playerScore + 0;
                         computerScore = computerScore + 0; 
                         System.out.println("Your score at the moment is... " + playerScore);
                         System.out.println(""); 
                          
                     }
                 }
                 
                 //Both select paper: 
                 if(playerGo.equalsIgnoreCase("paper")){
                     if(random == 2){
                         System.out.println("the computer also chose Paper!");
                         playerScore = playerScore + 0;
                         computerScore = computerScore + 0; 
                         System.out.println("Your score at the moment is... " + playerScore);
                         System.out.println(""); 
                     }
                 }
                 
                 //Both select scissors: 
                 if(playerGo.equalsIgnoreCase("scissors")){
                     if(random == 3){
                         System.out.println("the computer also chose Scissors!");
                         playerScore = playerScore + 0;
                         computerScore = computerScore + 0; 
                         System.out.println("Your score at the moment is... " + playerScore);
                         System.out.println(""); 
                     }
                 }
                 
                 //Player selects rock, computer chooses scissors: 
                 if(playerGo.equalsIgnoreCase("rock")){
                     if(random == 3){
                         System.out.println("the computer chose Scissors!");
                         System.out.println("Rock blunts Scissors!"); 
                         playerScore = playerScore + 1;
                         computerScore = computerScore + 0; 
                         System.out.println("Your score at the moment is... " + playerScore);
                         System.out.println(""); 
                     }
                 }
                 
                 
                 //Player selects rock, computer chooses paper: 
                 if(playerGo.equalsIgnoreCase("rock")){
                     if(random == 2){
                         System.out.println("the computer chose Paper!");
                         System.out.println("Paper covers rock"); 
                         playerScore = playerScore + 0;
                         computerScore = computerScore + 1; 
                         System.out.println("Your score at the moment is... " + playerScore);
                         System.out.println(""); 
                     }
                 }
                 
             
                 //Computer selects rock, Player chooses scissors: 
                 if(playerGo.equalsIgnoreCase("Scissors")){
                     if(random == 1){
                         System.out.println("the computer chose Rock!");
                         System.out.println("Rock blunts scissors!"); 
                         playerScore = playerScore + 0;
                         computerScore = computerScore + 1; 
                         System.out.println("Your score at the moment is... " + playerScore);
                         System.out.println(""); 
                     }
                 }
                 
                 //Computer selects rock, Player chooses paper: 
                 if(playerGo.equalsIgnoreCase("paper")){
                     if(random == 1){
                         System.out.println("the computer chose Rock!");
                         System.out.println("Paper covers rock"); 
                         playerScore = playerScore + 1;
                         computerScore = computerScore + 0; 
                         System.out.println("Your score at the moment is... " + playerScore);
                         System.out.println(""); 
                     }
                 }

                 
                 //Computer selects paper, Player chooses scissors: 
                 if(playerGo.equalsIgnoreCase("scissors")){
                     if(random == 2){
                         System.out.println("the computer chose Paper!");
                         System.out.println("Scissors cuts paper"); 
                         playerScore = playerScore + 1;
                         computerScore = computerScore + 0; 
                         System.out.println("Your score at the moment is... " + playerScore);
                         System.out.println(""); 
                     }
                 }
                 
                 //player selects paper, computer chooses scissors: 
                 if(playerGo.equalsIgnoreCase("paper")){
                     if(random == 3){
                         System.out.println("the computer chose Scissors!");
                         System.out.println("Scissors cut paper"); 
                         playerScore = playerScore + 0;
                         computerScore = computerScore + 1; 
                         System.out.println("Your score at the moment is... " + playerScore);
                         System.out.println(""); 
                     }
                 }
  
     
            }
            catch(Exception e){
                System.out.println("Nothing sensible inputted!");
                break; 
            }
       
        }
  
        
    }
    
}
