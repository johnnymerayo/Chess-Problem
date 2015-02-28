package uk.tests.trycatch.model;

import uk.tests.trycatch.util.ConstantsUtil;

/**
 * Representation of a King piece.
 * 
 * A King moves exactly one square horizontally, vertically, or diagonally.
 * 
 * @author Jonathan
 *
 */
public class King extends Piece {
	
	public King(int row, int col) {
		super(row, col);
	}
	
	public String toString() {
		return ConstantsUtil.KING + super.toString();
	}

	public Boolean isTreatening(Piece p){
		
		// The piece is being threatened by the King if the piece stays in exactly one square horizontally, vertically, or diagonally
		if(Math.abs(this.getRow() - p.getRow()) < 2 && Math.abs(this.getCol() - p.getCol()) < 2  )
			return new Boolean(true);
		
		return new Boolean(false);
	}

}
