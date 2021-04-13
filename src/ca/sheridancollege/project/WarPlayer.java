package ca.sheridancollege.project;

public class WarPlayer extends Player {

	private Deck deck;
        private Deck sideDeck;

	public WarPlayer() {
		
	}
        
        public WarPlayer(Deck newDeck) {
            this.deck = newDeck;
        }
        
        public WarPlayer(Deck newDeck, Deck sideDeck) {
            this.deck = newDeck;
            this.sideDeck = sideDeck;
        }
        
        public WarPlayer(String name) {
            this.setPlayerID(name);
        }


	public void play() {
		// TODO - implement WarPlayer.play
		throw new UnsupportedOperationException();
	}

}