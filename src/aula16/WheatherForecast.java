package aula16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WheatherForecast extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JList cities;
	private JScrollPane scCities;
	private JComboBox days;
	private JLabel lbDays, lbCities;
	private JLabel resDay = new JLabel();
	private JLabel cloudy, foggy, hRain, lRain, mRain, pCloudy, sunny, thunder, windy;
	private JButton search;
	
	public WheatherForecast() {
		setLayout(null);
		setSize(720, 480);
		setTitle("Previsão do Tempo");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setBackground(Color.cyan);
		
		String[] citiesItens = {"São Paulo", "Rio de Janeiro", "Curitiba", "Belo Horizonte", "Vitória"};
		cities = new JList(citiesItens);
		
		String[] dayItens = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};
		days = new JComboBox(dayItens);
		
		scCities = new JScrollPane(cities);
		
		lbDays = new JLabel("Dias");
		lbCities = new JLabel("Cidades");
		
		search = new JButton("Pesquisar");
		search.addActionListener(this);
		
		cloudy = new JLabel(new ImageIcon(getClass().getResource("iconfinder_Cloudy_Night_3741352.png")));
		foggy = new JLabel(new ImageIcon(getClass().getResource("iconfinder_Foggy_3741362.png")));
		hRain = new JLabel(new ImageIcon(getClass().getResource("iconfinder_Heavy_Rain_3741348.png")));
		lRain = new JLabel(new ImageIcon(getClass().getResource("iconfinder_Light_Rain_3741355.png")));
		mRain = new JLabel(new ImageIcon(getClass().getResource("iconfinder_Moderate_Rain_3741351.png")));
		pCloudy = new JLabel(new ImageIcon(getClass().getResource("iconfinder_Partly_Cloudy_3741357.png")));
		sunny = new JLabel(new ImageIcon(getClass().getResource("iconfinder_Sunny_3741356.png")));
		thunder = new JLabel(new ImageIcon(getClass().getResource("iconfinder_Thunder_3741360.png")));
		windy = new JLabel(new ImageIcon(getClass().getResource("iconfinder_Windy_3741354.png")));
		
		cloudy.setVisible(false);
		foggy.setVisible(false);
		hRain.setVisible(false);
		lRain.setVisible(false);
		mRain.setVisible(false);
		pCloudy.setVisible(false);
		sunny.setVisible(false);
		thunder.setVisible(false);
		windy.setVisible(false);
		
		add(scCities);
		add(days);
		add(search);
		add(lbDays);
		add(lbCities);
		add(resDay);
		
		add(cloudy);
		add(foggy);
		add(hRain);
		add(lRain);
		add(mRain);
		add(pCloudy);
		add(sunny);
		add(thunder);
		add(windy);
		
		scCities.setBounds(100, 75, 150, 60);
		days.setBounds(450, 75, 150, 25);
		search.setBounds(300, 350, 100, 50);
		lbDays.setBounds(450, 55, 150, 25);
		lbCities.setBounds(100, 35, 150, 60);
		resDay.setBounds(300, 175, 300, 20);
		
		cloudy.setBounds(290, 200, 128, 128);
		foggy.setBounds(290, 200, 128, 128);
		hRain.setBounds(290, 200, 128, 128);
		lRain.setBounds(290, 200, 128, 128);
		mRain.setBounds(290, 200, 128, 128);
		pCloudy.setBounds(290, 200, 128, 128);
		sunny.setBounds(290, 200, 128, 128);
		thunder.setBounds(290, 200, 128, 128);
		windy.setBounds(290, 200, 128, 128);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == search) {
			resDay.setVisible(true);
			if(cities.getSelectedIndex()== 0 && days.getSelectedIndex()==0) {
				resDay.setText("Nublado");
				cloudy.setVisible(true);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 0 && days.getSelectedIndex()==1) {
				resDay.setText("Chuva moderada");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(true);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 0 && days.getSelectedIndex()==2) {
				resDay.setText("Chuva leve");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(true);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 0 && days.getSelectedIndex()==3) {
				resDay.setText("Chuva pesada");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(true);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 0 && days.getSelectedIndex()==4) {
				resDay.setText("Tempestade");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(true);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 1 && days.getSelectedIndex()==0) {
				resDay.setText("Nublado");
				cloudy.setVisible(true);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 1 && days.getSelectedIndex()==1) {
				resDay.setText("Ensolarado");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(true);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 1 && days.getSelectedIndex()==2) {
				resDay.setText("Ventania");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(true);
			}else if(cities.getSelectedIndex()== 1 && days.getSelectedIndex()==3) {
				resDay.setText("Parcialmente nublado");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(true);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 1 && days.getSelectedIndex()==4) {
				resDay.setText("Ensolarado");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(true);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 2 && days.getSelectedIndex()==0) {
				resDay.setText("Nebuloso");
				cloudy.setVisible(false);
				foggy.setVisible(true);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 2 && days.getSelectedIndex()==1) {
				resDay.setText("Ventania");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(true);
			}else if(cities.getSelectedIndex()== 2 && days.getSelectedIndex()==2) {
				resDay.setText("Chuvas leves");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(true);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 2 && days.getSelectedIndex()==3) {
				resDay.setText("Ventania");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(true);
			}else if(cities.getSelectedIndex()== 2 && days.getSelectedIndex()==4) {
				resDay.setText("Tempestade");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(true);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 3 && days.getSelectedIndex()==0) {
				resDay.setText("Ensolarado");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(true);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 3 && days.getSelectedIndex()==1) {
				resDay.setText("Parcialmente nublado");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(true);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 3 && days.getSelectedIndex()==2) {
				resDay.setText("Nublado");
				cloudy.setVisible(true);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 3 && days.getSelectedIndex()==3) {
				resDay.setText("Chuvas leves");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(true);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 3 && days.getSelectedIndex()==4) {
				resDay.setText("Chuvas pesadas");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(true);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 4 && days.getSelectedIndex()==0) {
				resDay.setText("Nublado");
				cloudy.setVisible(true);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 4 && days.getSelectedIndex()==1) {
				resDay.setText("Nebuloso");
				cloudy.setVisible(false);
				foggy.setVisible(true);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 4 && days.getSelectedIndex()==2) {
				resDay.setText("Chuvas leves");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(true);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 4 && days.getSelectedIndex()==3) {
				resDay.setText("Chuva pesada");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(true);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(false);
				windy.setVisible(false);
			}else if(cities.getSelectedIndex()== 4 && days.getSelectedIndex()==4) {
				resDay.setText("Tempestade");
				cloudy.setVisible(false);
				foggy.setVisible(false);
				hRain.setVisible(false);
				lRain.setVisible(false);
				mRain.setVisible(false);
				pCloudy.setVisible(false);
				sunny.setVisible(false);
				thunder.setVisible(true);
				windy.setVisible(false);
			} 
		}
	}

	public static void main(String[] args) {
		new WheatherForecast();

	}
}
