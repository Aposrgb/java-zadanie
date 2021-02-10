
package ru.kamalov.list;

import java.util.List;


public class Array71{
   private final int[] arr;
   public Array71(int...arr) {
       if(arr==null){throw new IllegalArgumentException("array empty");}
        this.arr = arr;
   }
    public Array71(List<Integer> arr) {
        if(arr==null){throw new IllegalArgumentException("array empty");}
        this.arr=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            this.arr[i]=arr.get(i);
        }
    }
    public int get(int index){
        if(index<0){throw new NegativeArraySizeException(index+"");}
        if(index>=arr.length){throw new ArrayIndexOutOfBoundsException("index > arr.length");}
        return arr[index];
    }
    public void set(int index, int i){
        if(index<0){throw new NegativeArraySizeException(index+"");}
        if(index>=arr.length){throw new ArrayIndexOutOfBoundsException("index > arr.length");}
        arr[index]=i;
    }
    public String toString() {
        String str="[";
        for(int i=0;i<arr.length;i++){
            str+=arr[i]+", ";
        }
        str+="]";
        return str;
    }
    public boolean array_empty(){
        return arr.length<=0;
    }
    public int size(){
        return arr.length;
    }
    public int[] getArr(){
        int[] tmp = new int[arr.length];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        return tmp;
    }
    
}
