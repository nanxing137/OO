package net.bittreasury.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.bittreasury.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Integer> {

	@Query(value = "select * from oo_match where team_a=?1", nativeQuery = true)
	List<Match> getByteam(Integer team_a);
}
