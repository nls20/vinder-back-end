package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.matches.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
}
