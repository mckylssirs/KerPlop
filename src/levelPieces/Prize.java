package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Prize extends GamePiece{

	public Prize(char symbol, String label, int location) {
		super(symbol, label, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(this.getLocation() == playerLocation) {
			return InteractionResult.GET_POINT;
		}		
		return InteractionResult.NONE;
	}

}
