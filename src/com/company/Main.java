package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Channel catChannel=new Channel();


	    Subscriber subscriber1=new Subscriber("Shehan");
        Subscriber subscriber2=new Subscriber("Themiya");


        subscriber1.subscribeChannel(catChannel);
        subscriber2.subscribeChannel(catChannel);

        catChannel.subscribe(subscriber1);
        catChannel.subscribe(subscriber2);

	    catChannel.upload("Video 1");

	    catChannel.notifySubscribers();




    }
}
