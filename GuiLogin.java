//programa que cria uma janela de login simples

package aula09;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class GuiLogin extends JFrame {

	private JTextField tfLogin;
	private JLabel lbSenha;
	private JLabel lbLogin;
	private JButton btLogar;
	private JButton btCancelar;
	private JPasswordField pfSenha;
	private static GuiLogin frame;
	
	public GuiLogin() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
		setTitle("Login no Sistema");
		setBounds(0, 0, 250, 200);
		setLayout(null);
		tfLogin = new JTextField(5);
		pfSenha = new JPasswordField(5);
		lbSenha = new JLabel("Senha: ");
		lbLogin = new JLabel("Login: ");
		btLogar = new JButton("Logar");
		btCancelar = new JButton("Cancelar");
		tfLogin.setBounds(100, 30, 120, 25);
		lbLogin.setBounds(30, 30, 80, 25);
		lbSenha.setBounds(30, 75, 80, 25);
		pfSenha.setBounds(100, 75, 120, 25);
		btLogar.setBounds(20, 120, 100, 25);
		btCancelar.setBounds(125, 120, 100, 25);
		add(tfLogin);
		add(lbSenha);
		add(lbLogin);
		add(pfSenha);
		add(btLogar);
		add(btCancelar);
		
	}
	private void definirEventos() {
		btLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senha = String.valueOf(pfSenha.getPassword());
				if (tfLogin.getText().equals("java8") && senha.equals("java8")) {
					frame.setVisible(false);
					//GuiMenuPrincipal.abrir();
				} else {
					JOptionPane.showMessageDialog(null, "Login ou senha incorretas!");
					
				}
			}
		});
		btCancelar.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		}
	public static void main (String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			frame = new GuiLogin();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
			frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height / 2));
			frame.setVisible(true);
		}
		
		});
	}

	}
	
	
		
	

