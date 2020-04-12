package kg.megacom;

import com.fasterxml.jackson.databind.ObjectMapper;
import kg.megacom.controllers.LotController;
import kg.megacom.models.dto.LotDto;
import kg.megacom.services.LotService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Date;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(LotController.class)
@MockBean(LotService.class)
//@SpringBootTest
public class LotControllerTest {
    LotDto lotDto;
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private LotService lotService;
    private ObjectMapper om;
    @Before
    public void beforeAll(){
        lotDto=new LotDto();
        lotDto.setId(1);
        lotDto.setEndDate(new Date());
        lotDto.setName("Car");
        lotDto.setPriceForBuy(12000);

        Mockito.when(lotService.saveLot(lotDto)).thenReturn(lotDto);


        //createLotDto();
        om=new ObjectMapper();
    }

   /* private String createLotDto(){
     LotDto lotDto=new LotDto();
     lotDto.setEndDate(new Date());
     lotDto.setName("Car");
     lotDto.setPriceForBuy(12000);
     return asJsonString(lotDto);

    }*/
    @Test
    public void testSave() throws Exception {
        mockMvc.perform(
                post("/lots/save")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(om.writeValueAsString(lotDto)))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith("application/json"))
                .andExpect(jsonPath("$.id").value(lotDto.getId()))
                .andExpect(jsonPath("$.name").value(lotDto.getName()));

    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
