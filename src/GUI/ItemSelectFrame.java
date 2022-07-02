package GUI;

import java.awt.*;
import javax.swing.*;

import machine.*;


@SuppressWarnings("serial")
public class ItemSelectFrame extends JFrame{

	ItemList itemList;
	MenuListPanel menuListPanel;
	
	ItemSelectFrame(){
		setTitle("키오스크");
		setSize(900, 2100);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null); 
		setResizable(false);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
//		add(new MenuTitlePanel(), BorderLayout.NORTH);
//		
//		ItemList itemList = new ItemList();
//		
//		MenuListPanel menuListPanel = new MenuListPanel(itemList);
//		add(menuListPanel, BorderLayout.CENTER);
		
	}
}
