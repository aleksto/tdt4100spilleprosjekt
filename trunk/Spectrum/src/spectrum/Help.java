package spectrum;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;




public class Help {
	
	
	private Font headerFont;
	private FontMetrics fm;
	private Font helpFont;
	private Font subHeader;
	private int stringLength;
	private Sprite [] sprites;
	private String [] keys;
	private String [] gems;
	private String header;
	private String subHeader1;
	private String subHeader2;
	

	
	public Help(){
		
		header = "Help";
		
		gems = new String[]{"- The green gem makes the gravity lower and you'll therefore", 
				"   be able to jump higher", 
				"- The red gem makes you small, this is convienent in shallow places",
				"- The blue gem turns the world upside down and sends you crashing to the roof",
				"- The purple gem gives you Spectravision.",
				"  With Spectravision you can see gems that are normally invisible to you",		
		};
		
		keys = new String[] {"- Left/Right = Move",
							"- Up = Jump",
							"- Space = Activate Gems"
		};
		
		helpFont = new Font("Calibri", Font.PLAIN, 15);	
		headerFont = new Font("Calibri", Font.BOLD, 32);
		subHeader = new Font("Calibri", Font.BOLD, 22);
		subHeader1 = "Keys";
		subHeader2 = "Gems";
		
	}
	
	
	
	
	
	
	public void drawHelp(Graphics g){
		g.setColor(Color.BLACK);
		
		g.setFont(headerFont);
		fm = g.getFontMetrics(headerFont);
		stringLength = fm.stringWidth(header);
		g.drawString(header, Game.SCREEN_WIDTH / 2 - stringLength / 2, 50);
		
		fm = g.getFontMetrics(subHeader);
		stringLength = fm.stringWidth(subHeader1);
		g.drawString(subHeader1, Game.SCREEN_WIDTH / 2 - stringLength / 2 , 150);
		
		
		//Draws gemdescriptions
		g.setFont(helpFont);
		g.drawString(gems[0], 200, 120);
		g.drawString(gems[1], 200, 140);
		g.drawString(gems[2], 200, 190);
		g.drawString(gems[3], 200, 240);
		g.drawString(gems[4], 200, 290);
		g.drawString(gems[5], 200, 310);
		
		
		
		
		
	}
}
