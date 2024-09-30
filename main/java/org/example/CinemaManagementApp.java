package org.example;
public class CinemaManagementApp {
    public static void main(String[] args) {
        // Используем Синглтон
        CinemaConfig config = CinemaConfig.getInstance();
        config.setCinemaName("Starlight Cinemas");
        System.out.println("Cinema Name: " + config.getCinemaName());

        // Используем Фабричный метод
        MovieFactory factory = new RegularMovieFactory();
        Movie movie = factory.createMovie("Inception");
        System.out.println("Movie: " + movie.getTitle() + ", Type: " + movie.getType());

        // Используем Абстрактную фабрику
        UIFactory uiFactory = new DarkThemeFactory();
        Button button = uiFactory.createButton();
        button.render();

        // Используем Строитель
        TicketBooking booking = new TicketBookingBuilder()
                .setMovieTitle("Inception")
                .setSeatNumber("A1")
                .setSnackCombo("Popcorn and Soda")
                .build();

        // Используем Прототип
        StandardSchedule template = new StandardSchedule();
        template.setTime("18:00");
        MovieSchedule eveningSchedule = template.clone();
        eveningSchedule.setMovie(movie);
        System.out.println("Система управления кинотеатром инициализирована.");
    }
}
