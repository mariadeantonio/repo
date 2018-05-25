package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Vista extends JFrame {
public Image imagenFondo1, imagenFondo2, imagenFondo3;
public URL fondo, fondo2, fondo3;
private JTextField textField_login;
private JTextField textField_pass;
private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);//centrarla en la ventana
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
		setBounds(100, 0, 1050, 850);
		getContentPane().setLayout(new BorderLayout(0, 0));
		//this.setSize(new Dimension(1200, 800));
		
		fondo=this.getClass().getResource("barner.PNG");
		imagenFondo1=new ImageIcon(fondo).getImage();
		
		
		fondo2=this.getClass().getResource("fondo.PNG");
		imagenFondo2=new ImageIcon(fondo2).getImage();
		fondo3=this.getClass().getResource("fondoPanel.PNG");
		imagenFondo3=new ImageIcon(fondo3).getImage();
		JPanel panel = new JPanel()
		 
		{
		public void paintComponent(Graphics g) {
	    g.drawImage(imagenFondo1, 0, 0, getWidth() , getHeight(), this);
		}	
		}
		;
		
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setBorder(new EmptyBorder(140, 5, 5, 5));
		
	
		
		
	    JTabbedPane pestañas=new JTabbedPane();
		
		    JPanel panel0 =new JPanel() {
			public void paintComponent(Graphics g) {
		    g.drawImage(imagenFondo2, 0, 0, getWidth() , getHeight(), this);
			}	
			}
			;		
	        pestañas.addTab("INFORMACION", panel0);
	
	        
	        
	        PanelVentas panel1= new  PanelVentas() {
	        public void paintComponent(Graphics g) {
	        g.drawImage(imagenFondo3, 0, 0, getWidth() , getHeight(), this);
			}
	        }
			;	
	      //  panel1.setBackground(Color.BLUE);
	        pestañas.addTab("VENTAS", panel1);
	 
	        
	        
	        PanelDevoluciones panel2=new PanelDevoluciones() {;
	        public void paintComponent(Graphics g) {
		    g.drawImage(imagenFondo3, 0, 0, getWidth() , getHeight(), this);
			}
		    }
			;
	        
	        pestañas.addTab("DEVOLUCIONES", panel2);
	        panel2.setBackground(Color.RED);
	 
	       
	        PanelClientes panel3= new  PanelClientes() {
	        public void paintComponent(Graphics g) {
		    g.drawImage(imagenFondo3, 0, 0, getWidth() , getHeight(), this);
			}
	        }
			;	
	        pestañas.addTab("CLIENTES", panel3);
	     
	        
	        PanelProductos panel4=new PanelProductos() {
	        public void paintComponent(Graphics g) {
			g.drawImage(imagenFondo3, 0, 0, getWidth() , getHeight(), this);
			}
	        }
		    ;	
	        pestañas.addTab("PRODUCTOS", panel4);
	        
	        
	        
	        
	        
	      
	        JPanel panel5=new JPanel();
	        panel5.setBackground(Color.PINK);
	        pestañas.addTab("ADMINISTRACION", panel5);
		
	        getContentPane().add(pestañas, BorderLayout.CENTER);
			
		
		}
	}

