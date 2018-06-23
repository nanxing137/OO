package net.bittreasury.service;

import java.util.List;

import net.bittreasury.entity.Match;
import net.bittreasury.entity.Team;

public interface MatchService {


	boolean addMatch(Team geTeamById, Team geTeamById2, Team geTeamById3,String name,String score, String time, String address);

	 List<Match> queryMatchList();

	boolean macthmodify(int mId, String mName, Team geTeamById, String score, String time, String address);

	boolean deleteMacth(int mId);
	
	List<Match> findteam(Integer team);


}
