package spectrum;

public class Red extends Gem 
{
	public Red(Sprite sprite, int x, int y, boolean visible, boolean active) 
	{
		super(sprite, x, y, visible, active, "red");
	}
	
	public void applyProperties()
	{
		Game.getPlayer().setActiveSprite("small");
	}
	
	public void removeProperties()
	{	
		Game.getPlayer().setActiveSprite("normal");
		if( Game.getPlayer().getGravity() > 0)
		{
		Game.getPlayer().setPosY((float)(getPosY() - Game.getPlayer().getRectangle().getHeight()));
		}
		else
		{
			//Game.getPlayer().setPosY((float)(getPosY() - Game.getPlayer().getRectangle().getHeight()));
		}
	}
}