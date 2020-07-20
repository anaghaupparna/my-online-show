package com.example.onlineshow;

public class Modelclass {
    private int imageIcon;
    String tittle;
    String body;

    public Modelclass(int imageIcon, String tittle, String body) {
        this.imageIcon = imageIcon;
        this.tittle = tittle;
        this.body = body;
    }

    public int getImageIcon() {
        return imageIcon;
    }
    public String getTittle(){
        return tittle;
    }
    public String getBody(){
        return body;
    }
}
