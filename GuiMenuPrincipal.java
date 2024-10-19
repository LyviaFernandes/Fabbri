//programa que cria um menu principal de exemplo

package aula09;

import java.awt.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class GuiMenuPrincipal extends JFrame{

	private Container contentPane;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnExemplos;
	private JMenuItem miSair, miBotao;
	
	public GuiMenuPrincipal() {
		inicializarComponentes();
		definirEventos();
}

	private void inicializarComponentes() {
		setTitle("Menu Principal");
		setBounds(0, 0, 800, 600);
		contentPane = getContentPane();
		mnBarra = new JMenuBar();
		mnArquivo = new JMenu("Arquivos");
		mnArquivo.setMnemonic('A');
		mnExemplos = new JMenu("Exemplos");
		mnExemplos.setMnemonic('E');
		miSair = new JMenuItem("Sair", new ImageIcon("C:\\Users\\FIC\\Downloads"));
		miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
		miBotao = new JMenuItem("Butao : >");
		mnExemplos.add(miBotao);
		mnArquivo.add(miSair);
		mnBarra.add(mnArquivo);
		mnBarra.add(mnExemplos);
		setJMenuBar(mnBarra);
	}

	private void definirEventos() {
		miSair.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
	
	public static void abrir() {
		GuiMenuPrincipal frame = new GuiMenuPrincipal();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height / 2));
		frame.setVisible(true);
	}
	
}
