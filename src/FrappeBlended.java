
public class FrappeBlended extends MenuDetails {

	public FrappeBlended(String classification, String menuName, int cost, boolean sizeUp, boolean isTumbler) {
		super(classification, menuName, cost);
		this.setSizeUp(sizeUp);
		this.setIsTumbler(isTumbler);
	}
	
}
