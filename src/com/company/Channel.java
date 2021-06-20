package com.company;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subs=new ArrayList<>();
    String title;

    public void subscribe(Subscriber subscriber){
        subs.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber){
        subs.remove(subscriber);
    }



    public void notifySubscribers(){
        for (Subscriber sub : subs) {
            sub.update();
        }
    }


    public void upload(String title){
        this.title=title;
    }

}
