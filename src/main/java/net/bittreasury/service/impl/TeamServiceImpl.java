package net.bittreasury.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.stereotype.Service;

import net.bittreasury.entity.Team;
import net.bittreasury.repository.TeamRepository;
import net.bittreasury.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {
	@Autowired
	private TeamRepository teamRepository;

	public List<Team> findTeamList(String teamName) {
		Team team = new Team();
		team.setTeamName(teamName);
		ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("teamName", GenericPropertyMatchers.contains());
		Example<Team> ex = Example.of(team, matcher);
		List<Team> result = teamRepository.findAll(ex);
		return result;
	}

	@Override
	public Team geTeamById(Integer id) {
		Optional<Team> team = teamRepository.findById(id);
		return team.orElse(new Team());
	}

	@Override
	public List queryTeamLsit() {
		List<Team> list = teamRepository.findAll();
		return list;
	}

	@Override
	public Team addTeam(String teamName) {
		// TODO Auto-generated method stub
		Team team = new Team();
		team.setTeamName(teamName);
		team = teamRepository.save(team);
		return team;
	}
	
	@Override
	public Team getTeamByName(String teamName) {

		Team byTeamName = teamRepository.getByTeamName(teamName);
		System.out.println("********************************");
		System.out.println(byTeamName);
		return byTeamName;
	}

	@Override
	public void delete(Team team) {
		teamRepository.delete(team);
	}
	
	@Override
	public List<Team> getAllTeam() {
		List<Team> list = teamRepository.findAll();
		return list;
	}
}
