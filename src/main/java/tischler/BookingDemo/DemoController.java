package tischler.BookingDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by etischler on 7/27/2017.
 */
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
