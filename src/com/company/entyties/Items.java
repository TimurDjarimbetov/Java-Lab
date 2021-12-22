package com.company.entyties;

public class Items {
    public String name;

    public int height;

    public int width;

    public String color;

    //конструктор класса

    public Items() {
        this.name = "";
        this.height =0;
        this.width = 0;
        this.color = " ";

    }
    public Items(String name, int height, int width, String color){
        this.name = name;
        this.height = height;
        this.width = width;
        this.color = color;

    }

    public Items(String name){

        this.name = name;
    }

    //Присвоение  переменной
    public void auHeight(int auHeight) {
        height = auHeight;
    }
    // Присвоение
    public void auWidth(int auWidth ) {
        width = auWidth;
    }

    public void auColor(String auColor) {
        color = auColor;
    }

    public void printlnItems() {
        System.out.println("Предмет:" + name);
        System.out.println("Высота:" + height);
        System.out.println("Ширина:" + width );
        System.out.println("Цвет:" + color );
    }
    public void sitdown(){
        System.out.println("Садитесь рядом со мной!");
    }

}
