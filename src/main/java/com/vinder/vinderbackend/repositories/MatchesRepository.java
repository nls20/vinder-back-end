package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.matches.Matches;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchesRepository extends JpaRepository<Matches, Long> {
}
