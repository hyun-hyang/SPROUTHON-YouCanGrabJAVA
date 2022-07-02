package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class OrderPanel extends JPanel{
	JTable table;
    DefaultTableModel model;
    JScrollPane scrollPane;
    
    public OrderPanel() {
    	String[] headerStrings = {"분류", "메뉴", "가격", "X"};
    }
	

}
