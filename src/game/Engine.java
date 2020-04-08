package game;

import java.awt.Color;

import gui.MainWindow;

public class Engine {
	//singleton class
	private static Engine engine = null;
	private Engine() {}
	public static Engine getInstance()	{
		if(engine == null)	{
			engine = new Engine();
		}
		return engine;		
	}

	//Member Variables:
	public Map map;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Catan!");	
		MainWindow mainWindow = MainWindow.getInstance();
		mainWindow.configure();
		mainWindow.setBackground(Color.black);
		mainWindow.setVisible(true);
		
	}
	
	

}
