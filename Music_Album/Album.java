
package ru.kamalov.Music_Album;

import java.util.ArrayList;
import java.util.List;

public class Album{
    private String author; 
    private String name;
    List<Song> songs= new ArrayList<>();
    Album(String author,String name){
        this.author=author; 
        this.name=name;
    }
    public void addSong(Song song) {
        song.setAlbum(this);
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String str="";
        for(Song s: songs){
            str+="Автор песни "+s.getAuthor()+", имя музыки "+s.getName()+"\n";
        }
        return str; 
    }
    
}