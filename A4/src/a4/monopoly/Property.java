package a4.monopoly;

public class Property {
	private double listedPrice;
	private String name;
	private Player owner = null;
	private double mortgageValue;
	private int hotelsOwned = 0;
	private int housesOwned = 0;
	private boolean isOwned = false;
	private String color;
	private boolean isMortgaged = false;
	
	public Property(double listedPrice, String name, double mortgageValue){
		this.listedPrice = listedPrice;
		this.name = name;
		this.mortgageValue = mortgageValue;
	}
	
	
}
