package pl.kurs;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.kurs.model.Club;
import pl.kurs.model.League;
import pl.kurs.service.ClubService;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    private static final String PATH = "src/main/resources/";
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        League league = objectMapper.readValue(new File("src/main/resources/PremierLeague.json"), League.class);
        System.out.println(league);

        Club club = new Club("Bayern", "BAY","Germany");
        objectMapper.writeValue(new File("src/main/resources/Bayern.json"), club);

        ClubService clubService = new ClubService();
        System.out.println(clubService.allClubswithoutCode(league.getClubs()));


    }
}
