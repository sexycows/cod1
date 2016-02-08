package game;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class COD
	{
	static String name; 
	static ArrayList <Gun> guns = new ArrayList <Gun>();
	public static String getName() {
		return name;
	}
	public static void setName(String name) 
	{
		COD.name = name;
	}
	public static JFrame getFrame() 
	{
		return frame;
	}
	public static void setFrame(JFrame frame) 
	{
		COD.frame = frame;
	}
   
	static JFrame frame = new JFrame();
		@SuppressWarnings("static-access")
		public static void main(String[] args)
		{
			 guns.add(new Gun  ("AK-47",150,5,50));
			 guns.add(new Gun  ("Sniper",15,15,100));
			 guns.add(new Gun  ("Rapid",1000,50,5));
			 guns.add(new Gun  ("Spoon",200000000,1,9000));
			 System.out.println(guns.get(0).getName());
			Enemy.enemyAdd();
			Player newPlayer = new Player ("memelord",100, (guns.get(0)));
			name = JOptionPane.showInputDialog("What is your name?");  
			JOptionPane.showMessageDialog(frame, "Hi, " + name);
			
			for (int totalFirerateCombined: Gun.fireRate)
			{
				totalFirerateCombined += Gun.fireRate;
			}
			
			final String[] genre = { "AK-47", "Sniper", "Rapid", "Spoon" };
			{
				final JFrame frame = new JFrame();
				String favoritePizza = (String) JOptionPane.showInputDialog(frame, "What gun would you like to choose?","Gun Options",JOptionPane.QUESTION_MESSAGE,  null, genre, genre[0]);
				
    				switch(favoritePizza)
    					{
    						case "AK-47":
    						{
    							Player.setGun1(guns.get(0));   		
    							System.out.println(Player.getGun1().getName());    				
    							break;
    						}
    						case "Sniper":
    	    						{
    	    							Player.setGun1(guns.get(1));   		
    	    							System.out.println(Player.getGun1().getName());    				
    	    							break;
    	    						}
    						case "Rapid":
    	    						{
    	    							Player.setGun1(guns.get(2));   		
    	    							System.out.println(Player.getGun1().getName());    				
    	    							break;
    	    						}
    						case "Spoon":
    	    						{
    	    							Player.setGun1(guns.get(3));   		
    	    							System.out.println(Player.getGun1().getName());    				
    	    							break;
    	    						}
    						}			
    				System.out.println((Enemy.enemies.get(0).getEnemyHealth())-(Player.getGun1().getDamage()));
    				
					while(Enemy.enemies.get(0).getEnemyHealth () > 0)
    				{
    					if(newPlayer.getGun1().getSpeed() >= guns.get(0).getSpeed())
    						{
    							Enemy.enemies.get(0).setEnemyHealth (Enemy.enemies.get(0).getEnemyHealth()-newPlayer.getGun1().getDamage());
    							JOptionPane.showMessageDialog (frame, "Your enemy has " + Enemy.enemies.get(0).getEnemyHealth() + " health, you have " +  newPlayer.getHealth() + " health");
    						}
    					if (newPlayer.getGun1().getSpeed() < guns.get(0).getSpeed())
    						{
    							
								newPlayer.setHealth ((newPlayer.getHealth())-(Enemy.enemies.get(0).getGun2().getDamage()));
    							JOptionPane.showMessageDialog (frame, "Your enemy has " + Enemy.enemies.get(0).getEnemyHealth() + " health, you have " +  newPlayer.getHealth() + " health");
    						}
    					
    							Enemy.enemies.add (new Enemy("Recruit",50,COD.guns.get(0).getSpeed()));
    							
    							while(Enemy.enemies.get(1).getEnemyHealth () > 0)
    		    				{
    		    					if(newPlayer.getGun1().getSpeed() >= guns.get(0).getSpeed())
    		    						{
    		    							Enemy.enemies.get(1).setEnemyHealth (Enemy.enemies.get(1).getEnemyHealth()-newPlayer.getGun1().getDamage());
    		    							JOptionPane.showMessageDialog (frame, "Your enemy has " + Enemy.enemies.get(0).getEnemyHealth() + " health, you have " +  newPlayer.getHealth() + " health");
    		    						}
    		    					if (newPlayer.getGun1().getSpeed() < guns.get(0).getSpeed())
    		    						{
    		    							
    										newPlayer.setHealth ((newPlayer.getHealth())-(Enemy.enemies.get(1).getGun2().getDamage()));
    		    							JOptionPane.showMessageDialog (frame, "Your enemy has " + Enemy.enemies.get(1).getEnemyHealth() + " health, you have " +  newPlayer.getHealth() + " health");
    		    						}
    		    					
    							Enemy.enemies.add (new Enemy("Corporal",70,COD.guns.get(0).getSpeed())); 
    							
    							while(Enemy.enemies.get(2).getEnemyHealth () > 0)
    		    				{
    		    					if(newPlayer.getGun1().getSpeed() >= guns.get(0).getSpeed())
    		    						{
    		    							Enemy.enemies.get(2).setEnemyHealth (Enemy.enemies.get(2).getEnemyHealth()-newPlayer.getGun1().getDamage());
    		    							JOptionPane.showMessageDialog (frame, "Your enemy has " + Enemy.enemies.get(0).getEnemyHealth() + " health, you have " +  newPlayer.getHealth() + " health");
    		    						}
    		    					if (newPlayer.getGun1().getSpeed() < guns.get(0).getSpeed())
    		    						{
    		    							
    										newPlayer.setHealth ((newPlayer.getHealth())-(Enemy.enemies.get(2).getGun2().getDamage()));
    		    							JOptionPane.showMessageDialog (frame, "Your enemy has " + Enemy.enemies.get(2).getEnemyHealth() + " health, you have " +  newPlayer.getHealth() + " health");
    		    						}
    		    				}

    		    		}
    		    	}
    			}
			}
//		Enemy.enemies.add (new Enemy("Sergeant",90,COD.guns.get(0).getSpeed()));
//		Enemy.enemies.add (new Enemy("Master Sergeant",110,COD.guns.get(0).getSpeed()));
//		Enemy.enemies.add (new Enemy("Captain",130,COD.guns.get(0).getSpeed()));
//		Enemy.enemies.add (new Enemy("Chief In Commander",150,COD.guns.get(0).getSpeed()));	
		public static ArrayList<Gun> getGuns() 
			{
				return guns;
			}
			
		public static void setGuns(ArrayList<Gun> guns)
			{
				guns = guns;
			}
			
	}