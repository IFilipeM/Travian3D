package com.igorfm.input;

import org.lwjgl.input.Mouse;

public class CMouse {
	public static void check(){
		if (Mouse.isButtonDown(0)) {
		    int x = Mouse.getX();
		    int y = Mouse.getY();
	 
		    System.out.println("MOUSE DOWN @ X: " + x + " Y: " + y);
		}
	}
}
