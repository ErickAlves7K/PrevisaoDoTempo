package aula16;

import java.awt.event.*;
import javax.swing.*;

public class Teste_JCB extends JPanel {
private static final long serialVersionUID = 1L;
	private JComboBox cbEstados;// lista em forma de combo
	private JLabel lbEstados;
	private JButton btMostrar;

	public Teste_JCB() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
		setLayout(null);
		String[] cbEstadosItens = { "Belo Horizonte","Vitória", "Rio de Janeiro", "São Paulo", "Curitiba" };// vetor para a lista que irá no combo 
		cbEstados = new JComboBox(cbEstadosItens); //adiciona o vetor a lista combobox
		lbEstados = new JLabel("Estados do Sudeste");
		btMostrar = new JButton("Mostrar");
		add(lbEstados);
		add(cbEstados);
		add(btMostrar);
		lbEstados.setBounds(25, 15, 150, 25);
		cbEstados.setBounds(25, 40, 150, 25);
		btMostrar.setBounds(25, 75, 100, 25);

	}

	private void definirEventos(){
		btMostrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent  e){
				JOptionPane.showMessageDialog(null,"Indice Selecionado: "+cbEstados.getSelectedIndex() +"\nTexto Selecionado: " +cbEstados.getSelectedItem());
				//getSelectedIndex(): pega o indice (vetor) do item selecionado; getSelectedItem():pega o texto do item selecionado.
			}
	});
	
	}
	public static void main(String args[]){
 		JFrame frame = new JFrame("ComboBox");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().add(new Teste_JCB());
		 frame.setBounds(300,300,250,150);
		 frame.setVisible(true);
	 }
}