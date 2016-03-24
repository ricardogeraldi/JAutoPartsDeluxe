
package util;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Cursor;
/**
 *
 * @author Ricardo
 */
public class SplashR extends Window {

	private final String message = "Development by Ricardo";
	
	private final String imgName = "../AutoPartsDeluxe/src/imagenseicones/logo2.png";
                                       
	Image splashImage;
	Toolkit toolkit;
	private static SplashR splash;
	
	static {
		splash = new SplashR();
	}
	
	private SplashR ()
	{
		super(new Frame());
		setVisible(false);
		
		splashImage = null;
		toolkit = Toolkit.getDefaultToolkit();	
	}
	
	public static SplashR getInstance()
	{
		return splash;
	}
	
	private void initSplash() 
	{
		//Imagem na memória
                MediaTracker media = new MediaTracker(this);
		splashImage = toolkit.getImage(imgName);
		
		if (splashImage != null) {
			media.addImage(splashImage, 0);
			
			try {
				media.waitForID(0);
			}
			catch (InterruptedException ie) {}
		}
		
		//Estipula tamanho do splash e a posicao na tela
		setSize(splashImage.getWidth(this), splashImage.getHeight(this));
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension size = getSize();
		
		if (size.width > screenSize.width)
			size.width = screenSize.width;
		
		if (size.height > screenSize.height)
			size.height = screenSize.height;
			
		setLocation((screenSize.width - size.width) / 2, (screenSize.height - size.height) / 2);
		setVisible(true);		
	}

	public void openSplash()
	{
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		initSplash();
	}
	
	public void finish()
	{
		setVisible(false);
		dispose();
	}
	
    @Override
	public void paint(Graphics g)
	{
		g.drawImage(splashImage, 0, 0, getBackground(), this);
		g.setFont(new Font("Times New Roman", Font.BOLD, 20));
		g.drawString(message, (int)(splashImage.getWidth(this) / 2) - 80, 30);
	}
}