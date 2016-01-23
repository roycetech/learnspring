package ph.rye.spring623.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ph.rye.spring623.model.Talker;
import ph.rye.spring623.service.TalkerRepository;

@Controller
@RequestMapping("/talker")
public class TalkerController {


    private final TalkerRepository talkerRepository;


    @Autowired
    public TalkerController(final TalkerRepository talkerRepository) {
        this.talkerRepository = talkerRepository;
    }


    @ModelAttribute
    public Talker talker() {
        return new Talker();
    }


    @RequestMapping(value = "/register", method = GET)
    public String showRegistrationForm() {
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = POST)
    public String processRegistration(@Valid Talker talker,
                                      final Errors errors) {
        if (errors.hasErrors()) {
            return "registerForm";
        }

        talkerRepository.save(talker);
        return "redirect:/talker/" + talker.getUsername();
    }

    @RequestMapping(value = "/{username}", method = GET)
    public String showTalkerProfile(@PathVariable final String username,
                                    final Model model) {
        final Talker talker = talkerRepository.findByUsername(username);
        model.addAttribute(talker);
        return "profile";
    }

}
