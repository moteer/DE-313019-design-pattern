package de.brightslearning.java.advanced.designpattern.observer.implementation1;

public class NewsChannel implements Channel {
    private String news;

    public String getNews() {
        return news;
    }

    private void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }
}
