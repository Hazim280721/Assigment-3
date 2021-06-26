package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.k33ptoo.components.KGradientPanel;
import com.k33ptoo.components.KButton;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;

public class Admin extends JFrame {

	private JPanel contentPane;
	private String s, s1,s2,s3,s4,s5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Admin() {
		setTitle("Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 660);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				employee RegSys = new employee(); //calling another frame/window
				
	            RegSys.setVisible(true);	
			}
		});
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(378, 213, 142, 125);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(new Rectangle(0, 0, 64, 64));
		lblNewLabel.setIcon(new ImageIcon(Admin.class.getResource("/gui/imge/icons8-employee-64.png")));
		lblNewLabel.setBounds(41, 10, 64, 64);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 94, 122, 21);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Inventory RegSys = new Inventory(); //calling another frame/window
				
	            RegSys.setVisible(true);		
			}
		});
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(519, 213, 142, 125);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Admin.class.getResource("/gui/imge/icons8-in-inventory-64.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(new Rectangle(0, 0, 64, 64));
		lblNewLabel_2.setBounds(40, 10, 64, 64);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Inventory");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 94, 122, 21);
		panel_1.add(lblNewLabel_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				finance RegSys = new finance(); //calling another frame/window
				
	            RegSys.setVisible(true);	
			}
		});
		panel_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1.setBounds(661, 213, 142, 125);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setBounds(42, 10, 64, 62);
		lblNewLabel_2_1.setIcon(new ImageIcon(Admin.class.getResource("/gui/imge/icons8-investment-64.png")));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Finance");
		lblNewLabel_1_1_1.setBounds(0, 91, 142, 24);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				CompanyInfo RegSys = new CompanyInfo(); //calling another frame/window
				
	            RegSys.setVisible(true);	
			}
		});
		panel_1_2.setBackground(new Color(224, 255, 255));
		panel_1_2.setBounds(378, 337, 142, 125);
		contentPane.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Admin.class.getResource("/gui/imge/icons8-company-64.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(new Rectangle(0, 0, 64, 64));
		lblNewLabel_3.setBounds(39, 10, 64, 64);
		panel_1_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Company Info");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(10, 94, 122, 21);
		panel_1_2.add(lblNewLabel_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Sales RegSys = new Sales(); //calling another frame/window
				
	            RegSys.setVisible(true);	
			}
		});
		panel_1_3.setBackground(new Color(224, 255, 255));
		panel_1_3.setBounds(519, 337, 142, 125);
		contentPane.add(panel_1_3);
		panel_1_3.setLayout(null);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setIcon(new ImageIcon(Admin.class.getResource("/gui/imge/icons8-user-64.png")));
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2.setBounds(new Rectangle(0, 0, 64, 64));
		lblNewLabel_3_2.setBounds(41, 10, 64, 64);
		panel_1_3.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("User");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_1_2_2.setBounds(10, 94, 122, 21);
		panel_1_3.add(lblNewLabel_1_2_2);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Admin", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		panel_1_4.setBackground(new Color(224, 255, 255));
		panel_1_4.setBounds(661, 337, 142, 125);
		contentPane.add(panel_1_4);
		panel_1_4.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setIcon(new ImageIcon(Admin.class.getResource("/gui/imge/icons8-exit-64.png")));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setBounds(new Rectangle(0, 0, 64, 64));
		lblNewLabel_3_1.setBounds(40, 10, 64, 64);
		panel_1_4.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Exit");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(10, 94, 122, 21);
		panel_1_4.add(lblNewLabel_1_2_1);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kBorderRadius = 0;
		gradientPanel.kStartColor = new Color(255, 105, 180);
		gradientPanel.kEndColor = new Color(0, 191, 255);
		gradientPanel.setBounds(10, 10, 276, 603);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("Crowne Restaurant");
		lblNewLabel_2_2.setBounds(52, 160, 172, 29);
		lblNewLabel_2_2.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		gradientPanel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_6 = new JLabel("Classic & Retro");
		lblNewLabel_6.setBounds(82, 194, 106, 22);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		gradientPanel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Contact Us");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_7.setBounds(82, 251, 106, 29);
		gradientPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon(Admin.class.getResource("/gui/imge/icons8-facebook-f-64.png")));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setBounds(new Rectangle(0, 0, 64, 64));
		lblNewLabel_8.setBounds(102, 290, 64, 64);
		gradientPanel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon(Admin.class.getResource("/gui/imge/icons8-instagram-64.png")));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9.setBounds(new Rectangle(0, 0, 64, 64));
		lblNewLabel_9.setBounds(102, 364, 64, 64);
		gradientPanel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("New label");
		lblNewLabel_9_1.setIcon(new ImageIcon(Admin.class.getResource("/gui/imge/icons8-twitter-64.png")));
		lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9_1.setBounds(new Rectangle(0, 0, 64, 64));
		lblNewLabel_9_1.setBounds(102, 441, 64, 64);
		gradientPanel.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(63, 10, 150, 150);
		gradientPanel.add(lblNewLabel_5);
		lblNewLabel_5.setIcon(new ImageIcon(Admin.class.getResource("/gui/imge/icon_Restaurant-and-Bars-150x150.png")));
		
		JLabel lblNewLabel_4 = new JLabel("DASHBOARD");
		lblNewLabel_4.setBounds(417, 66, 344, 68);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(new Color(255, 105, 180));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 41));
	}
}
