package com.igorfm.graphics;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class CDisplay {
	
	public static void create(String Name, int Width, int Height) {
		try {
		    Display.setDisplayMode(new DisplayMode(Width,Height));
		    Display.create();
		} catch (LWJGLException e) {
		    e.printStackTrace();
		    System.exit(0);
		}
	}
}
