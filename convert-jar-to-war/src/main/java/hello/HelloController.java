package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by senatori on 9/5/14.
 */

@Controller
public class HelloController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index(){
        return "index";
    }

}
