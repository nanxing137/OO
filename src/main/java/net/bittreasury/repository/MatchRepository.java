package net.bittreasury.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.bittreasury.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Integer> {

}
