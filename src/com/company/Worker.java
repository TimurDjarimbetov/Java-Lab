package com.company;

import com.company.entyties.Humans;


public class Worker extends Humans {
    @Override
    public void walk() {
        System.out.println("Я опаздываю на работу!");
    }

    String Position; // поле

    public void Servise(){ // метод
        System.out.println("Осторожно идет обслуживание...");
        System.out.println("К сожалению гостю не понравился ваш обед! в следующий раз сделайте лучше");
        System.out.println("Ураа! Моя смена закончилась.");
    }

}
