package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Grandma extends GamePiece implements Moveable{
	
	public Grandma(char symbol, String label, int location) {
		super(symbol, label, location);

	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(this.getLocation() == playerLocation) {
			return InteractionResult.KILL;
		}
		return InteractionResult.NONE;
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		int moveDirection = (int)(Math.random()*(1-(-1)+1)+(-1));
		this.setLocation(this.getLocation() + moveDirection);
		
	}

}
