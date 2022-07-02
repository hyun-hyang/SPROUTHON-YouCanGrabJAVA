package GUI;

import java.awt.*;
import javax.swing.*;

import machine.*;


@SuppressWarnings("serial")
public class ItemSelectFrame extends JFrame{

	ItemList itemList;
	MenuListPanel menuListPanel;
	
	public ItemSelectFrame(){
		setTitle("키오스크");
		setSize(900, 2100);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null); 
		setResizable(false);
		
		
		ItemList itemList = new ItemList();
		MenuListPanel menuListPanel = new MenuListPanel(itemList);
		
		add(new MenuTitlePanel(), BorderLayout.NORTH);
		add(menuListPanel, BorderLayout.CENTER);
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
