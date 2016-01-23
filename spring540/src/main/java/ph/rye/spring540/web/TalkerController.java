package ph.rye.spring540.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/talker")
public class TalkerController {


    //    private final TalkerRepository talkerRepository;
    //
    //
    //    @Autowired
    //    public TalkerController(final TalkerRepository talkerRepository) {
    //        this.talkerRepository = talkerRepository;
    //    }


    @RequestMapping(value = "/register", method = GET)
    public String showRegistrationForm() {
        return "registerForm";
    }

}
