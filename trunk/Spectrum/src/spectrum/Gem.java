package spectrum;

import java.util.ArrayList;

public class Gem extends Actor
{
	private boolean active = false;
	public static ArrayList<Gem> activeGems;
	private final int limit = 2;
	
	public Gem(Sprite sprite) 
	{
		super(sprite);
		activeGems = new ArrayList<Gem>();	
	}
	
	public void update()
	{
		super.Update();
	}
	
	public void activate()
	{
		if(active)
			return;
		
		activeGems.add(this);
		this.active = true;
		
		if(activeGems.size() > limit)
		{
			activeGems.get(0).removeProperties();
			activeGems.get(0).active = false;
			activeGems.remove(0);
		}
		
		this.applyProperties();
	}
	
	public void applyProperties()
	{
		dsf
	}
	
	public void removeProperties()
	{
	}
}