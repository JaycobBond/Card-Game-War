/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author AustinPriest
 */
public class Test {
    
    public static void main(String[] args) {
        War war = new War();
        System.out.println("The game is called " + war.getGameName());
        war.play();

    }
    
}
