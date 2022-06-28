
public class Item {
	private String classification; //항목분류
	private String menuName; //메뉴
	private int cost; //가격
	private boolean soldoutStatus; //품절여부 (초기값 false)
	
	public Item(String classification, String menuName, int cost) {
		this.setClassification(classification);
		this.setMenuName(menuName);
		this.setCost(cost);
		//soloutStatus 초기값은 false이므로 굳이 주지않았다면 그대로 둔다. 
	}
	
	public Item(String classification, String menuName, int cost, boolean soldoutStatus) {
		this.setClassification(classification);
		this.setMenuName(menuName);
		this.setCost(cost);
		this.setSoldoutStatus(soldoutStatus);
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		/* 올바른 항목분류인지 확인후 set해준다 */
		if (ItemList.checkClassification(classification)) {
			this.classification = classification;
		}
	}

	public boolean isSoldoutStatus() {
		return soldoutStatus;
	}
	
	public void setSoldoutStatus(String soldoutStatus) {
		if(soldoutStatus.equals("품절")) {
			setSoldoutStatus(true);
		}
	}

	public void setSoldoutStatus(boolean soldoutStatus) {
		this.soldoutStatus = soldoutStatus;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		/* 0원 이상일 경우 set해준다 */
		if (cost>=0) {
			this.cost = cost;
		}
	}
	
	
}
