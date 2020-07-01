
package _02_loop_variables._2_shiny_objects;

import java.applet.AudioClip;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class ShinyObjects {
	
	public static void main(String[] args) {
		
		// 1. Call the method below to play the sound
		// 2. Ask the user how many shiny objects they want
		// 3. Play the sound that many times
		
		String s = JOptionPane.showInputDialog("How Many Shiny Objects Do You Want");
		
		for(int i = 0; i < Integer.parseInt(s); i++) {
			
			ShinyObjects.playMisterZee();
			
		}

	}

	/********************   Use this method. DON'T CHANGE THE CODE BELOW  ***********************/
	
	public static void playMisterZee() {
		try {
			System.out.println("Playing a shiny object sound.");
			AudioClip sound = JApplet.newAudioClip(ShinyObjects.class.getResource("shiny-objects.wav"));
			sound.play();
			Thread.sleep(100);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
