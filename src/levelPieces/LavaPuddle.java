package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class LavaPuddle extends GamePiece{

	public LavaPuddle(char symbol, String label, int location) {
		super(symbol, label, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(this.getLocation() == playerLocation) {
			return InteractionResult.HIT;
		}
		return InteractionResult.NONE;
	}
	

}
