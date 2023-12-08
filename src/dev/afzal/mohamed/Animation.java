package dev.afzal.mohamed;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Animation 
{
	JFrame frmAnimate;
	ImageIcon iconAnimateAFzal, iconAFzalIntro;
	JLabel lblAFzalIntro;
	
	int width = 350;
	int height = 250;
	
	public void animate()
	{
		
		frmAnimate = new JFrame();
		frmAnimate.setSize(width, height);
		frmAnimate.setUndecorated(true);
		frmAnimate.setLayout(null);
		frmAnimate.setLocationRelativeTo(null);
		
		iconAnimateAFzal  = new ImageIcon("src/assets/src/assets/HeadPhone.png");
		Image imageAnimateAFzal = iconAnimateAFzal.getImage();
		iconAnimateAFzal.setImage(imageAnimateAFzal);
		frmAnimate.setIconImage(imageAnimateAFzal);
		
		iconAFzalIntro = new ImageIcon("src/assets/Guitar.png");
		Image imgAFzalAnimateIntro = iconAFzalIntro.getImage();
		imgAFzalAnimateIntro = imgAFzalAnimateIntro.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		iconAFzalIntro.setImage(imgAFzalAnimateIntro);
		
		lblAFzalIntro = new JLabel(iconAFzalIntro);
		lblAFzalIntro.setBounds(0, 0, width, height);
		lblAFzalIntro.setLayout(null);
		frmAnimate.getContentPane().add(lblAFzalIntro);
		frmAnimate.setBackground(Color.black);
		
		frmAnimate.setVisible(true);
		
		new Thread()
		{
			public void run()
			{
				try
				{
					AFzal objAFzal = new AFzal();
			
					sleep(1500);
					objAFzal.init();
					frmAnimate.dispose();
				}
				catch (Exception e) {}
			}
		}.start();
	}//function animate() closed here
}
