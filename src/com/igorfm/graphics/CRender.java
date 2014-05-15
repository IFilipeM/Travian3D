package com.igorfm.graphics;

import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glColor3f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;

public class CRender {
	static int size;
	static String Welcome = "Bem-vindo ao TRAVIAN PT";
	
	public static void render() {
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
		glColor3f(0.5f, 0.5f, 1.0f);
		glBegin(GL_QUADS);
		glVertex2f(100, 100);
		glVertex2f(100 + 200, 100);
		glVertex2f(100 + 200, 100 + 200);
		glVertex2f(100, 100 + 200);
		glEnd();
	}
}
