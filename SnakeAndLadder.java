/**
 * Java Program to simulates a Snake and Ladder Game. The Player
   starts from 0 rolls the die to get a number between 1 to 6, finds
   a safe place, ladder or a snake keeps doing till the winning spot
   100 is achieved.
 *
 * @author: PAVAN SAKETH
 * @since: 11.06.2021
 */

import java.util.*;
public class SnakeAndLadderUC4
{
	//System.out.println();
	public static void main(String[] args) 
	{
		int start_position = 0;
		int player_position = 0;
		int final_position = 100;
		int countDice = 0;
		int i = 0;
		System.out.println(" WELCOME - Snake And Ladder - SINGLE player");
		System.out.println("Player is at Start position: "  + start_position);

 while (player_position < final_position)
  {
  for (i = player_position ; i < final_position ; i++ )
    {
		int Dice = (int)((Math.random() * 6) + 1);
		System.out.println("--> Output after rolling Dice: " + Dice);
		countDice++;
		int option = (int) (Math.random() * 3);
		if (option == 1)//Ladder
		{
			System.out.println("Player is at position: " + player_position);
			player_position += Dice;
			if (player_position > final_position)
			{
				player_position  -= Dice;
				System.out.println("Stay in current position: " + player_position);
				System.out.println("------------------------------------");
			}
			else {
			System.out.println("LADDER - Move " + Dice + " positions up: " + player_position);
			System.out.println("------------------------------------");
			}
		}//Ladder end

		else if (option == 2)//Snake
		{
			System.out.println("Player is at position: " + player_position);
			player_position -= Dice;
			if (player_position < 0)
			{
				player_position = start_position;
				System.out.println("Player is at position: " + player_position);
				System.out.println("------------------------------------");
			}
			else {
			System.out.println("SNAKE - Move " + Dice + " positions down to: " + player_position);
			System.out.println("------------------------------------");
			}
		}//Snake end
		
		else //NO-Play
        {
			System.out.println("Player is at position: " + player_position);
			System.out.println("NO-PlAY - Stay in your current position: " +  player_position);	
			System.out.println("------------------------------------");
		}
		break;
 }//player_position < final_pos check end
}

System.out.println("------------------------------------");

if (player_position == final_position)
      {
	     System.out.println("*$*Player has reached final position: " + player_position);
		 System.out.println("*$*CONGRATULATIONS*-Player Has WON the GAME");
	     System.out.println("Player rolled the Dice : " + countDice + " : times to complete the game");
		 System.out.println("*** GAME COMPLETED ***");
		 
}
}
}