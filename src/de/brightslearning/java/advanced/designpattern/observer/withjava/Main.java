package de.brightslearning.java.advanced.designpattern.observer.withjava;

public class Main {
    /**
     * Observer is a behavioral design pattern. It specifies communication between objects: observable and observers.
     * An observable is an object which notifies multiple objects, or observers, about any events that happen to the object
     * they are observing.
     *
     * For example, a news agency can notify channels when it receives news.
     * Receiving news is what changes the state of the news agency, and it causes the channels to be notified.
     *
     */
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
