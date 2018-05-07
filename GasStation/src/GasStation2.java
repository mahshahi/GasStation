import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GasStation2 {

	private JFrame frmCarServiceSystem;
	private JTextField txtGasCost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GasStation2 window = new GasStation2();
					window.frmCarServiceSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GasStation2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCarServiceSystem = new JFrame();
		frmCarServiceSystem.setTitle("Car Service System");
		frmCarServiceSystem.setIconImage(Toolkit.getDefaultToolkit().getImage(GasStation2.class.getResource("/resources/GasStation.png")));
		frmCarServiceSystem.setBounds(100, 100, 600, 420);
		frmCarServiceSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCarServiceSystem.getContentPane().setLayout(null);
		
		JLabel labelGas = new JLabel("");
		labelGas.setIcon(new ImageIcon(GasStation2.class.getResource("/resources/GasCost.png")));
		labelGas.setBounds(164, 40, 154, 100);
		frmCarServiceSystem.getContentPane().add(labelGas);
		
		JLabel lblEnterTotalCost = new JLabel("Enter cost of gas purchased");
		lblEnterTotalCost.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterTotalCost.setBounds(333, 40, 220, 20);
		frmCarServiceSystem.getContentPane().add(lblEnterTotalCost);
		
		JLabel label_1 = new JLabel("$");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(359, 82, 20, 20);
		frmCarServiceSystem.getContentPane().add(label_1);
		
		txtGasCost = new JTextField();
		txtGasCost.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char gcost = evt.getKeyChar();
				if(Character.isLetter(gcost) && !evt.isAltDown()){
					evt.consume();
				}
			}
		});
		txtGasCost.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtGasCost.setBounds(378, 76, 154, 35);
		frmCarServiceSystem.getContentPane().add(txtGasCost);
		txtGasCost.setColumns(10);
		
		JLabel labelCarWash = new JLabel("");
		labelCarWash.setIcon(new ImageIcon(GasStation2.class.getResource("/resources/CarWash.png")));
		labelCarWash.setBounds(15, 156, 303, 100);
		frmCarServiceSystem.getContentPane().add(labelCarWash);
		
		JLabel lblSelectIfIncluds = new JLabel("Select if car wash included");
		lblSelectIfIncluds.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSelectIfIncluds.setBounds(333, 156, 220, 20);
		frmCarServiceSystem.getContentPane().add(lblSelectIfIncluds);
		
		JCheckBox chckbxAdds = new JCheckBox(" $ 10.00", false);
		chckbxAdds.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxAdds.setBounds(372, 188, 135, 35);
		frmCarServiceSystem.getContentPane().add(chckbxAdds);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(15, 291, 538, 2);
		frmCarServiceSystem.getContentPane().add(separator);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ePay) {
				if (chckbxAdds.isSelected()) {
					JOptionPane.showMessageDialog(null, "Gas Amount: $"+Double.parseDouble(txtGasCost.getText())+"\nCar Wash: Yes");
		        } else {
		        	JOptionPane.showMessageDialog(null, "Gas Amount: $"+Double.parseDouble(txtGasCost.getText())+"\nCar Wash: No");
		        }
			}
		});
		btnPay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPay.setBounds(15, 309, 115, 29);
		frmCarServiceSystem.getContentPane().add(btnPay);
		
		JButton btnPrintReceipt = new JButton("Print Receipt");
		btnPrintReceipt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPrintReceipt.setBounds(191, 309, 187, 29);
		frmCarServiceSystem.getContentPane().add(btnPrintReceipt);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtGasCost.setText(null);
				chckbxAdds.setSelected(false);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(438, 309, 115, 29);
		frmCarServiceSystem.getContentPane().add(btnClear);
	}
}
