package com.company.entyties;

public class Rooms {
    public String name;
    public int window;
    public int door;
    public int tv;
    public int airconditioneer;

    public Rooms(){
        this.name = "";
        this.window =0;
        this.door = 0;
        this.tv = 0;
        this.airconditioneer = 0;

    }
    public Rooms(String name, int window, int door, int tv, int airconditioneer){
        this.name = name;
        this.window = window;
        this.door = door;
        this.tv = tv;
        this.airconditioneer = airconditioneer;
    }
    //конструктор класса
    public Rooms(String name){
        this.name = name;
    }

    //Присвоение  переменной id студента
    public void rWindow(int rWindow){window = rWindow;
    }
    public void rDoor(int rDoor){door = rDoor;
    }
    // Присвоение возраст студента переменной age
    public void rTv(int rTv){
        tv = rTv;
    }
    public void rAirConditioneer(int rAirConditioneer) {airconditioneer = rAirConditioneer;
    }
    public void printlnRooms() {
        System.out.println("Комната:" + name);
        System.out.println("Окно:" + window);
        System.out.println("Дверь:" + door);
        System.out.println("Телевизор:" + tv );
        System.out.println("Кондиционер:" + airconditioneer );
    }

    public void takeoff(){
        System.out.println("Возьми со стола!");
    }
}
