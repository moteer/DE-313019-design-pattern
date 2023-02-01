package de.brightslearning.java.advanced.designpattern.observer.withPCL;

public class Main {
    public static void main(String[] args) {
        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();
        PCLNewsChannel observer2 = new PCLNewsChannel();
        PCLNewsChannel observer3 = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer);
        observable.addPropertyChangeListener(observer2);
        observable.addPropertyChangeListener(observer3);
        observable.setNews("news");

        System.out.println(observer.getNews().equals("news"));
        System.out.println(observer2.getNews().equals("news"));
        System.out.println(observer3.getNews().equals("news"));
    }
}
