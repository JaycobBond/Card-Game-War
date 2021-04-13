package ca.sheridancollege.project;

import java.util.*;
import java.util.Random;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards {

	private int size;
	/**
	 * The group of cards, stored in an ArrayList
	 */
	private ArrayList<Card> cards = new ArrayList<Card>();

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}
        
        public GroupOfCards() {
            
        }
        
	/**
	 * the size of the grouping
	 * @param givenSize
	 */
	public GroupOfCards(int givenSize) {
            this.setSize(givenSize);
	}

	/**
	 * A method that will get the group of cards as an ArrayList
	 * @return the group of cards.
	 */
	public void showCards() {
            
            int i = 0;
            
            while (i < this.cards.size()) {
                System.out.print(this.cards.get(i) + " ");
                i += 1; 
            }
            System.out.println();
	}
        
        public void setCard(Card value) {
            this.cards.add(value);
        }
        
        public void setCard(int index, Card value) {
            this.cards.set(index, value);
        }
        
        public Card getCard(int index) {
            Card dealt = this.cards.get(index);
            return dealt;
        }
        
        public Card dealCard() {
            Card dealt = this.cards.get(0);
            this.cards.remove(0);
            return dealt;
        }
        
        public ArrayList<Card> getGroupOfCards() {
            return this.cards;
        }

	public void shuffle() {
            Collections.shuffle(cards);
	}

}