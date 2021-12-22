package com.company.entyties;

public class Humans {
    public String name;
    public String presentposition;
    public int age;
    public int salary;

    //конструктор класса

    public Humans() {
        this.name = " ";
        this.age = 0;
        this.presentposition = " ";
        this.salary = 0;
    }

    public Humans(String name, int age, String presentposition, int salary) {
        this.name = name;
        this.age = age;
        this.presentposition = presentposition;
        this.salary = salary;
    }

    public Humans(String name) {
        this.name = name;
    }


    //Присвоение
    public void huAge(int huAge) {
        age = huAge;
    }

    // Присвоение
    public void huPresentPosition(String huPresentPosition) {
        presentposition = huPresentPosition;
    }

    public void huSalary(int huSalary) {
        salary = huSalary;
    }

    public void printlnHumans() {
        System.out.println("Имя:" + name);
        System.out.println("Возраст:" + age);
        System.out.println("Должность:" + presentposition);
        System.out.println("Зарплата:" + salary);
    }
    public void walk(){
        System.out.println("Я иду!");
    }
}