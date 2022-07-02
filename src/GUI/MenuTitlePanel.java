package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import machine.ItemList;

@SuppressWarnings("serial")
public class MenuTitlePanel extends JPanel{

	
	JButton jbtCOFFEE, jbtCOLDBREW, jbtNONCOFFEE, jbtTEE, jbtPRAFFE, jbtDESSERT;
	
	public MenuTitlePanel(MenuListPanel menuListPanel) {
		
		//5x1로 레이아웃 정렬함. 
		setLayout(new GridLayout(1,5));
		
		jbtCOFFEE = new JButton("커피");
		jbtCOLDBREW = new JButton("콜드브루");
		jbtNONCOFFEE = new JButton("논 커피");
		jbtTEE = new JButton("티/에이드");
		jbtPRAFFE = new JButton("프라페/블렌디드");
		jbtDESSERT = new JButton("디저트");
		
		add(jbtCOFFEE);
		add(jbtCOLDBREW);
		add(jbtNONCOFFEE);
		add(jbtTEE);
		add(jbtPRAFFE);
		add(jbtDESSERT);
		
		/** 🔘 COFFEE 클릭 */
		jbtCOFFEE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuListPanel.displayMenuList("커피");
			}
		});
		
		/** 🔘 COLDBREW 클릭 */
		jbtCOLDBREW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuListPanel.displayMenuList("콜드브루");
			}
		});
		
		/** 🔘 NONCOFFEE 클릭 */
		jbtNONCOFFEE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuListPanel.displayMenuList("논 커피");
			}
		});
		
		/** 🔘 TEE 클릭 */
		jbtTEE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuListPanel.displayMenuList("티/에이드");
			}
		});
		
		/** 🔘PRAFFE 클릭 */
		jbtPRAFFE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuListPanel.displayMenuList("프라페/블렌디드");
			}
		});
		
		/** 🔘DESSERT 클릭 */
		jbtDESSERT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuListPanel.displayMenuList("디저트");
			}
		});
		
		
	}
}
