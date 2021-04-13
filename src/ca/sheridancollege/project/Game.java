package ca.sheridancollege.project;

import java.util.*;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye
 */
public abstract class Game {

	private String gameName;
	/**
	 * the title of the game
	 */
	private Collection<Player> players;

	public String getGameName() {
		return this.gameName;
	}
        
        public void setGameName(String newName) {
            this.gameName = newName;
        }

	public Collection<Player> getPlayers() {
		return this.players;
	}

	public void setPlayers(Collection<Player> players) {
		this.players = players;
	}
        
        public Game() {
            this.gameName = "";
        }

	/**
	 * the players of the game
	 * @param givenName
	 */
	public Game(String givenName) {
		// TODO - implement Game.Game
		throw new UnsupportedOperationException();
	}

	/**
	 * Play the game. This might be one method or many method calls depending
	 * on your game.
	 */
	public abstract void play();

	/**
	 * When the game is over, use this method to declare and display a winning
	 * player.
	 */
	public abstract void declareWinner();

}