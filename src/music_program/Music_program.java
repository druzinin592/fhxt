package music_program;

import java.util.ArrayList;
import java.util.List;

public class Music_program {

    public static void main(String[] args) {
    
    ArrayList<Song>songs = new ArrayList<>();     
    
         songs.add(new Song()   
              .setMinute(3)
              .setSecond(26)
              .setName("The Future of Warfare")); 
              
         
         songs.add(new Song()   
              .setMinute(3)
              .setSecond(02)   
              .setName("Seven Pillars of Wisdom"));  
         
         songs.add(new Song()   
              .setMinute(3)
              .setSecond(31)   
              .setName("82nd All the Way")); 
         
         songs.add(new Song()   
              .setMinute(3)
              .setSecond(56)
              .setName("The Attack of the Dead Men")); 
         
         songs.add(new Song()   
              .setMinute(3)
              .setSecond(17)   
              .setName("Devil Dogs")); 
         
         songs.add(new Song()   
              .setMinute(3)
              .setSecond(22)   
              .setName("The Red Baron")); 
         
         songs.add(new Song()   
              .setMinute(4)
              .setSecond(28)   
              .setName("Great War")); 
         
         songs.add(new Song()   
              .setMinute(3)
              .setSecond(26)   
              .setName("A Ghost in the Trenches"));
         
         songs.add(new Song()   
              .setMinute(3)
              .setSecond(17)   
              .setName("Fields of Verdun")); 
         
         songs.add(new Song()   
              .setMinute(4)
              .setSecond(45)   
              .setName("The End of the War to End All Wars"));
         
         songs.add(new Song()   
              .setMinute(1)
              .setSecond(57)   
              .setName("In Flanders Fields"));
         
    Album album = new Album();
    album.play(songs);     


    }
    
}
