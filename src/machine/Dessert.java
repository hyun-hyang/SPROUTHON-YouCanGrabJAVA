package machine;

public class Dessert extends MenuDetails {

	public Dessert(String classification, String menuName, int cost, boolean isICE, boolean sizeUp, boolean isTumbler) {
		super(classification, menuName, cost);
		this.setIsICE(isICE);
		this.setSizeUp(sizeUp);
		this.setIsTumbler(isTumbler);
	}
	
}
