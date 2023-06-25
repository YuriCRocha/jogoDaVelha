package jogoDaVelha;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Campo extends JFrame {
	
	private boolean xo = false;
	private boolean[] click = new boolean[9];
	JButton[] bt = new JButton[9];
	
	public Campo() {
		//campo
		setVisible(true);
		setTitle("Jogo da velha (V.1)");
		setBounds(560,210,410,450);
		setDefaultCloseOperation(3);
		setLayout(null);
		
		//botao
		Font fonte = new Font("Arial",Font.BOLD,60);
		int cont = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				bt[cont] = new JButton();
				add(bt[cont]);
				bt[cont].setBounds((100 * i) + 50, (100 * j) + 50 , 95, 95);
				bt[cont].setFont(fonte);
				cont++;
			}
		}
		for (int i = 0; i < bt.length; i++) {
			click[i] = false;
		}
		//acao click
		bt[0].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[0] ==  false ) {
					click[0] = true;
					mudar(bt[0]);
				}
			}
		});
		bt[1].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[1] ==  false ) {
					click[1] = true;
					mudar(bt[1]);
				}
			}
		});
		bt[2].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[2] ==  false ) {
					click[2] = true;
					mudar(bt[2]);
				}
			}
		});
		bt[3].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[3] ==  false ) {
					click[3] = true;
					mudar(bt[3]);
				}
			}
		});
		bt[4].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[4] ==  false ) {
					click[4] = true;
					mudar(bt[4]);
				}
			}
		});
		bt[5].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[5] ==  false ) {
					click[5] = true;
					mudar(bt[5]);
				}
			}
		});
		bt[6].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[6] ==  false ) {
					click[6] = true;
					mudar(bt[6]);
				}
			}
		});
		bt[7].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[7] ==  false ) {
					click[7] = true;
					mudar(bt[7]);
				}
			}
		});
		bt[8].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (click[8] ==  false ) {
					click[8] = true;
					mudar(bt[8]);
				}
			}
		});
	}
	
	public void mudar(JButton bt) {
		if (xo == true) {
			bt.setText("O");
			xo = false;
		}else {
			bt.setText("X");
			xo = true;
		}
		ganhou();
	}
	public void ganhou() {
		
		if((bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X") || 
					(bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X") ||
					(bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X") ||
					(bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X") ||
					(bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X") ||
					(bt[2].getText() == "X" && bt[5].getText() == "X" && bt[8].getText() == "X") ||
					(bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X") ||
					(bt[6].getText() == "X" && bt[4].getText() == "X" && bt[2].getText() == "X") ){
			JOptionPane.showMessageDialog(null, "X ganhou");
			limpar();
		}else if ((bt[0].getText() == "O" && bt[1].getText() == "O" && bt[2].getText() == "O") || 
					(bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O") ||
					(bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O") ||
					(bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O") ||
					(bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O") ||
					(bt[2].getText() == "O" && bt[5].getText() == "O" && bt[8].getText() == "O") ||
					(bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O") ||
					(bt[6].getText() == "O" && bt[4].getText() == "O" && bt[2].getText() == "O") ){
			JOptionPane.showMessageDialog(null, "O ganhou");
			limpar();
		}else if ((click[0]&& click[1]&& click[2]&&
					click[3]&& click[4]&& click[5] &&
					click[6]&& click[7]&& click[8]) == true) {
			JOptionPane.showMessageDialog(null, "Empatou");
			limpar();
		}
	}
	public void limpar() {
		for (int i = 0; i < bt.length; i++) {
			bt[i].setText("");
			click[i] = false;
		}
	}
}