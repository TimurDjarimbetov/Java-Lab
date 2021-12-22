package com.company;

import com.company.entyties.Rooms;

public class Table extends Rooms {
    @Override
    public void takeoff() {
        System.out.println("Возьми нож со стола!");
    }

    int Count_T;

    public void Put(){
        System.out.println("Накрываем стол");
        System.out.println("Убираем со стола!");
    }
}
