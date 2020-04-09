package kg.megacom;

import com.fasterxml.jackson.databind.ObjectMapper;
import kg.megacom.controllers.LotController;
import kg.megacom.models.dto.LotDto;
import kg.megacom.services.LotService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Date;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(LotController.class)
@MockBean(LotService.class)
//@SpringBootTest
public class LotControllerTest {

    @Autowired
    private MockMvc mockMvc;


   // private ObjectMapper om;
    @Before
    public void beforeAll(){
            createLotDto();
           // om=new ObjectMapper();
    }
    private String createLotDto(){
     LotDto lotDto=new LotDto();
     lotDto.setEndDate(new Date());
     lotDto.setName("Car");
     lotDto.setPriceForBuy(12000);
     return asJsonString(lotDto);

    }
    @Test
    public void testSave() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.
                post("/lots/save")
        .content(createLotDto())
        .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists());

    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
