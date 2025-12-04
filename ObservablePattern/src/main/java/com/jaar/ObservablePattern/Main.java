package com.jaar.ObservablePattern;

public class Main {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency("No news");
        NewsChannel channelOne= new NewsChannel();
        newsAgency.addObserver(channelOne);
        newsAgency.setNews("Elections have started!!!");
        NewsChannel channelTwo= new NewsChannel();
        newsAgency.addObserver(channelTwo);
        newsAgency.setNews("Elections with 2 channels have started!!!");
        NewsChannel channelThree= new NewsChannel();
        newsAgency.addObserver(channelThree);
        newsAgency.setNews("Elections with 3 channels have started!!!");
    }
}
