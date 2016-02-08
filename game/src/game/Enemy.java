package game;

import java.util.ArrayList;

public class Enemy
	{
		static String enemyName;				
		static int enemyHealth;		
		static Gun gun2;
		static int gunSpeed ;
		static ArrayList <Enemy> enemies = new ArrayList <Enemy>();
		public Enemy (String col, int a,  int no)
			{
				enemyName = col;						
				enemyHealth = a;
				//gun2 = idk;
				gunSpeed = no;
			}
		public static void enemyAdd()
			{				
				enemies.add (new Enemy("Manaquin",10,COD.guns.get(0).getSpeed()));	
			}
		public String getEnemyName() {
			return enemyName;
		}
		public void setEnemyName(String enemyName) {
			this.enemyName = enemyName;
		}
		public static int getEnemyHealth() {
			return enemyHealth;
		}
		public static void setEnemyHealth(int i) {
			enemyHealth = enemyHealth;
		}
		public static Gun getGun2() {
			return gun2;
		}
		public void setGun2(Gun gun2) {
			this.gun2 = gun2;
		}
		public String getName()
			{
				return enemyName;
			}
		public void setName(String name)
			{
			enemyName = enemyName;
			}
		public int getHealth()
			{
				return enemyHealth;
			}
		public void setHealth(int health)
			{
			enemyHealth = enemyHealth;
			}
	//WayCooler
	}