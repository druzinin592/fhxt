package music_program;

public class Group {
    
private String Nameg;
private int Number_of_participants;

    public int getNumber_of_participants(){
           return Number_of_participants;   
           }       
    public Group setNumber_of_participants(int number_of_participants){
           this.Number_of_participants=Number_of_participants;
           return this;
           }
    public String getName_Album(){
           return Nameg;   
           }       
    public Group setName_Album(String Name_Album){
           this.Nameg=Nameg;
           return this;
           }
}
