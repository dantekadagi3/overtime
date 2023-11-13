import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class OVERTIMEWORKED {

	private JFrame frame;
	private JTextField FW1;
	private JTextField FW2;
	private JTextField FW3;
	private JTextField FW4;
	private JTextField FW5;
	private JTextField FW6;
	private JTextField SW1;
	private JTextField SW2;
	private JTextField SW3;
	private JTextField SW4;
	private JTextField SW5;
	private JTextField SW6;
	private JTextField name;
	private JTextField Hsalary;
	private JTextField REGHRS;
	private JTextField OVHRS;
	private JTextField REGAMT;
	private JTextField OVAMT;
	private JTextField NETPAY;
	private JTextField FW7;
	private JTextField SW7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OVERTIMEWORKED window = new OVERTIMEWORKED();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OVERTIMEWORKED() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 993, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Employee Identification", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel.setBounds(22, 22, 916, 88);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		name = new JTextField();
		name.setBounds(220, 32, 221, 24);
		panel.add(name);
		name.setColumns(10);
		
		Hsalary = new JTextField();
		Hsalary.setBounds(623, 34, 109, 24);
		panel.add(Hsalary);
		Hsalary.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(64, 33, 146, 19);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hourly Salary:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(499, 37, 96, 13);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Time Sheet", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBounds(22, 139, 916, 182);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Week:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(14, 61, 65, 13);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Second Week:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(14, 96, 95, 13);
		panel_1.add(lblNewLabel_1);
		
		FW1 = new JTextField();
		FW1.setBounds(107, 58, 72, 19);
		panel_1.add(FW1);
		FW1.setColumns(10);
		
		FW2 = new JTextField();
		FW2.setBounds(208, 58, 72, 19);
		panel_1.add(FW2);
		FW2.setColumns(10);
		
		FW3 = new JTextField();
		FW3.setBounds(329, 58, 72, 19);
		panel_1.add(FW3);
		FW3.setColumns(10);
		
		FW4 = new JTextField();
		FW4.setBounds(459, 58, 72, 19);
		panel_1.add(FW4);
		FW4.setColumns(10);
		
		FW5 = new JTextField();
		FW5.setBounds(586, 58, 72, 19);
		panel_1.add(FW5);
		FW5.setColumns(10);
		
		FW6 = new JTextField();
		FW6.setBounds(684, 58, 72, 19);
		panel_1.add(FW6);
		FW6.setColumns(10);
		
		SW1 = new JTextField();
		SW1.setBounds(107, 93, 72, 19);
		panel_1.add(SW1);
		SW1.setColumns(10);
		
		SW2 = new JTextField();
		SW2.setBounds(208, 93, 72, 19);
		panel_1.add(SW2);
		SW2.setColumns(10);
		
		SW3 = new JTextField();
		SW3.setBounds(329, 93, 72, 19);
		panel_1.add(SW3);
		SW3.setColumns(10);
		
		SW4 = new JTextField();
		SW4.setBounds(459, 93, 72, 19);
		panel_1.add(SW4);
		SW4.setColumns(10);
		
		SW5 = new JTextField();
		SW5.setBounds(586, 93, 72, 19);
		panel_1.add(SW5);
		SW5.setColumns(10);
		
		SW6 = new JTextField();
		SW6.setBounds(684, 93, 72, 19);
		panel_1.add(SW6);
		SW6.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Monday");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(121, 39, 45, 13);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tuesday");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(220, 39, 45, 13);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Wedenesday");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(329, 39, 72, 13);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Thursday");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(459, 39, 61, 13);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Friday");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_8.setBounds(586, 35, 58, 13);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Saturday");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_9.setBounds(695, 35, 58, 13);
		panel_1.add(lblNewLabel_9);
		
		FW7 = new JTextField();
		FW7.setBounds(791, 58, 72, 19);
		panel_1.add(FW7);
		FW7.setColumns(10);
		
		SW7 = new JTextField();
		SW7.setBounds(791, 93, 72, 19);
		panel_1.add(SW7);
		SW7.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Sunday");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_10.setBounds(809, 39, 72, 13);
		panel_1.add(lblNewLabel_10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Payroll Processing", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_2.setBounds(22, 376, 923, 151);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Process it");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				double Hrlsalary= Double.parseDouble(Hsalary.getText());	
				 double FH_1= Double.parseDouble(FW1.getText());
				 double FH_2= Double.parseDouble(FW2.getText());
				 double FH_3= Double.parseDouble(FW3.getText());
				 double FH_4= Double.parseDouble(FW4.getText());
				 double FH_5= Double.parseDouble(FW5.getText());
				 double FH_6= Double.parseDouble(FW6.getText());
				 double FH_7= Double.parseDouble(FW7.getText());
				 
				 double SH_1= Double.parseDouble(SW1.getText());
				 double SH_2= Double.parseDouble(SW2.getText());
				 double SH_3= Double.parseDouble(SW3.getText());
				 double SH_4= Double.parseDouble(SW4.getText());
				 double SH_5= Double.parseDouble(SW5.getText());
				 double SH_6= Double.parseDouble(SW6.getText());
				 double SH_7= Double.parseDouble(SW7.getText());
				 
				 double th1=FH_1+FH_2+FH_3+FH_4+FH_5+FH_6+FH_7;
				 double th2=SH_1+SH_2+SH_3+SH_4+SH_5+SH_6+SH_7;
				 double  Total=th1+th2;
				 
				  
				 double diff;
				 double different=0;
				 double diff2,different2=0;
				 
				 
				 for(int i=1;i<=7;i++) {
						
						diff= FH_1-8;
						if(diff>0) {
							different+=diff;
							
						} 
					 } 
				 
				 for(int i=1;i<=7;i++) {
						diff2= SH_1-8;
						if(diff2>0) {
							different2+=diff2;
							
						} 
					 } 
				 double totalovertime=different+different2;
				 double regular=Total-totalovertime;
				 double ovamt=totalovertime*Hrlsalary;
				 double regamt=regular*Hrlsalary;
				 double netpay=regamt-ovamt;
				 
				 REGHRS.setText(String.valueOf(regular));
				 OVHRS.setText(String.valueOf(totalovertime));
				 REGAMT.setText(String.valueOf(regamt));
				 OVAMT.setText(String.valueOf(ovamt));
				 NETPAY.setText(String.valueOf(netpay));
	
				
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(25, 40, 96, 86);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(734, 40, 96, 86);
		panel_2.add(btnNewButton_1);
		
		REGHRS = new JTextField();
		REGHRS.setBounds(285, 56, 72, 19);
		panel_2.add(REGHRS);
		REGHRS.setColumns(10);
		
		OVHRS = new JTextField();
		OVHRS.setBounds(285, 85, 72, 19);
		panel_2.add(OVHRS);
		OVHRS.setColumns(10);
		
		REGAMT = new JTextField();
		REGAMT.setBounds(367, 54, 72, 19);
		panel_2.add(REGAMT);
		REGAMT.setColumns(10);
		
		OVAMT = new JTextField();
		OVAMT.setBounds(367, 85, 72, 19);
		panel_2.add(OVAMT);
		OVAMT.setColumns(10);
		
		NETPAY = new JTextField();
		NETPAY.setBounds(599, 74, 96, 19);
		panel_2.add(NETPAY);
		NETPAY.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Hours");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_11.setBounds(291, 33, 45, 13);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Amount");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_12.setBounds(381, 31, 45, 13);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Regular:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_13.setBounds(208, 59, 52, 13);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Overtime:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_14.setBounds(208, 88, 65, 13);
		panel_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Net Pay:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_15.setBounds(544, 77, 52, 13);
		panel_2.add(lblNewLabel_15);
	}
}
