package ca.sheridancollege.project;

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