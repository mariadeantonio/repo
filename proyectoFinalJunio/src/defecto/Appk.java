package defecto;

import java.awt.EventQueue;

import controlador.ControladorProducto;
import modeloDAO.ProductoDAO;
import vista.PanelProductos;

public class Appk {
	
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				/*
				--------------------------
				Vista vista = new Vista();
				new Controlador(  , vista);
				*/
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
}
