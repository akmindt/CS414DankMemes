package a4.monopoly;

import java.util.HashSet;
import java.util.Set;

public class Player {
	private int money = 1500;
	private Set<Property> propertiesOwned;
	private int locationOnBoard = 0;
	private boolean inJail = false;
	
	public Player(){
		this.propertiesOwned = new HashSet <Property>(); 
	}
}
