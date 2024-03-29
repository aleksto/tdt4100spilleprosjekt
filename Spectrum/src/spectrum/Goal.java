package spectrum;

public class Goal extends Actor
{
	public Goal(Sprite sprite, int x, int y, boolean collidable)
	{
		super(sprite, x, y, collidable);
	}
	
	public static Goal getGoal()
	{
		for (Actor actor : actors) 
		{
			if(actor instanceof Goal)
				return (Goal)actor;
		}
		return null;
	}
}