package machine;

public class Dessert extends MenuDetails {
	
	public Dessert(String classification, String menuName, int cost) {
		super(classification, menuName, cost);
	}

	public Dessert(String classification, String menuName, int cost, boolean isICE, boolean sizeUp, boolean isTumbler) {
		super(classification, menuName, cost);
		this.setSizeUp(sizeUp);
	}
	
}
