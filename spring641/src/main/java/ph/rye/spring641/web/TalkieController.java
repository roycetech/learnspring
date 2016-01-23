package ph.rye.spring641.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ph.rye.spring641.model.Talkie;
import ph.rye.spring641.service.TalkieRepository;

@Controller
@RequestMapping("/talkies")
public class TalkieController {


    private static final String LONG_MAX_STR = "9223372036854775807";


    private final TalkieRepository talkieRepository;


    @Autowired
    public TalkieController(final TalkieRepository talkieRepository) {
        this.talkieRepository = talkieRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Talkie> talkies(@RequestParam(value = "max", defaultValue = LONG_MAX_STR) final long max,
                                @RequestParam(value = "count", defaultValue = "20") final int count) {
        return talkieRepository.findTalkies(max, count);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveTalkie(final TalkieForm form, final Model model)
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

    @RequestMapping(value = "/{talkieId}", method = RequestMethod.GET)
    public String talkie(@PathVariable("talkieId") final long talkieId,
                         final Model model) {
        model.addAttribute(talkieRepository.findOne(talkieId));
        return "talkie";
    }

}
