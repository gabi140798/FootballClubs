package pl.kurs.service;

import pl.kurs.model.Club;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class ClubService {

    public List<Club> allClubswithoutCode(List<Club> clubs) {
        return Optional.ofNullable(clubs)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(club -> club.getCode() == null)
                .toList();
    }
}
