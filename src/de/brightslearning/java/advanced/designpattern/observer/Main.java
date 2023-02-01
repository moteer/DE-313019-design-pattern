package de.brightslearning.java.advanced.designpattern.observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();
        NewsChannel observer2 = new NewsChannel();
        NewsChannel observer3 = new NewsChannel();

        observable.addObserver(observer);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        observable.setNews("news");

        System.out.println(observer.getNews().equals("news"));
        System.out.println(observer2.getNews().equals("news"));
        System.out.println(observer3.getNews().equals("news"));
    }
}
