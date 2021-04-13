package ca.sheridancollege.project;

public class Deck extends GroupOfCards {


        public Deck() {
            
        }
        
        
	public Deck(int givenSize) {
            this.setSize(givenSize);
	}

	public void fillDeck() {
            WarCard card = new WarCard();
            int size = this.getSize();
            for (int i = 0; i < size; i++){  
                this.setCard(new WarCard(i % 13 + 1));
            }
	}
        
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

	public void append() {
		// TODO - implement Deck.append
		throw new UnsupportedOperationException();
	}

}