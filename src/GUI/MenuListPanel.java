package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
		setLayout(new GridLayout(5,3,3,3));
		displayMenuList(classification);
		JButton menuButton = new JButton();
		/** 🔘 ADD 클릭 */
		menuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You have been clicked!");
			}
		});
	}

	public MenuListPanel(ItemList itemList, String classification) {
		
	}
	
	
	public void displayMenuList(String classification) {
		Font font2 = new Font("배달의민족 주아",Font.PLAIN, 20);
		removeAll();
		JButton[] jbtArr = new JButton[itemList.getNumOfItemList()];
		for(int i = 0; i < itemList.getNumOfItemList(); i++) {
			Item item = itemList.getItem(i);
			if(item.getClassification().equals(classification)) {
				jbtArr[i] = new JButton("<html>"+item.getMenuName()+"<br>"+item.getCost()+"</html>", null);			
				jbtArr[i].setFont(font2);
				jbtArr[i].setBackground(Color.white);
				jbtArr[i].setHorizontalTextPosition(SwingConstants.CENTER);
				jbtArr[i].setPreferredSize(new Dimension(300,100));
				add(jbtArr[i]);
			}
		}
		updateUI();

	}
	
}
