package tischler.BookingDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by etischler on 7/27/2017.
 */
@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    private BookingRepository bookingRepository;

    @Autowired
    public BookingController(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;

    }



    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAll(){
        return bookingRepository.findAll();
    }

    @RequestMapping(value = "/affordable/{price}",method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price){
        List<HotelBooking> bookings = bookingRepository.findAll();
        List<HotelBooking> tempList = new ArrayList<>();
        for(int i = 0; i < bookings.size(); i++){
            if(price>=bookings.get(i).getPricePerNight())
                tempList.add(bookings.get(i));

        }
        return tempList;

    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public List<HotelBooking> create(@RequestBody HotelBooking hotelBooking){
       bookingRepository.save(hotelBooking);
        return bookingRepository.findAll();
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public List<HotelBooking> remove(@PathVariable long id){
        bookingRepository.delete(id);

        return bookingRepository.findAll();
    }
}
