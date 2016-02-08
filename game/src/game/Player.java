package game;

import java.util.ArrayList;

public class Player
	{
		 String playerName;				
		 int health = 100;		
		 static Gun gun1;
		
	
		public Player (String col, int a, Gun b)
			{
				playerName = col;						
				health = a;
				gun1 = b;
			}
		
		public String getPlayerName()
			{
				return playerName;
			}
		public void setPlayerName(String PlayerName)
			{
				PlayerName = PlayerName;
			}
		public int getHealth()
			{
				return health;
			}
		public  void setHealth(int health)
			{
				health = health;
			}
		
		public static  Gun getGun1() 
		{
			return gun1;
		}
		public static  void setGun1(Gun gun1) 
		{
			Player.gun1 = gun1;
		}
		
	}