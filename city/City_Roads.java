package ru.kamalov.city;

import java.util.ArrayList;

public class City_Roads {

    private String name;
    private ArrayList<Road> roads = new ArrayList<>();
    public City_Roads(String name,Road...r){
        this(name);
        for(Road s:r){
            addRoad(s);
        }
    }
    public City_Roads(String name,Road r){
        this(name);
        addRoad(r);
    }
    public City_Roads(String name) {
        this.name = name;
    }

    public void addRoad(Road r) {
        if (r == null) {
            return;
        }
        roads.add(r);
    }
    @Override
    public String toString() {
        String str = "";
        if (roads != null) {
            for (int i = 0; i < roads.size(); i++) {
                str += name + "<->" + roads.get(i).getName() + ", ";
            }
        } 
        else {
            str += name;
        }
        return str;

    }
}
