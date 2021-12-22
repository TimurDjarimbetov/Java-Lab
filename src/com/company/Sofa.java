package com.company;

import com.company.entyties.Items;

public class Sofa extends Items {
    @Override
    public void sitdown() {
            System.out.println("Какой мягкий диван!");
    }

    int count_place;

    public void seat(){
        System.out.println("Вы сели на диван");
    }
}
