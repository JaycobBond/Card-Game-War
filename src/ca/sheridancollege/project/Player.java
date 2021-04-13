package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye
 */
public abstract class Player {

	private String playerID;

	/**
	 * A constructor that allows you to set the player's unique ID
	 * @param name the unique ID to assign to this player.
	 */
	public Player(String name) {
            this.setPlayerID(name);
	}
        
        public Player() {
            
        }

	/**
	 * The method to be instantiated when you subclass the Player class
	 * with your specific type of Player and filled in with logic to play your game.
	 */
	public abstract void play();

	public String getPlayerID() {
            return this.playerID;
	}

	public void setPlayerID(String name) {
            this.playerID = name;
	}

}