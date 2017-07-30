package tischler.BookingDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by etischler on 7/27/2017.
 */
@Component
public class DatabaseSeeder implements CommandLineRunner {
    private BookingRepository bookingRepository;


    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... strings) throws Exception{
        List<HotelBooking> bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Marriot",200.5, 3));
        bookings.add(new HotelBooking("Ibis",90,4));
        bookings.add(new HotelBooking("Novotel",140.74,1));

        bookingRepository.save(bookings);
    }
}
