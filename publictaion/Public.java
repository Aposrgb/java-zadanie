
package ru.kamalov.publictaion;
import java.util.Arrays;

public class Public{
    private String name;
    private String text;
    private String tags;
    private Comment[] comment_public;
    public Public(String name, String text, String tags) {
        this.name = name;
        this.text = text;
        this.tags = tags;
    }
    String getName(){
        return name;
    }
    public void addComment(Comment c){
        if(comment_public==null){
            comment_public=new Comment[1];
            comment_public[0]= c;
        }
        else{
            Comment[] tmp = new Comment[comment_public.length];
            int i=0;
            for(Comment s:comment_public){
                tmp[i]=s;
                i++;
            }
            comment_public= new Comment[tmp.length+1];
            i=0;
            for(Comment s:tmp){
                comment_public[i]=s;
                i++;
            }
            comment_public[tmp.length]=c;
        }
    }
    Comment setRate(Comment c1){
        c1.setRate();   
        return c1;
    }
    void setText(String str){
        if(comment_public==null ){
            this.text=str;
        }
        else{
            throw new IllegalArgumentException("нельзя изменить текст так как есть комментарии");
        }
    }
    @Override
    public String toString() {
        String str="";
        for(int i=0;i<comment_public.length;i++){
            str+=comment_public[i]+" ";
        }
        return name + ", tags: "+ tags  +", text: "+ text+", commentary \n"+str ; 
    }
    
}





