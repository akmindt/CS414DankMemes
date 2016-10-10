package a4.monopoly;

public class Property {
	private double listedPrice;
	private String name;
	private Player owner;
	private double mortgageValue;
	private int hotelsOwned;
	private int housesOwned;
	private boolean availToBuy;
	
	
	public Property(double listedPrice, String name, double mortgageValue){
		this.listedPrice = listedPrice;
		this.name = name;
		this.mortgageValue = mortgageValue;
		this.owner = null;
		this.hotelsOwned = 0;
		this.housesOwned = 0;
		this.availToBuy = true;
	}
}
