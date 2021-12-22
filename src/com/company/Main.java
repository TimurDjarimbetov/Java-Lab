package com.company;

import com.company.entyties.Humans;
import com.company.entyties.Items;
import com.company.entyties.Rooms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Humans Pasha = new Humans("Pasha");
        Humans Petya = new Humans("Petya");
        Humans Masha = new Humans("Masha");
        // Создание двух объектов с помощью конструктора.
        Humans Vipguest = new Humans("Vipguest");


        // Вызов метода для каждого созданного объекта.
        Vipguest.huAge(0);
        Vipguest.huPresentPosition("VIP");
        Vipguest.huSalary(0);
        Vipguest.printlnHumans();

        Pasha.huAge(25);
        Pasha.huPresentPosition("Администратор");
        Pasha.huSalary(5000);
        Pasha.printlnHumans();

        Petya.huAge(19);
        Petya.huPresentPosition("Официант");
        Petya.huSalary(2000);
        Petya.printlnHumans();
        Humans human = new Worker();
        human.walk();

        Masha.huAge(30);
        Masha.huPresentPosition("Владелец");
        Masha.huSalary(15000);
        Masha.printlnHumans();


        Rooms viproom = new Rooms("VIP");
        Rooms adminroom = new Rooms("Администрация");
        Rooms kitchenroom = new Rooms("Кухня");
        Rooms ownerroom = new Rooms("Директор");
        viproom.rWindow(3);
        viproom.rDoor(4);
        viproom.rTv(2);
        viproom.rAirConditioneer(2);
        viproom.printlnRooms();

        adminroom.rWindow(1);
        adminroom.rDoor(1);
        adminroom.rTv(1);
        adminroom.rAirConditioneer(1);
        adminroom.printlnRooms();

        kitchenroom.rWindow(3);
        kitchenroom.rDoor(3);
        kitchenroom.rTv(0);
        kitchenroom.rAirConditioneer(2);
        kitchenroom.printlnRooms();
        Rooms ktable = new Table();
        ktable.takeoff();

        ownerroom.rWindow(1);
        ownerroom.rDoor(1);
        ownerroom.rTv(1);
        ownerroom.rAirConditioneer(1);
        ownerroom.printlnRooms();

        Items Mebel = new Items("Mebel");
        Items Pribori = new Items("Pribori");

        Mebel.auHeight(3);
        Mebel.auWidth(5);
        Mebel.auColor("Коричневый");
        Mebel.printlnItems();
        Items item = new Sofa();
        item.sitdown();

        Pribori.auHeight(1);
        Pribori.auWidth(2);
        Pribori.auColor("Белая");
        Pribori.printlnItems();

        Worker G = new Worker();
        G.Position = "Официант";
        G.age = 65;
        G.name = "Vlad";
        G.presentposition = "Officiant";
        G.salary = 100;
        G.Servise();

        Table W = new Table();
        W.Count_T = 5;
        W.name = "Stol";
        W.Put();

        Sofa S = new Sofa();
        S.color = "Red";
        S.name = "Divan";
        S.height = 155;
        S.width = 2000;
        S.count_place =3;
        S.seat();

        Sofa S_arr[] = new Sofa[5];
        Table T_arr[] = new Table[5];
        Worker W_arr[] = new Worker[5];

        StandartOutPut stop = new StandartOutPut();
        System.out.println("1.Index");
        System.out.println("2.GetListOfObject");
        System.out.println("3.FourZeroFour");
        System.out.println("Введите: ");

        while (true){


            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int chouse = in.nextInt();



            switch (chouse){
                case 1:{
                    stop.Index();
                }break;
                case 2:{
                    stop.GetListOfObject();
                }break;
                case 3:{
                    stop.FourZeroFour();
                }break;
            }
        }



    }
}
