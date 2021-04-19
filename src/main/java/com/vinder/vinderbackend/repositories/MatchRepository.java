package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.matches.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface MatchRepository extends JpaRepository<Match, Long> {

    Match findByCurrentUserIdAndMatchedUserId(Long id, Long target);


}
