package net.bittreasury.service;

import java.util.List;

import net.bittreasury.entity.Team;

public interface TeamService {
	List<Team> findTeamList(String teamName);
	Team geTeamById(Integer id);
}
