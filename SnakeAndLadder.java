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
public class SnakeAndLadder
{
	//System.out.println();
	public static void main(String[] args) 
	{
		int start_position = 0;
		int player_position = 0;
		int countDice = 0;
		System.out.println(" WELCOME - Snake And Ladder - SINGLE player");
		System.out.println("Player is at Start position: "  + start_position);
		int Dice = (int)((Math.random() * 6) + 1);
		System.out.println("Output after rolling Dice: " + Dice);
		int option = (int) (Math.random() * 3);
		if (option == 1)//Ladder
		{
			System.out.println("Player is at position: " + player_position);
			player_position += Dice;
			System.out.println("LADDER - Move " + Dice + " positions up: " + player_position);
			countDice++;
		}
		else if (option == 2)//Snake
		{
			System.out.println("Player is at position: " + player_position);
			player_position -= Dice;
			if (player_position < 0)
			{
				System.out.println("SNAKE - Move " + Dice + " positions down to: " + start_position);
			}
			else {
			System.out.println("SNAKE - Move " + Dice + " positions down to: " + player_position);
			}
			countDice++;
		}
		else
        {
			System.out.println("Player is at position: " + player_position);
			System.out.println("NO-PlAY - Stay in your current position: " +  player_position);
			countDice++;	
		}

	}
}

