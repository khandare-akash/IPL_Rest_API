package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.model.Team;

@Repository
public class TeamDao {
	
	List<Team> teams = new ArrayList<Team>();
	public TeamDao() {
		teams.add(new Team(1,"MI","Mumbai","mahela jayawardene"));
		teams.add(new Team(2,"RCB","Benglore","Anil Kumbale"));
		teams.add(new Team(3,"CSK","Chennai","Stephen Fleming"));

	}

	public String addTeam(Team team) {
		teams.add(team);
		return "Added Successfully";
	}
	public List<Team> getAllTeams(){
		
		return teams;
	}
	
	public Team getTeamById(int id) {
		for (Team team : teams) {
			if(team.getTeamId()==id) {
				return team;
			}else {
				return null;
			}
		}
		
		return null;
	}
	
	public String deleteTeam(int id) {
		String msg="";
		for (Team team : teams) {
			if(team.getTeamId()==id) {
				teams.remove(team);
			return msg="Team Deleted";
			}
		}
		return msg="Team not found!!";
		
	}
	
	public String updateTeam(int id , Team team) {
		String msg="";
		for (Team team2 : teams) {
			if(team2.getTeamId()==id) {
				teams.add(team);
				return msg="Team updated";
			}
		}
		return msg="Team Not found!!";
	}
}
