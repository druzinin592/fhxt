package music_program;

public class Song {

private int minute;
private int second;
private String name; 
private Album Name_Album ; 
private Group Nameg;

    public int getMinute(){
           return minute;   
           }       
    public Song setMinute(int minute){
           this.minute=minute;
           return this;
           }

    public int getSecond(){
           return second;   
           }       
    public Song setSecond(int second){
           this.second=second;
           return this;
           }

    public String getName(){
           return name;   
           }       
    public Song setName(String name){
           this.name=name;
           return this;
           }

    public Album getName_Album(){
           return Name_Album;   
           }       
    public void setName_Album(Album Name_Album){
           this.Name_Album=Name_Album;
           }
    
    public Group getNameg(){
           return Nameg;   
           }       
    public void setNameg(Group Nameg){
           this.Nameg=Nameg;
           }
}