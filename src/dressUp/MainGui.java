package dressUp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import java.awt.Component;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

public class MainGui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui window = new MainGui();
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
	public MainGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 353, 385, 147);
		frame.getContentPane().add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dress A ", "Dress B ", "Dress C"}));
		comboBox.setBounds(412, 51, 96, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Shoe A", "Shoe B", "Shoe C"}));
		comboBox_1.setBounds(412, 221, 96, 22);
		frame.getContentPane().add(comboBox_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(618, 27, 241, 449);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(106, 5, 28, 14);
		panel.add(lblModel);
		
		JPanel dressPanel = new JPanel();
		dressPanel.setBounds(10, 11, 392, 147);
		frame.getContentPane().add(dressPanel);
		dressPanel.setLayout(null);
		
		JLabel lblDressA = new JLabel("Dress A");
		lblDressA.setBounds(25, 11, 44, 14);
		dressPanel.add(lblDressA);
		
		JLabel lblDressB = new JLabel("Dress B");
		lblDressB.setBounds(178, 11, 46, 14);
		dressPanel.add(lblDressB);
		
		JLabel lblDressC = new JLabel("Dress C");
		lblDressC.setBounds(318, 11, 46, 14);
		dressPanel.add(lblDressC);
		
		JLabel lblPicDA = new JLabel("");
		lblPicDA.setBounds(10, 36, 91, 100);
		dressPanel.add(lblPicDA);
		
		JLabel lblPicDB = new JLabel("");
		lblPicDB.setBounds(149, 36, 91, 100);
		dressPanel.add(lblPicDB);
		
		JLabel lblPicDC = new JLabel("");
		lblPicDC.setBounds(291, 36, 91, 100);
		dressPanel.add(lblPicDC);
		
		JPanel ShoesPanel = new JPanel();
		ShoesPanel.setBounds(10, 182, 392, 147);
		frame.getContentPane().add(ShoesPanel);
		ShoesPanel.setLayout(null);
		
		JLabel lblShoeA = new JLabel("Shoe A");
		lblShoeA.setBounds(24, 11, 46, 14);
		ShoesPanel.add(lblShoeA);
		
		JLabel lblShoeB = new JLabel("Shoe B");
		lblShoeB.setBounds(172, 11, 46, 14);
		ShoesPanel.add(lblShoeB);
		
		JLabel lblShoeC = new JLabel("Shoe C");
		lblShoeC.setBounds(315, 11, 46, 14);
		ShoesPanel.add(lblShoeC);
		
		JLabel lblPicSA = new JLabel("");
		lblPicSA.setBounds(10, 36, 91, 100);
		ShoesPanel.add(lblPicSA);
		
		JLabel lblPicSB = new JLabel("");
		lblPicSB.setBounds(149, 36, 91, 100);
		ShoesPanel.add(lblPicSB);
		
		JLabel lblPicSC = new JLabel("");
		lblPicSC.setBounds(291, 36, 91, 100);
		ShoesPanel.add(lblPicSC);
	}
}
