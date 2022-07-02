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
			SizeUp();
			IsDecaffeinated();
			IsTumbler();
		} else if(item.getClassification().equals(classificationList.get(2))) {
			// 논 커피
			IsICE();
			SizeUp();
			IsTumbler();
		} else if(item.getClassification().equals(classificationList.get(3))) {
			// 티/에이드
			IsICE();
			SizeUp();
			IsTumbler();
		} else if(item.getClassification().equals(classificationList.get(4))) {
			// 프라페/블렌디드
			SizeUp();
			IsTumbler();
		}  else if(item.getClassification().equals(classificationList.get(3))) {
			// 디저트
			SizeUp();
		}
		
		
	}
	
	public void IsICE() { //radio
		
		JLabel jLabel = new JLabel("HOT&ICE");
		jLabel.setFont(font2);
		this.add(jLabel);
		
		JRadioButton iceButton = new JRadioButton("ICE");
		JRadioButton hotButton = new JRadioButton("HOT");
		
		iceButton.setSelected(true);
		
		ButtonGroup isICE = new ButtonGroup();
		
		isICE.add(iceButton);
		isICE.add(hotButton);
		
		this.add(iceButton);
		this.add(hotButton);
		
	}
	
	public void SizeUp() { //radio 
		JLabel jLabel = new JLabel("사이즈 업 여부");
		jLabel.setFont(font2);
		this.add(jLabel);
		JCheckBox sizeupBox = new JCheckBox("사이즈 업");
		this.add(sizeupBox);
	}
	
	public void ExtraShot() { //check
		JLabel jLabel = new JLabel("샷 추가 여부");
		jLabel.setFont(font2);
		this.add(jLabel);
		JCheckBox extrashotBox = new JCheckBox("샷 추가");
		this.add(extrashotBox);
	}
	
	public void AddWhippedCream() { //check
		JLabel jLabel = new JLabel("휘핑 추가 여부");
		jLabel.setFont(font2);
		this.add(jLabel);
		JCheckBox addwhippedcreamBox = new JCheckBox("휘핑 추가");
		this.add(addwhippedcreamBox);
	}
	public void IsTumbler() { //radio
		
		JLabel jLabel = new JLabel("텀블러 사용 여부");
		jLabel.setFont(font2);
		this.add(jLabel);
		
		JRadioButton noTumButton = new JRadioButton("텀블러 사용");
		JRadioButton TumButton = new JRadioButton("텀블러 사용 안함");
		
		TumButton.setSelected(true);
		
		ButtonGroup isTum = new ButtonGroup();
		
		isTum.add(noTumButton);
		isTum.add(TumButton);
		
		this.add(noTumButton);
		this.add(TumButton);
		
	}
	public void IsDecaffeinated() { //check
		JLabel jLabel = new JLabel("디카페인 변경 여부");
		jLabel.setFont(font2);
		this.add(jLabel);
		JCheckBox isDecaffeinated = new JCheckBox("디카페인으로 변경");
		this.add(isDecaffeinated);
	}
}
