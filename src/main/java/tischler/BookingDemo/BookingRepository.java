package tischler.BookingDemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by etischler on 7/27/2017.
 */
@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long> {

}
