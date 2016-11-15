
public abstract class Affix{

	private String properties;
	private String affixName;
	private double multiplier;
	protected String tooltip;
	
	public Affix(){
		properties = "";
		affixName = "";
		tooltip = "";
		multiplier = 0.0; //UPDATE
	}
	
	public String getAffixName() {
		return affixName;
	}
	public void setAffixName(String affix) {
		this.affixName = affix;
	}
	
	public String getProperties() {
		return properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}
	
	public double getMultiplier() { //UPDATE
		return multiplier;
	}
	
	public void setMultiplier( double m){ //UPDATE
		this.multiplier = m;
	}

	abstract void imbue(Weapon wep);
	
	//abstract void imbue(Armor arm);
	
	abstract String getTooltip();
	
	abstract void setTooltip(String tooltip) ;
}
