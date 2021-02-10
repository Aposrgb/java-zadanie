
package ru.kamalov.Music_Album;

public class Song{
    private String author; 
    private String name;
    private Album album;
    Song(String author,String name){
        this.author=author; 
        this.name=name;
    }
    Song(String name){
          this.name=name;
    }

    public void setAlbum(Album album) {
        if(album==null){return;}
        if(this.album!=null){
            this.album.songs.remove(this);
        }
        this.album=album;
        this.album.songs.add(this);
    }
    
    public String toString(){
        String str="трек - "+name +",название альбома - "+ album.getName();
        return str;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getAlbum() {
        if(album==null){return "альбом пуст";}
        String str ="";
        for(int i =0;i<album.songs.size();i++){
            str+="Трек ["+i+"]"+album.songs.get(i)+"\n";
        }
        return str;
    }
    
}
