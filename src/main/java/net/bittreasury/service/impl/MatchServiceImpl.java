package net.bittreasury.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bittreasury.entity.Match;
import net.bittreasury.entity.Team;
import net.bittreasury.repository.ManagerRepository;
import net.bittreasury.repository.MatchRepository;
import net.bittreasury.service.MatchService;


@Service
public class MatchServiceImpl implements MatchService {

	@Autowired 
	private MatchRepository matchRepository;
	public boolean addMatch(Team geTeamById, Team geTeamById2, Team geTeamById3, String score, String time, String address) {
		// TODO Auto-generated method stub
		Match match = new Match();
		match.setTeam_a(geTeamById);
		match.setTeam_b(geTeamById2);
		match.setWinner(geTeamById3);
		match.setScores(score);
		match.setAddress(address);
		match.setM_date(time);
		Match save = matchRepository.save(match);
		System.out.println(save.getmId());
		return true;
	}
	@Override
	public List<Match> queryMatchList() {
		List<Match> findAll = matchRepository.findAll();
		return findAll;
	}

}
