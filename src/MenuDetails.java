
public class MenuDetails extends Item{
	private boolean isICE; // hot/ice 여부 
	private boolean sizeUp; // 사이즈 업
	private boolean extraShot; // 샷 추가
	private boolean addWhippedCream; // 휘핑 추가
	private boolean isDecaffeinated; // 디카페인
	private boolean isTumbler; //텀블러 여부
	private int cost;
	
	public MenuDetails(String classification, String menuName, int cost, boolean isICE, boolean sizeUp, boolean extraShot, boolean addWhippedCream, boolean isTumbler){ // 커피류
		super(classification, menuName, cost);
		this.setIsICE(isICE);
		this.setSizeUp(sizeUp);
		this.setExtraShot(extraShot);
		this.setAddWhippedCream(addWhippedCream);
		this.setIsTumbler(isTumbler);
	}
	
	public MenuDetails(String classification, String menuName, int cost, boolean isDecaffeinated, boolean isTumbler) { // 콜드브루 류
		super(classification, menuName, cost);
		this.setIsDecaffeinated(isDecaffeinated);
		this.setIsTumbler(isTumbler);
	}
	
	public void setIsICE(boolean isICE) {
		this.isICE = isICE;
	}
	
	public void setSizeUp(boolean sizeUp) {
		this.sizeUp = sizeUp;
	}
	
	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}
	
	public void setAddWhippedCream(boolean addWhippedCream) {
		this.addWhippedCream = addWhippedCream;
	}
	
	public void setIsDecaffeinated(boolean isDecaffeinated) {
		this.isDecaffeinated = isDecaffeinated;
	}
	
	public void setIsTumbler(boolean isTumbler) {
		this.isTumbler = isTumbler;
	}
	
	public boolean getIsICE() {
		return isICE;
	}
	
	public boolean getSizeUp() {
		return sizeUp;
	}
	
	public boolean getExtraShot() {
		return extraShot;
	}
	
	public boolean getAddWhippedCream() {
		return addWhippedCream;
	}
	
	public boolean getIsDecaffeinated() {
		return isDecaffeinated;
	}
	
	public boolean getIsTumbler() {
		return isTumbler;
	}
}
