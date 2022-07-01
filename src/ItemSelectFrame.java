
import java.awt.*;
import java.util.Set;

import javax.swing.*;

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
		
		ItemList itemList = new ItemList();
		
		add(new MenuTitlePanel(), BorderLayout.NORTH);
		
		MenuListPanel menuListPanel = new MenuListPanel(itemList);
		add(menuListPanel, BorderLayout.CENTER);
	}
}
