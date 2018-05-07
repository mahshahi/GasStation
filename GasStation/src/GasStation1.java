import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Font;

public class GasStation1 {

	private JFrame frmGasStationCashier;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GasStation1 window = new GasStation1();
					window.frmGasStationCashier.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GasStation1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGasStationCashier = new JFrame();
		frmGasStationCashier.setTitle("Gas Station Cashier");
		frmGasStationCashier.setIconImage(Toolkit.getDefaultToolkit().getImage(GasStation1.class.getResource("/resources/GasStation.png")));
		frmGasStationCashier.setBounds(100, 100, 600, 420);
		frmGasStationCashier.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGasStationCashier.getContentPane().setLayout(null);
		
		JLabel labelGas = new JLabel("");
		labelGas.setIcon(new ImageIcon(GasStation1.class.getResource("/resources/GasCost.png")));
		labelGas.setBounds(164, 40, 154, 100);
		frmGasStationCashier.getContentPane().add(labelGas);
		
		JLabel lblEnterTotalCost = new JLabel("Enter cost of gas purchased");
		lblEnterTotalCost.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterTotalCost.setBounds(333, 40, 220, 20);
		frmGasStationCashier.getContentPane().add(lblEnterTotalCost);
		
		JLabel label_1 = new JLabel("$");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(359, 82, 20, 20);
		frmGasStationCashier.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setBounds(378, 76, 154, 35);
		frmGasStationCashier.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel labelCarWash = new JLabel("");
		labelCarWash.setIcon(new ImageIcon(GasStation1.class.getResource("/resources/CarWash.png")));
		labelCarWash.setBounds(15, 156, 303, 100);
		frmGasStationCashier.getContentPane().add(labelCarWash);
		
		JLabel lblSelectIfIncluds = new JLabel("Select if car wash included");
		lblSelectIfIncluds.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSelectIfIncluds.setBounds(333, 156, 220, 20);
		frmGasStationCashier.getContentPane().add(lblSelectIfIncluds);
		
		JCheckBox chckbxAdds = new JCheckBox(" $ 10.00");
		chckbxAdds.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxAdds.setBounds(372, 188, 135, 35);
		frmGasStationCashier.getContentPane().add(chckbxAdds);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(15, 291, 538, 2);
		frmGasStationCashier.getContentPane().add(separator);
		
		JButton btnPay = new JButton("Pay");
		btnPay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPay.setBounds(15, 309, 115, 29);
		frmGasStationCashier.getContentPane().add(btnPay);
		
		JButton btnPrintReceipt = new JButton("Print Receipt");
		btnPrintReceipt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPrintReceipt.setBounds(191, 309, 187, 29);
		frmGasStationCashier.getContentPane().add(btnPrintReceipt);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(438, 309, 115, 29);
		frmGasStationCashier.getContentPane().add(btnClear);
	}
}
