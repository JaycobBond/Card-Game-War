package ca.sheridancollege.project;
/* Since War only uses the rank and not suit, this is reflected
 * in the simplicity of the class.
 * @author Austin Priest, Emre Erdonmez, Jaycob Bond
*/

public class WarCard extends Card {

	public WarCard() {
	}
        
        public WarCard(int value) {
            this.setRank(value);
        }
     
        @Override
	public String toString() {
            return Integer.toString(this.getRank());
	}

}