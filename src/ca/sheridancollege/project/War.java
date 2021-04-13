package ca.sheridancollege.project;
import java.util.Scanner;

public class War extends Game {

	public void compareCards() {
		// TODO - implement War.compareCards
		throw new UnsupportedOperationException();
	}

	public void checkCards(WarPlayer player1, WarPlayer player2) {
		// TODO - implement War.checkCards
		throw new UnsupportedOperationException();
	}

	public War() {
            this.setGameName("War");
	}
        
        public void getNames() {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the name for player 1: ");
            String name = input.nextLine();
            WarPlayer player1 = new WarPlayer(name);
            
            System.out.println("Please enter the name for player 2: ");
            name = input.nextLine();
            WarPlayer player2 = new WarPlayer(name);
        }

	public void play() {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the name for player 1: ");
            String name = input.nextLine();
            WarPlayer player1 = new WarPlayer(name);
            
            System.out.println("Please enter the name for player 2: ");
            name = input.nextLine();
            WarPlayer player2 = new WarPlayer(name);
            
            System.out.println(player1.getPlayerID() + " " + player2.getPlayerID());
            
            Deck mainDeck = new Deck(52);
                    
            mainDeck.fillDeck();
            mainDeck.shuffle();
            mainDeck.showCards();
            
            Deck p1Deck = new Deck(26);
            Deck p2Deck = new Deck(26);
            Deck p1SideDeck = new Deck(52);
            Deck p2SideDeck = new Deck(52);
            Deck tiedDeck = new Deck(52);
            
            mainDeck.splitDeck(p1Deck, p2Deck);
            System.out.println();
            p1Deck.showCards();
            System.out.println();
            p2Deck.showCards();
            System.out.println();
            
            Card p1Draw = new WarCard();
            Card p2Draw = new WarCard();
            for (int i = 0; i < 26; i++) {
                p1Draw = p1Deck.dealCard();
                p2Draw = p2Deck.dealCard();
                
                if (p1Draw.getRank() > p2Draw.getRank()) {
                    p1SideDeck.setCard(p1Draw);
                    p1SideDeck.setCard(p2Draw);
                    while (tiedDeck.getGroupOfCards().size() > 0) {
                        p1SideDeck.setCard(tiedDeck.dealCard());
                    }
                } else if (p1Draw.getRank() < p2Draw.getRank()) {
                    p2SideDeck.setCard(p1Draw);
                    p2SideDeck.setCard(p2Draw);
                    while (tiedDeck.getGroupOfCards().size() > 0) {
                        p2SideDeck.setCard(tiedDeck.dealCard());
                    }
                } else {
                    System.out.println("hi");
                    tiedDeck.setCard(p1Draw);
                    tiedDeck.setCard(p2Draw);
                    tiedDeck.showCards();
                }
            }
            
            p1SideDeck.showCards();
            System.out.println();
            p2SideDeck.showCards(); 
            System.out.println();  
            tiedDeck.showCards();
            
            
            
	}

	public void declareWinner() {
		// TODO - implement War.declareWinner
		throw new UnsupportedOperationException();
	}

}