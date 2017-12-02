package ManueBarManagement;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

public class PopUpMenu_00 {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLable;
	private JPanel controlPanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PopUpMenu_00 window = new PopUpMenu_00();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PopUpMenu_00() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 400, 300);
		mainFrame.getContentPane().setLayout(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
        
        headerLabel=new JLabel("This is Header Lable",JLabel.CENTER);
        headerLabel.setBackground(Color.green);
        headerLabel.setBounds(43, 21, 301, 50);
        mainFrame.getContentPane().add(headerLabel);
        
        final JPopupMenu editMenu = new JPopupMenu("Edit");
        JMenuItem cutMenuItem = new JMenuItem ("Cut");
        cutMenuItem.setActionCommand("Cut");
        JMenuItem copyMenuItem = new JMenuItem ("Copy");
        copyMenuItem.setActionCommand("Copy");
        JMenuItem pasteMenuItem = new JMenuItem ("Paste");
        pasteMenuItem.setActionCommand("Paste");
        MenuItemListener menuItemListener = new MenuItemListener();
        cutMenuItem .addActionListener(menuItemListener);
        copyMenuItem .addActionListener(menuItemListener);
        pasteMenuItem .addActionListener(menuItemListener);
        editMenu.add(cutMenuItem );
        editMenu.add(copyMenuItem );
        editMenu.add(pasteMenuItem );
        
        mainFrame.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
        editMenu.show(mainFrame, e.getX(), e.getY());
        }
        });
        mainFrame.add(editMenu);
        mainFrame.setVisible(true);
        }
        }


class MenuItemListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
	
	
	}
}
