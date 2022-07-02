package GUI;
import static machine.ItemList.classificationList;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class MenuTitlePanel extends JPanel{

	
	JButton[] jbtArr;
	MenuListPanel menuListPanel;
	Color color1;
	
	public MenuTitlePanel(MenuListPanel menuListPanel) {
		
		this.menuListPanel = menuListPanel;
		//5x1로 레이아웃 정렬함. 
		setLayout(new FlowLayout());
		
		this.jbtArr = new JButton[classificationList.size()];
		Font font1 = new Font("Tmon몬소리 Black",Font.BOLD,30);
		this. color1 = new Color(231,199,148);
		
		
		for(int i = 0; i < classificationList.size(); i++) {
			jbtArr[i] = new JButton("" + classificationList.get(i));
			jbtArr[i].setFont(font1);
			//jbtArr[i].setForeground(Color.white);
			jbtArr[i].setBackground(color1);
			add(jbtArr[i]);
			jbtArr[i].addActionListener(new ListenerExample());
		}
	}
		class ListenerExample implements ActionListener {	
			@Override
			public void actionPerformed(ActionEvent e) {	
				String writtenString = (String) e.getActionCommand();
				menuListPanel.displayMenuList(writtenString);

				for(int i = 0; i < classificationList.size(); i++) {
					if(writtenString.equals(classificationList.get(i))) {
						jbtArr[i].setBackground(Color.white);
					} else {
						jbtArr[i].setBackground(color1);
					}
				}
				
			}
		};
}
		
//		jbtCOFFEE = new JButton("커피");
//		jbtCOLDBREW = new JButton("콜드브루");
//		jbtNONCOFFEE = new JButton("논 커피");
//		jbtTEE = new JButton("티/에이드");
//		jbtPRAFFE = new JButton("프라페/블렌디드");
//		jbtDESSERT = new JButton("디저트");
//		
//		
//		
//		add(jbtCOFFEE);
//		add(jbtCOLDBREW);
//		add(jbtNONCOFFEE);
//		add(jbtTEE);
//		add(jbtPRAFFE);
//		add(jbtDESSERT);
		
//		/** 🔘 COFFEE 클릭 */
//		jbtCOFFEE.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				menuListPanel.displayMenuList("커피");
//				jbtCOFFEE.setBackground(Color.white);
//			}
//		});
//		
//		/** 🔘 COLDBREW 클릭 */
//		jbtCOLDBREW.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				menuListPanel.displayMenuList("콜드브루");
//				jbtCOLDBREW.setBackground(Color.white);
//			}
//		});
//		
//		/** 🔘 NONCOFFEE 클릭 */
//		jbtNONCOFFEE.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				menuListPanel.displayMenuList("논 커피");
//				jbtNONCOFFEE.setBackground(Color.white);
//			}
//		});
//		
//		/** 🔘 TEE 클릭 */
//		jbtTEE.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				menuListPanel.displayMenuList("티/에이드");
//				jbtTEE.setBackground(Color.white);
//			}
//		});
//		
//		/** 🔘PRAFFE 클릭 */
//		jbtPRAFFE.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				jbtPRAFFE.setBackground(Color.white);
//			}
//		});
//		
//		/** 🔘DESSERT 클릭 */
//		jbtDESSERT.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				jbtDESSERT.setBackground(Color.white);
//			}
//		});
		


