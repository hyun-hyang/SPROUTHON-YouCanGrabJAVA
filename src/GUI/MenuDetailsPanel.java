package GUI;

import javax.swing.*;

import machine.Coffee;
import machine.Item;
import machine.ItemList;

import static machine.ItemList.classificationList;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

@SuppressWarnings("serial")
public class MenuDetailsPanel extends JPanel {
	
	Font font2;
	JLabel costJLabel;

	public MenuDetailsPanel(String menu, ItemList itemList) {
		
		setLayout(new GridLayout(0,1));
		setBackground(Color.white);
		
		
		Item item = itemList.getItem(menu);
		Font font1 = new Font("Tmon몬소리 Black",Font.BOLD,30);
		this.font2 = new Font("배달의민족 주아",Font.PLAIN, 20);
		
		//메뉴상세
		JLabel titleJLabel = new JLabel();
		titleJLabel.setText("메뉴상세");
		titleJLabel.setHorizontalAlignment(JLabel.CENTER);
		titleJLabel.setFont(font1);
		
		//이미지 넣기
		ImageIcon icon = new ImageIcon("img-src/beverage.png");
		Image img = icon.getImage();
		img = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		icon = new ImageIcon(img);
		
		//주문한 메뉴 보여주기
		JLabel jLabel = new JLabel();
		jLabel.setText(menu);
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		jLabel.setFont(font2);
		
		//가격 보여주기
		this.costJLabel = new JLabel();
		String costString = String.valueOf(item.getCost());
		costJLabel.setText(costString+"원");
		costJLabel.setHorizontalAlignment(JLabel.CENTER);
		costJLabel.setFont(font2);
		
		//주문 버튼
		JButton orderButton = new JButton("주문하기");
		
		
		add(titleJLabel);
		add(new JLabel(icon, SwingConstants.CENTER));
		add(jLabel);
		
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
		}  else if(item.getClassification().equals(classificationList.get(5))) {
			// 디저트
			SizeUp();
		}
		
		add(costJLabel);
		add(orderButton);
		
	
		orderButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "주문이 완료되었습니다!");
			}
		});
	}
	
	public void IsICE() { //radio
		
		JLabel jLabel = new JLabel("HOT&ICE");
		jLabel.setFont(font2);
		//this.add(jLabel);
		
		JRadioButton iceButton = new JRadioButton("ICE");
		JRadioButton hotButton = new JRadioButton("HOT");
		
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		iceButton.setHorizontalAlignment(JLabel.CENTER);
		hotButton.setHorizontalAlignment(JLabel.CENTER);
		
		iceButton.setSelected(true);
		
		ButtonGroup isICE = new ButtonGroup();
		
		isICE.add(iceButton);
		isICE.add(hotButton);
		
		JPanel jp1 = new JPanel(new GridLayout(0,1));
		jp1.add(jLabel);
		jp1.add(iceButton);
		jp1.add(hotButton);
		this.add(jp1);
		
	}
	
	public void SizeUp() { //radio 
		JLabel jLabel = new JLabel("사이즈 업 (+1000원)");
		jLabel.setFont(font2);
		
		JCheckBox sizeupBox = new JCheckBox("사이즈 업");
		
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		sizeupBox.setHorizontalAlignment(JLabel.CENTER);
		
		JPanel jp2 = new JPanel(new FlowLayout());
		jp2.add(jLabel);
		jp2.add(sizeupBox);
		this.add(jp2);
		
		sizeupBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(sizeupBox.isSelected()) {}
				
			}
		});
	}
	
	public void ExtraShot() { //check
		JLabel jLabel = new JLabel("샷 추가 (+300원)");
		jLabel.setFont(font2);
		
		JCheckBox extrashotBox = new JCheckBox("샷 추가");
		
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		extrashotBox.setHorizontalAlignment(JLabel.CENTER);
		
		JPanel jp = new JPanel(new FlowLayout());
		jp.add(jLabel);
		jp.add(extrashotBox);
		this.add(jp);
		
	}
	
	public void AddWhippedCream() { //check
		JLabel jLabel = new JLabel("휘핑 추가 (+300원)");
		jLabel.setFont(font2);
		
		JCheckBox addwhippedcreamBox = new JCheckBox("휘핑 추가");
		
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		addwhippedcreamBox.setHorizontalAlignment(JLabel.CENTER);
		
		JPanel jp = new JPanel(new FlowLayout());
		jp.add(jLabel);
		jp.add(addwhippedcreamBox);
		this.add(jp);
		
	}
	public void IsTumbler() { //radio
		
		JLabel jLabel = new JLabel("텀블러 사용 (-300원)");
		jLabel.setFont(font2);
		this.add(jLabel);
		
		JRadioButton noTumButton = new JRadioButton("텀블러 사용");
		JRadioButton TumButton = new JRadioButton("텀블러 사용 안함");
		
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		noTumButton.setHorizontalAlignment(JLabel.CENTER);
		TumButton.setHorizontalAlignment(JLabel.CENTER);
		
		TumButton.setSelected(true);
		
		ButtonGroup isTum = new ButtonGroup();
		
		isTum.add(noTumButton);
		isTum.add(TumButton);
		
		JPanel jp1 = new JPanel(new GridLayout(0,1));
		jp1.add(jLabel);
		jp1.add(noTumButton);
		jp1.add(TumButton);
		this.add(jp1);
		
	}
	public void IsDecaffeinated() { //check
		JLabel jLabel = new JLabel("디카페인 변경 (+500원)");
		jLabel.setFont(font2);
		
		JCheckBox isDecaffeinated = new JCheckBox("디카페인으로 변경");
		
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		isDecaffeinated.setHorizontalAlignment(JLabel.CENTER);
		
		JPanel jp = new JPanel(new FlowLayout());
		jp.add(jLabel);
		jp.add(isDecaffeinated);
		this.add(jp);
		
		
	}
}
