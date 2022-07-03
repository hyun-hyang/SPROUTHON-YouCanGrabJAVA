package machine;

public class TeaAde extends MenuDetails{
	
	public TeaAde(String classification, String menuName, int cost) {
		super(classification, menuName, cost);
	}
	
	public TeaAde(String classification, String menuName, int cost, boolean isICE, boolean sizeUp, boolean isTumbler) {
		super(classification, menuName, cost);
		this.setIsICE(isICE);
		this.setSizeUp(sizeUp);
		this.setIsTumbler(isTumbler);
	}

}
