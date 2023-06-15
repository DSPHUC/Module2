package Inheritance;

public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getside(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLenght(side);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    @Override
    public void setLenght(double length){
        setSide(length);
    }
    @Override
    public String toString(){
        return  "A Square with side = "+ getside()+", which is a subclass of "+super.toString();
    }
}
