import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.kurs.model.Club;
import pl.kurs.service.ClubService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ClubServiceTest {

    private ClubService service;
    private Club c1;
    private Club c2;
    private Club c3;
    private List<Club> clubs;

    @Before
    public void init() {
        service = new ClubService();
        c1 = new Club("Manchester",null, "ENG");
        c2 = new Club("Manchester2","asedasd", "ENG");
        c3 = new Club("Manchester3","asdasd", "ENG");

        clubs = new ArrayList<>(List.of(c1,c2,c3));
    }

    @Test
    public void schouldReturnAllClubsWithoutCode() {
        List<Club> result = service.allClubswithoutCode(clubs);
        List<Club> expected = List.of(c1);
        assertEquals(expected,result);
    }


}
