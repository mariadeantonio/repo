package controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
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
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setBorder(new EmptyBorder(40, 5, 5, 5));
		
		JButton btn_clientes = new JButton("CLIENTES");
		panel.add(btn_clientes);
		
		JButton btn_ventas = new JButton("VENTAS");
		btn_ventas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btn_ventas);
		
		JButton btn_devoluciones = new JButton("DEVOLUCIONES");
		panel.add(btn_devoluciones);
		
		JButton btn_productos = new JButton("PRODUCTOS");
		panel.add(btn_productos);
		
		JButton btn_informes = new JButton("INFORMES");
		panel.add(btn_informes);
		
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		
	}

}
