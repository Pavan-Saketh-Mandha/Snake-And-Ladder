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
public class SnakeAndLadderUC2
{
	//System.out.println();
	public static void main(String[] args) 
	{
		int start_position = 0;
		System.out.println(" WELCOME - Snake And Ladder - SINGLE player");
		System.out.println("Player is at Start position: "  + start_position);
		int Dice = (int)((Math.random() * 6) + 1);
		System.out.println("Output after rolling Dice: " + Dice);
	}
}
