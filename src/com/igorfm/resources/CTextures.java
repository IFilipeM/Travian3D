package com.igorfm.resources;

import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;

import java.io.IOException;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class CTextures {
	static Texture texture;
	
	public static void loader() {
		try {
			// load texture from PNG file
			texture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/img/image.png"));
			System.out.println("Texture loaded: " + texture);
			System.out.println(">> Image width: " + texture.getImageWidth());
			System.out.println(">> Image height: " + texture.getImageHeight());
			System.out.println(">> Texture width: " + texture.getTextureWidth());
			System.out.println(">> Texture height: " + texture.getTextureHeight());
			System.out.println(">> Texture ID: " + texture.getTextureID());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void apply(int texture) {
		GL11.glBindTexture(GL_TEXTURE_2D, texture);
	}
}
