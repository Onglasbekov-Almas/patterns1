package org.example;
public class CinemaConfig {
    private static CinemaConfig instance;
    private String cinemaName;

    // Приватный конструктор для предотвращения создания новых экземпляров
    private CinemaConfig() {}

    // Получаем единственный экземпляр класса
    public static synchronized CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }

    public void setCinemaName(String name) {
        this.cinemaName = name;
    }

    public String getCinemaName() {
        return cinemaName;
    }
}
