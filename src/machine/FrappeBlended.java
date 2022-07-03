package machine;

public class FrappeBlended extends MenuDetails {
	
	public FrappeBlended(String classification, String menuName, int cost) {
		super(classification, menuName, cost);
	}

	public FrappeBlended(String classification, String menuName, int cost, boolean sizeUp, boolean isTumbler) {
		super(classification, menuName, cost);
		this.setSizeUp(sizeUp);
		this.setIsTumbler(isTumbler);
	}
	
}
