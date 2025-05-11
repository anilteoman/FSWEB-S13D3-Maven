package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width , double height){
        this.width = width;
        this.height = height;

    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
       this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height){
        this.height=height < 0 ? 0 : height;
    }

    public double getArea(){
        return this.width * this.height;
    }
}
