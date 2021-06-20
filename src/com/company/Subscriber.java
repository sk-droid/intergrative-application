package com.company;

public class Subscriber {
    private String name;
    private Channel channel;

    public Subscriber(String name){
        this.name=name;
    }

    public void update(){
        System.out.println("Notification: Video Uploaded");
    }

    public void subscribeChannel(Channel channel){
        this.channel=channel;
    }

}
