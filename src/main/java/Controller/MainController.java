package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

/**
 * Created by Anisul on 7/25/2015.
 */

@RestController
public class MainController {
    @RequestMapping("/api")
    public String index(){
        return "Hello world";
    }
}
