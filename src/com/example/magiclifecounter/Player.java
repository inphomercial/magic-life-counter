package com.example.magiclifecounter;

public class Player {
	
	private int health;
	
	public Player() {		
		this.health = 20;	
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void incrementHealth(int value) {
		this.health += value;
	}
	
	public void decrementHealth(int value) {
		this.health -= value;
	}

}
