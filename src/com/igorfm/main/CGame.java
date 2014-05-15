package com.igorfm.main;

import org.lwjgl.opengl.Display;

import com.igorfm.graphics.CDisplay;
import com.igorfm.graphics.COpenGL;
import com.igorfm.resources.CFont;
import com.igorfm.resources.CSound;

public class CGame implements Runnable {
	Thread thread;
	public static int W = 1000, H = 500;
	
	public void start() {
		thread = new Thread(this, "Display");
		thread.start();
	}
	
	public void run() {
		CDisplay.create("Travian 3D", W, H);
		CFont.init();
		COpenGL.init();
		CSound.loader("res/music/Dope.mp3");
		while (!Display.isCloseRequested()) {
			CFPSCounter.refresh();
		}
		Display.destroy();
		System.exit(0);
	}
}