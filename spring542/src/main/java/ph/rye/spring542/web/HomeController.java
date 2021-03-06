package ph.rye.spring542.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {
        "/",
        "homepage" })
public class HomeController {

    @RequestMapping(method = GET)
    public String home() {
        return "home";
    }

}