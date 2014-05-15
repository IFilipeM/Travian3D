package com.igorfm.main;

import org.lwjgl.opengl.Display;

import com.igorfm.graphics.CRender;
import com.igorfm.input.CKeyboard;
import com.igorfm.input.CMouse;

public class CFPSCounter {
	static long lastTime = System.nanoTime();
	static double ns = 1000000000.0 / 60.0;
	static double delta = 0;
	static long lastTimer = System.currentTimeMillis();
	static int frames = 0;
	static int updates = 0;
	
	public static void refresh() {
		long now = System.nanoTime();
		delta += (now - lastTime) / ns;
		lastTime = now;
		if (delta >= 1) {
			CMouse.check();
			CKeyboard.check();
			updates++;
			delta--;
		}
		CRender.render();
		Display.update();
		frames++;
		while (System.currentTimeMillis() - lastTimer > 1000) {
			lastTimer += 1000;
			//System.out.println(frames + " FPS - " + updates + " UPS.");
			updates = 0;
			frames = 0;
		}
	}
}
