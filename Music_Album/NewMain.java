package ru.kamalov.Music_Album;

public class NewMain {
    public static void main(String[] args) {
        Song s1 = new Song("автор1","название песни1");
        Song s2 = new Song("автор2","название песни2");
        Song s3 = new Song("автор3","название песни3");
        Song s4 = new Song("автор4","название песни4");
        Album al = new Album("твор", "имя");
        al.addSong(s1);
        al.addSong(s2);
        al.addSong(s3);
        al.addSong(s4);
        System.out.println(s2.getAlbum());
    }
    
}
