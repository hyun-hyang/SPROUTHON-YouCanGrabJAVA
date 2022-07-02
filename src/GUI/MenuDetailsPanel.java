package GUI;

import javax.swing.*;

import machine.Item;
import machine.ItemList;

import java.awt.*;

@SuppressWarnings("serial")
public class MenuDetailsPanel extends JPanel {

	
	public MenuDetailsPanel(String menu, ItemList itemList) {
		
		setLayout(new GridLayout(8,1));
		
		Item item = itemList.getItem(menu);
		Font font2 = new Font("배달의민족 주아",Font.PLAIN, 20);
		
		JLabel jLabel = new JLabel();
		jLabel.setText(menu);
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		jLabel.setFont(font2);
		
		ImageIcon icon = new ImageIcon("img-src/beverage.png");
		Image img = icon.getImage();
		img = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		icon = new ImageIcon(img);
		
		
		add(jLabel);
		add(new JLabel(icon, SwingConstants.CENTER));
		
		
	}
}
