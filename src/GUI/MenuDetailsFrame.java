package GUI;

import javax.swing.*;

import machine.Item;
import machine.ItemList;

import java.awt.*;

@SuppressWarnings("serial")
public class MenuDetailsFrame extends JFrame{
	
	
	public MenuDetailsFrame(String menu, ItemList itemList) {
		
		setTitle("메뉴 사부사항");
		setSize(900, 1800);
		
		setLocationRelativeTo(rootPane);
		setResizable(false);
		
		add(new MenuDetailsPanel(menu, itemList));
		
		setVisible(true);
	}
	

}
