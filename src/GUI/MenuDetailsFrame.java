package GUI;

import javax.swing.*;

import machine.Item;
import machine.ItemList;

import java.awt.*;

@SuppressWarnings("serial")
public class MenuDetailsFrame extends JFrame{
	
	
	public MenuDetailsFrame(String menu, ItemList itemList) {
		
		setTitle("메뉴 사부사항");
		setSize(900, 1300);
		
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new GridLayout(0,1,300,300));
		
		
		add(new MenuDetailsPanel(menu, itemList));
		
		pack();
		setVisible(true);
	}
}
