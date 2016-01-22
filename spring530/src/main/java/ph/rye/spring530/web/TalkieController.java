package ph.rye.spring530.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ph.rye.spring530.model.Talkie;
import ph.rye.spring530.service.TalkieRepository;

@Controller
@RequestMapping("/talkies")
public class TalkieController {


    private final TalkieRepository talkieRepository;


    @Autowired
    public TalkieController(final TalkieRepository talkieRepository) {
        this.talkieRepository = talkieRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String talkies(final Model model) {
        model.addAttribute(talkieRepository.findTalkies(Long.MAX_VALUE, 20));
        return "talkies";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveSpittle(final TalkieForm form, final Model model)
            throws Exception {

        talkieRepository.save(
            new Talkie(
                null,
                form.getMessage(),
                new Date(),
                form.getLongitude(),
                form.getLatitude()));
        return "redirect:/talkies";
    }


}
