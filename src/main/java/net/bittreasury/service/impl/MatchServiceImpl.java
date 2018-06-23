
package net.bittreasury.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.devtools.tunnel.client.TunnelClient;
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
	public boolean addMatch(Team geTeamById, Team geTeamById2, Team geTeamById3,String name, String score, String time, String address) {
		// TODO Auto-generated method stub
		Match match = new Match();
		match.setTeam_a(geTeamById);
		match.setTeam_b(geTeamById2);
		match.setWinner(geTeamById3);
		match.setName(name);
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
	@Override
	public boolean macthmodify(int mId, String mName, Team geTeamById, String score, String time, String address) {
		// TODO Auto-generated method stub
		MatchRepository matchRepository2 = matchRepository;
		Match m =  matchRepository2.getOne(mId);
		Match match = new Match();
		match =m;
		match.setmId(mId);
		match.setName(mName);
		match.setWinner(geTeamById);
		match.setScores(score);
		match.setAddress(address);
		match.setM_date(time);
		matchRepository2.save(match);
		return true;
	}
	@Override
	public boolean deleteMacth(int mId) {
		// TODO Auto-generated method stub
		matchRepository.deleteById(mId);
		return true;
	}
	@Override
	public List<Match> findteam(Integer team) {
		
		return matchRepository.getByteam2(team);
	}

}

