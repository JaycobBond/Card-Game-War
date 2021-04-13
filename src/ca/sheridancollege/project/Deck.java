package ca.sheridancollege.project;
/* Used to fill and split the deck. They are used specifically for 
 * our game of War.
 * @author Austin Priest, Emre Erdonmez, Jaycob Bond
*/

public class Deck extends GroupOfCards {


        public Deck() {
            
        }
        
        
	public Deck(int givenSize) {
            this.setSize(givenSize);
	}

        //fills the deck in order with the specified size
	public void fillDeck() {
            WarCard card = new WarCard();
            int size = this.getSize();
            for (int i = 0; i < size; i++){  
                this.setCard(new WarCard(i % 13 + 1));
            }
	}
        
        //splits the deck in half
        public void splitDeck(Deck deck1, Deck deck2) {
            int originalSize = this.getSize();
            for (int i = 0; i < originalSize; i++) {
                if (i % 2 == 0) {
                    deck1.setCard(this.dealCard());
                }
                else {
                    deck2.setCard(this.dealCard());
                }
            }
        }

}