import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class MenuTitlePanel extends JPanel{

	JButton jbtCOFFEE, jbtCOLDBREW, jbtNONCOFFEE, jbtTEE, jbtPRAFFE, jbtDESSERT;
	
	public MenuTitlePanel() {
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
				
			}
		});
		
		
	}
}
