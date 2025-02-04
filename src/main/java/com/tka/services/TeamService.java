package com.tka.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.TeamDao;
import com.tka.model.Team;

@Service
public class TeamService {

	@Autowired
	private TeamDao teamDao;

	public String addTeam(Team team) {
		String msg = teamDao.addTeam(team);
		return msg;
	}
	public List<Team> getAllTeams(){
		List<Team> allTeams = teamDao.getAllTeams();
		return allTeams;
	}
	
	public Team getTeamById(int id) {
		Team team = teamDao.getTeamById(id);
		return team;
	}
	
	public String deleteTeam(int id) {
		String msg = teamDao.deleteTeam(id);
		return msg;
	}
	public String updateTeam(int id ,Team team) {
		String msg = teamDao.updateTeam(id, team);
		return msg;
	}

}
