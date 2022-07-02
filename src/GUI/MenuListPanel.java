package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import machine.Item;
import machine.ItemList;

@SuppressWarnings("serial")
public class MenuListPanel extends JPanel{
	
	String classification = "커피";
	JButton menuButton;
	ItemList itemList;

	public MenuListPanel(ItemList itemList) {
		this.itemList = itemList;
		setLayout(new GridLayout(5,3));
		displayMenuList(classification);
		JButton menuButton = new JButton();
		/** 🔘 ADD 클릭 */
		menuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

	public MenuListPanel(ItemList itemList, String classification) {
		
	}
	
	
	public void displayMenuList(String classification) {
		removeAll();
		for(int i = 0; i < itemList.getNumOfItemList(); i++) {
			Item item = itemList.getItem(i);
			if(item.getClassification().equals(classification)) {
				JButton menuButton = new JButton(item.getMenuName()+"\n"+item.getCost(), null);
				add(menuButton);
			}
		}
		updateUI();

	}
	
}
