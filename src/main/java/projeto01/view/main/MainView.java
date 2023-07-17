package projeto01.view.main;

import java.awt.Dimension;
import java.awt.Image;


import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import projeto01.view.utils.GetScreenSize;
import projeto01.view.login.Login;

public class MainView {
	public void init() {
		firstWindow();
	}
	
	public void firstWindow() {
		JFrame frame = new JFrame();
		frame.setTitle("Sistema de Cadastro de Licitações");
		Dimension d = GetScreenSize.getScreenSize();
		int widht = (int) (d.getWidth()*60)/100;
		int height = (int) (d.getHeight()*90/100);
		
		ImageIcon imageIcon = new ImageIcon("res\\images\\imageIcon.png");
		Image image = imageIcon.getImage();
		
		addMenuBar(frame);
		frame.setIconImage(image);
		frame.setSize(widht, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setVisible(true);
		
		Login login = new Login();
		login.login(frame);
	}
	private void addMenuBar(JFrame frame) {
		JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Arquivo");
        menuBar.add(fileMenu);
        JMenuItem openItem = new JMenuItem("Abrir");
        fileMenu.add(openItem);
        frame.setJMenuBar(menuBar);
	}
}
