package spectrum;

public class Player extends Actor
{
	//Physics
	private float gravity = 10f;
	private float jumpPower = -6.66f;
	private float maxJumpTime = 1.5f;
	private float jumpTime = 0f;
	private boolean isOnGround = true;
	private boolean jump = false;
	
	private float moveSpeed = 3f;
	
	public void setGravity(float value)
	{
		this.gravity = value;
	}
	
	public Player(Sprite sprite, float x, float y)
	{
		super(sprite, Type.PLAYER);
		this.setposX(x);
		this.setPosY(y);
	}
	
	public void doJump()
	{
		this.jump = true;
	}
	
	public void doMove(int direction)
	{
		this.setposX(this.getPosX() + direction*moveSpeed);
	}
	
	public void update()
	{
		super.update();
		
		applyPhysics();
	}
	
	private void applyPhysics()
	{
		//ready to jump
		if(jump && isOnGround)
		{
			jump = false;
			jumpTime = 0;
			isOnGround = false;
		}
		//apply gravity (and other forces)
		else if(!isOnGround)
		{
			jump = false;
			jumpTime += Game.UPDATE_INTERVAL / 1000;
			if(jumpTime < maxJumpTime)
			{
					this.setPosY(this.getPosY() + jumpPower + gravity * jumpTime);
			}
		}
		
		checkWallCollision();
		checkActorCollision();
	}

	private void checkActorCollision() 
	{
		//husk � sett isOnGround=true n�r han st�r p� en collidable actor
		for (Actor actor : actors) 
		{
			if (actor == this) {
				continue;
			}
			if (actor.getType() == Type.BLOCK) {
				if () {
					this.setPosY(actor.getPosY());
					isOnGround = true;
					
				}
				
			}
			
			
			
		}
		
		
	}

	private void checkWallCollision() 
	{
		//check bottom
		if(this.getPosY() > 800 - this.getSprite().getHeight())
		{
			this.setPosY(800 - this.getSprite().getHeight() - 4); //-4 er temp
			this.isOnGround = true;
		}
		
		//check right wall
		if (this.getPosX() >= 800 - this.getSprite().getWidth() ) {
			this.setposX(800 - this.getSprite().getWidth());	
		}
		
		if (this.getPosX() <= 0 + this.getSprite().getWidth() / 5) {
			this.setposX(0 + this.getSprite().getWidth() / 5);
		}
	}

	
}