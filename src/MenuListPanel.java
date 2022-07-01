import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuListPanel extends JPanel{
	
	String classification = "커피";
	ItemList itemList;
	JButton menuButton;

	public MenuListPanel(ItemList itemList) {
		setLayout(new GridLayout(5,3));
		displayMenuList(classification);
		
		/** 🔘 ADD 클릭 */
		menuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//“ADD”가 클릭→ 빈칸으로 구성된 북마크 정보 (BookmarkInfo) 화면을 보여주는 것만 구현.
				
			}
		});
	}

	public MenuListPanel(ItemList itemList, String classification) {
		
	}
	
	
	public void displayMenuList(String classification) {
		for(int i = 0; i < itemList.getNumOfItemList(); i++) {
			Item item = itemList.getItem(i);
			if(item.getClassification().equals(classification)) {
				JButton menuButton = new JButton(item.getMenuName()+"\n"+item.getCost(), null);
				add(menuButton);
			}
		}
	}
	
}
