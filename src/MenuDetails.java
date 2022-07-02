
public class MenuDetails extends Item{
	private boolean isICE; // hot/ice 여부 
	private boolean sizeUp; // 사이즈 업
	private boolean extraShot; // 샷 추가
	private boolean addWhippedCream; // 휘핑 추가
	private boolean isDecaffeinated; // 디카페인
	private boolean isTumbler; //텀블러 여부
	
	public MenuDetails(String classification, String menuName, int cost){
		super(classification, menuName, cost);
	}

	
	public void setIsICE(boolean isICE) {
		this.isICE = isICE;
	}
	
	public void setSizeUp(boolean sizeUp) {
		this.sizeUp = sizeUp;
		if(this.sizeUp) this.cost += 2000;
	}
	
	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
		if(this.extraShot) this.cost += 300;
	}
	
	public void setAddWhippedCream(boolean addWhippedCream) {
		this.addWhippedCream = addWhippedCream;
		if(this.addWhippedCream) this.cost += 300;
	}
	
	public void setIsDecaffeinated(boolean isDecaffeinated) {
		this.isDecaffeinated = isDecaffeinated;
		if(this.isDecaffeinated) this.cost += 500;
	}
	
	public void setIsTumbler(boolean isTumbler) {
		this.isTumbler = isTumbler;
		if(this.isTumbler) this.cost -= 300;
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
