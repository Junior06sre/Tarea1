package Tarea2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing. JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class Listar_peliculas {

	private JFrame peliculas;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listar_peliculas window = new Listar_peliculas();
					window.peliculas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Listar_peliculas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		peliculas = new JFrame();
		peliculas.setTitle("Peliculas");
		peliculas.setBounds (100, 100, 450, 260);
		peliculas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		peliculas.getContentPane().setLayout (null);
		
		JLabel lblNewLabel = new JLabel("Escribe el titulo de una pelicula");
		lblNewLabel.setBounds (10, 34, 209, 14);
		peliculas.getContentPane () .add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds (10, 70, 171, 21);
		peliculas.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Peliculas");
		lblNewLabel_1.setHorizontalAlignment (SwingConstants. CENTER);
		lblNewLabel_1.setBounds (290, 34, 89, 14);
		peliculas.getContentPane ().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged (ItemEvent e) {
			comboBox.setSelectedIndex(comboBox.getSelectedIndex());
		}
		});

		comboBox.setModel(new DefaultComboBoxModel(new String[] {
				"Quantum of Solace","Avatar"})); 
		comboBox.setBounds (253, 69, 171, 22);
		peliculas.getContentPane().add(comboBox);

		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
		String Peliculas = textField.getText();
		comboBox.addItem(Peliculas);
		textField.setText (null);
		textField.requestFocus();
		}
		});
		
		btnNewButton.setBounds (54, 125, 89, 23);
		peliculas.getContentPane () .add( btnNewButton);
	}

}
