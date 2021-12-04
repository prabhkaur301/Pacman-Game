package pacman;

import java.io.File;

import java.io.IOException;


import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sounds {
 
   private String introMusic="E:/Coding Projects/Java Programs/Pacman/src/sounds/pacman_beginning.wav";
    private String backgroundMusic =  "E:/Coding Projects/Java Programs/Pacman/src/sounds/Backgroundmusic.wav";
    private String gameOver = "E:/Coding Projects/Java Programs/Pacman/src/sounds/gameover.wav";
    private String eatGhost = "E:/Coding Projects/Java Programs/Pacman/src/sounds/pacman_eatghost.wav";
    

    private Clip bgmSound,gameOverSound,introSound,eatghostSound;
    
    public Sounds(){


    
    try {
		bgmSound=AudioSystem.getClip();
	} catch (LineUnavailableException e) {
		
		e.printStackTrace();
	}
    try {
		gameOverSound= AudioSystem.getClip();
	} catch (LineUnavailableException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    try {
		introSound= AudioSystem.getClip();
	} catch (LineUnavailableException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    try {
  		eatghostSound= AudioSystem.getClip();
  	} catch (LineUnavailableException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}


    try {
		bgmSound.open(AudioSystem.getAudioInputStream(new File(backgroundMusic)) );
	} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
		
		e.printStackTrace();
	}
    try {
		gameOverSound.open(AudioSystem.getAudioInputStream(new File(gameOver) ) );
	} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
	
		e.printStackTrace();
	}
    try {
		introSound.open(AudioSystem.getAudioInputStream(new File(introMusic) ) );
	} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
	
		e.printStackTrace();
	}
    
    try {
		eatghostSound.open(AudioSystem.getAudioInputStream(new File(eatGhost) ) );
	} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
	
		e.printStackTrace();
	}
    
    
    
    
    }
    public void playbgmSound()
    {
    	
        bgmSound.start();
        bgmSound.loop(Clip.LOOP_CONTINUOUSLY);
      
    }
public void stopbgmSound() {
	bgmSound.stop();
}
    public void playgameoverSound()
    {
    	gameOverSound.setFramePosition(0);
        gameOverSound.start();
       
       
    }
    
    public void playintroSound()
    {
    	
        introSound.start();
        
        
    }
    
    public void playeatGhost()
    {
    	eatghostSound.setFramePosition(0);
       eatghostSound.start();
    }
}

