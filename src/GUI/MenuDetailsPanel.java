package GUI;

import javax.swing.*;

import machine.Item;
import machine.ItemList;

import static machine.ItemList.classificationList;

import java.awt.*;

@SuppressWarnings("serial")
public class MenuDetailsPanel extends JPanel {
	
	Font font2;

	public MenuDetailsPanel(String menu, ItemList itemList) {
		
		setLayout(new GridLayout(8,1));
		
		Item item = itemList.getItem(menu);
		this.font2 = new Font("배달의민족 주아",Font.PLAIN, 20);
		
		//주문한 메뉴 보여주기
		JLabel jLabel = new JLabel();
		jLabel.setText(menu);
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		jLabel.setFont(font2);
		
		//이미지 넣기
		ImageIcon icon = new ImageIcon("img-src/beverage.png");
		Image img = icon.getImage();
		img = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		icon = new ImageIcon(img);
		
		
		add(jLabel);
		add(new JLabel(icon, SwingConstants.CENTER));
		
		if(item.getClassification().equals(classificationList.get(0))){
			/* 커피 */
			IsICE();
			SizeUp();
			ExtraShot();
			AddWhippedCream();
			IsTumbler();
		} else if(item.getClassification().equals(classificationList.get(1))) {
			/* 콜드브루 */
			IsICE();
//			this.setSizeUp(sizeUp);
//			this.setIsDecaffeinated(isDecaffeinated);
//			this.setIsTumbler(isTumbler);
		} else if(item.getClassification().equals(classificationList.get(2))) {
			
		}
		
		
		
	}
	
	public void IsICE() { //radio
		
		JLabel jLabel = new JLabel("HOT&ICE");
		jLabel.setFont(font2);
		this.add(jLabel);
		
		JRadioButton iceButton = new JRadioButton("ice");
		JRadioButton hotButton = new JRadioButton("hot");
		
		iceButton.setSelected(true);
		
		ButtonGroup isICE = new ButtonGroup();
		
		isICE.add(iceButton);
		isICE.add(hotButton);
		
		this.add(iceButton);
		this.add(hotButton);
		
	}
	
	public void SizeUp() { //radio //refactor -rename
		JRadioButton iceButton = new JRadioButton("ICE");
		JRadioButton hotButton = new JRadioButton("HOT");
		
		iceButton.setSelected(true);
		
		ButtonGroup isICE = new ButtonGroup();
		
		isICE.add(iceButton);
		isICE.add(hotButton);
		
		this.add(iceButton);
		this.add(hotButton);
	}
	
	public void ExtraShot() { //check
		JCheckBox extrashotBox = new JCheckBox("ExtraShot");
		this.add(extrashotBox);
	}
	
	public void AddWhippedCream() { //check
		
	}
	public void IsTumbler() { //radio
		
	}
	public void IsDecaffeinated() { //check
		
	}
}
