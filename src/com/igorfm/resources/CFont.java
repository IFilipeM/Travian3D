package com.igorfm.resources;

import java.awt.Font;
import java.io.InputStream;

import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.util.ResourceLoader;

public class CFont {
	public static TrueTypeFont font;
	public static TrueTypeFont font2;
	
	public static void init() {
		Font awtFont = new Font("Times New Roman", Font.BOLD, 24);
		font = new TrueTypeFont(awtFont, false);
		try {
			InputStream inputStream = ResourceLoader.getResourceAsStream("res/font/leadcoat.ttf");
			
			Font awtFont2 = Font.createFont(Font.TRUETYPE_FONT, inputStream);
			awtFont2 = awtFont2.deriveFont(24f);
			font2 = new TrueTypeFont(awtFont2, true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
