package tischler.BookingDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by etischler on 7/27/2017.
 */
@Controller
public class ViewController {

    @RequestMapping(value = "/")
    public String index(Model model){
        model.addAttribute("datetime",new Date());
        model.addAttribute("username","Ed Tischler");
        model.addAttribute("mode","development");
        return "index";
    }

}
