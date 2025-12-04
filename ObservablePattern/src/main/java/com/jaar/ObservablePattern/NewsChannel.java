package com.jaar.ObservablePattern;

public class NewsChannel implements Channel{
    @Override
    public void update(Object news) {
        System.out.println("Breaking news: "+news);
    }

}
