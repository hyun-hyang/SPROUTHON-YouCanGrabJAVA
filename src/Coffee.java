
public class Coffee extends MenuDetails {
	
	public Coffee(String classification, String menuName, int cost, boolean isICE, boolean sizeUp, boolean extraShot, boolean addWhippedCream, boolean isTumbler) {
		super(classification, menuName, cost);
		this.setIsICE(isICE);
		this.setSizeUp(sizeUp);
		this.setExtraShot(extraShot);
		this.setAddWhippedCream(addWhippedCream);
		this.setIsTumbler(isTumbler);
	}

}