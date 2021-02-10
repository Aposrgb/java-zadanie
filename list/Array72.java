/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kamalov.list;

import java.util.List;

/**
 *
 * @author Аббос
 */
public class Array72 {
   private final int[] arr;
   private int iterator=0;
    public Array72() {
        this.arr = new int[100];
    }
   
   public Array72(int i) {
       arr=new int[i];
   }
    public Array72(List<Integer> arr) {
        if(arr==null){throw new IllegalArgumentException("array empty");}
        this.arr=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            this.arr[i]=arr.get(i);
        }
    }
    public void add(int i){
        if(iterator>=arr.length){throw new ArrayIndexOutOfBoundsException("arrays is full");}
        arr[iterator]=i;
        iterator++;
    }
    public void addN(int N,int i){
        if(N<0){throw new NegativeArraySizeException(N+"");}
        if(N>=arr.length){throw new ArrayIndexOutOfBoundsException("N > arr.length");}
        if(iterator>=arr.length){throw new ArrayIndexOutOfBoundsException("arrays is full");}
        arr[N]=i;
        if(N+1==arr.length-1){iterator=N;}
        else{iterator=N+1;}
        
    }
    public void addArrN(int[] array,int N){
        iterator=N;
        for(int i=iterator,j=0;i<arr.length;i++,j++){
            arr[i]=array[j];
        }
    }
    public void addArr(int[] array){
        
        for(int i=iterator,j=0;i<arr.length;i++,j++){
            arr[i]=array[j];
        }
        iterator=arr.length-1;
    }
    public void addListN(List<Integer> array,int N){
        iterator=N;
        for(int i=iterator,j=0;i<arr.length;i++,j++){
            arr[i]=array.get(j);
        }
    }
    public void addList(List<Integer> array){
        
        for(int i=iterator,j=0;i<arr.length;i++,j++){
            arr[i]=array.get(j);
        }
        iterator=arr.length-1;
    }
    public void remove(int N){
        if(N<0){throw new NegativeArraySizeException(N+"");}
        if(N>=arr.length){throw new ArrayIndexOutOfBoundsException("N > arr.length");}
        arr[N]=0;
        iterator--;
    }
    public int getN(int N){
        if(N<0){throw new NegativeArraySizeException(N+"");}
        if(N>=arr.length){throw new ArrayIndexOutOfBoundsException("N > arr.length");}
        int tmp=arr[N];
        return tmp;
    }
    public void setN(int N, int i){
        if(N<0){throw new NegativeArraySizeException(N+"");}
        if(N>=arr.length){throw new ArrayIndexOutOfBoundsException("N > arr.length");}
        arr[N]=i;
        iterator=N;
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
    public boolean array_full(){
        return arr.length<=iterator;
    }
    public int[] getArr(){
        int[] tmp = new int[arr.length];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        return tmp;
    }
    
}
