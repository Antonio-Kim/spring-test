import com.antoniok.Country;
import com.antoniok.Passenger;

public class PassengerUtil {
    public static Passenger getExpectedPassenger() {
        Passenger passenger = new Passenger("John Smith");

        Country country = new Country("USA", "US");
        passenger.setCountry(country);

        return passenger;
    }
}
