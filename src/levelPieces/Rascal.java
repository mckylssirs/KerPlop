package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Rascal extends GamePiece implements Moveable{

	boolean moveBool = true;
	public Rascal(char symbol, String label, int location) {
		super(symbol, label, location);
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(this.getLocation() == playerLocation) {
			return InteractionResult.HIT;
		}
		return InteractionResult.NONE;
	}
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		moveBool = !moveBool;
		if(moveBool) {
			this.setLocation(this.getLocation() + 1);
		}
		else this.setLocation(this.getLocation() - 1);
		
	}

}
