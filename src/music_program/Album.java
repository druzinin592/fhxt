package music_program;

import java.util.List;

public class Album implements NewInterface{

private String Name_Album;    
private int Date_of_issue;

public int getDate_of_issue(){
    return Date_of_issue;   
}       
public void setDate_of_issue(int Date_of_issue){
    this.Date_of_issue=Date_of_issue;
}

public String getName_Album(){
    return Name_Album;   
}       
public void setName_Album(String Name_Album){
    this.Name_Album=Name_Album;
}

    @Override
    public void play(List<Song> songs){
       for(Song set : songs){
           System.out.println(set.getName());
           System.out.println(set.getMinute()+":"+set.getSecond());
           System.out.println(" ");
       }
    }
}
// http://proglang.su/java/interfaces#chem-pohozhi-klass-i-interfeys