package ph.rye.spring530.web;

import static org.hamcrest.Matchers.hasItems;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import ph.rye.spring530.model.Talkie;
import ph.rye.spring530.service.TalkieRepository;
import ph.rye.spring530.web.TalkieController;


public class TalkieControllerTest {

    @Test
    public void shouldShowRecentTalkies() throws Exception {

        final List<Talkie> expectedTalkies = createTalkieList(20);

        final TalkieRepository mockRepository =
                Mockito.mock(TalkieRepository.class);

        Mockito.when(mockRepository.findTalkies(Long.MAX_VALUE, 20)).thenReturn(
            expectedTalkies);

        final TalkieController controller =
                new TalkieController(mockRepository);

        final MockMvc mockMvc =
                standaloneSetup(controller)
                    .setSingleView(
                        new InternalResourceView("/WEB-INF/views/talkies.jsp"))
                    .build();

        mockMvc
            .perform(get("/talkies"))
            .andExpect(view().name("talkies"))
            .andExpect(model().attributeExists("talkieList"))
            .andExpect(
                model().attribute(
                    "talkieList",
                    hasItems(expectedTalkies.toArray())));
    }


    private List<Talkie> createTalkieList(final int count) {
        final List<Talkie> spittles = new ArrayList<Talkie>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Talkie("Talkie " + i, new Date()));
        }
        return spittles;
    }

}
