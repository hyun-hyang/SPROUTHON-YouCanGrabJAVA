package machine;

public class Coldbrew extends MenuDetails {
	
	public Coldbrew(String classification, String menuName, int cost) {
		super(classification, menuName, cost);
	}
	
	public Coldbrew(String classification, String menuName, int cost, boolean isICE, boolean sizeUp, boolean isDecaffeinated, boolean isTumbler) {
		super(classification, menuName, cost);
		this.setIsICE(isICE);
		this.setSizeUp(sizeUp);
		this.setIsDecaffeinated(isDecaffeinated);
		this.setIsTumbler(isTumbler);
	}
	
}
