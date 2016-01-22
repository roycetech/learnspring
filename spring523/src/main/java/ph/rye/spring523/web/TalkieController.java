package ph.rye.spring523.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ph.rye.spring523.service.TalkieRepository;

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

}
