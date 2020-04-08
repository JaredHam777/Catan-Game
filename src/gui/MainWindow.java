package gui;

import javax.swing.JFrame;

public class MainWindow  extends JFrame {
	
	//singleton class:
	private static MainWindow mainWindow = null;
	private MainWindow() {}
	public static MainWindow getInstance()	{
		if(mainWindow == null)	{
			mainWindow = new MainWindow();
		}
		return mainWindow;		
	}
		
	
	public void configure() {
		this.setSize(1920, 1080);
		this.setVisible(true);
	}

}
