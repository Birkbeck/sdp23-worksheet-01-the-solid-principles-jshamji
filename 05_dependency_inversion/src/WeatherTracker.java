import java.util.Objects;

public class WeatherTracker {
    String currentConditions;
    private final IPhone phone;
    private final IEmailer emailer;

    public WeatherTracker() {
        phone = new Phone();
        emailer = new Emailer();
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (Objects.equals(weatherDescription, "rainy")) {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (Objects.equals(weatherDescription, "sunny")) {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
