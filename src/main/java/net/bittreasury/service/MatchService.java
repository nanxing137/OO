package net.bittreasury.service;

import java.util.List;

import net.bittreasury.entity.Match;
import net.bittreasury.entity.Team;

public interface MatchService {


	boolean addMatch(Team geTeamById, Team geTeamById2, Team geTeamById3,String score, String time, String address );

	 List<Match> queryMatchList();

}
