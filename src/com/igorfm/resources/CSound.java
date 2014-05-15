package com.igorfm.resources;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

import org.newdawn.slick.openal.Audio;

public class CSound {
	static Audio oggEffect;
	public static Player player;
	
	public static void loader(final String mp3) {
		new Thread(new Runnable() {
			public void run() {
				try {
					FileInputStream fis = new FileInputStream(mp3);
					BufferedInputStream bis = new BufferedInputStream(fis);
					player = new Player(bis);
					//System.out.println("Tocando Musica!");
					player.play();
					System.out.println("Terminado Musica!");		
				} catch (Exception e) {
					System.out.println("Problema ao tocar Musica" + mp3);
					e.printStackTrace();
				}
			}
		}).start();
	}
}
