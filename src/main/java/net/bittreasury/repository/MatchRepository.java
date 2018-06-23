package net.bittreasury.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.bittreasury.entity.Match;
import net.bittreasury.entity.Team;

public interface MatchRepository extends JpaRepository<Match, Integer> {

	@Query(value = "select * from oo_match where team_a=?1", nativeQuery = true)
	List<Match> getByteam(Integer team_a);
	
	@Query(value = "select * from oo_match where team_a_team_id=?1 or team_b_team_id=?1", nativeQuery = true)
	List<Match> getByteam2(Integer team_a);
	
	//List<Match> getByTeam_aOrTeam_b(Team team);
}
