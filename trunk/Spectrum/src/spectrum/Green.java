package spectrum;

public class Green extends Gem 
{
	public Green(Sprite sprite, int x, int y,  boolean collidable) 
	{
		super(sprite, x , y, collidable);
		
	}

	public void applyProperties()
	{
		Game.getPlayer().setGravity(14f);
	}

	public void removeProperties()
	{
		Game.getPlayer().setGravity(20f);
	}
	
	
}
