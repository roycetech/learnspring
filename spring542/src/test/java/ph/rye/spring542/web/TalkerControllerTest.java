package ph.rye.spring542.web;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;

import ph.rye.spring542.model.Talker;
import ph.rye.spring542.service.TalkerRepository;


public class TalkerControllerTest {

    @Test
    public void shouldShowRegistration() throws Exception {

        final TalkerRepository mockRepository =
                Mockito.mock(TalkerRepository.class);

        final TalkerController controller =
                new TalkerController(mockRepository);
        final MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/talker/register")).andExpect(
            view().name("registerForm"));
    }

    @Test
    public void shouldProcessRegistration() throws Exception {

        final TalkerRepository mockRepository =
                Mockito.mock(TalkerRepository.class);

        final Talker unsaved = new Talker(
            "jappleseed",
            "24hours",
            "John",
            "Appleseed",
            "jappleseed@test.com");

        final Talker saved = new Talker(
            24L,
            "jappleseed",
            "24hours",
            "John",
            "Appleseed",
            "jappleseed@test.com");

        Mockito.when(mockRepository.save(unsaved)).thenReturn(saved);

        final TalkerController controller =
                new TalkerController(mockRepository);

        final MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc
            .perform(
                post("/talker/register")
                    .param("firstName", "John")
                    .param("lastName", "Appleseed")
                    .param("username", "jappleseed")
                    .param("password", "24hours")
                    .param("email", "jappleseed@test.com"))
            .andExpect(redirectedUrl("/talker/jappleseed"));

        Mockito.verify(mockRepository, Mockito.atLeastOnce()).save(unsaved);
    }

    @Test
    public void shouldFailValidationWithNoData() throws Exception {

        final TalkerRepository mockRepository = mock(TalkerRepository.class);

        final TalkerController controller =
                new TalkerController(mockRepository);

        final MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc
            .perform(post("/talker/register"))
            .andExpect(status().isOk())
            .andExpect(view().name("registerForm"))
            .andExpect(model().errorCount(5))
            .andExpect(
                model().attributeHasFieldErrors(
                    "talker",
                    "firstName",
                    "lastName",
                    "username",
                    "password",
                    "email"));
    }


}
