package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.model.Team;
import com.tka.services.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	
	@PostMapping("api/teams")
	public String addTeam(@RequestBody Team team) {
		
		String msg = teamService.addTeam(team);
		return msg;
	}
	
	@GetMapping("/api/teams/all")
	public List<Team> getAllTeams(){
		List<Team> allTeams = teamService.getAllTeams();
		return allTeams;
	}
	
	@GetMapping("/api/team")
	public Object getTeamById(@RequestParam int id) {
		Team team = teamService.getTeamById(id);
		if(team!=null) {
			return team;
		}else {
			return "Team Not Found!!";
		}
	}
	@DeleteMapping("/api/teams/{id}")
	public String deleteTeam(@PathVariable int id) {
		String msg = teamService.deleteTeam(id);
		return msg;
	}
	
	@PutMapping("/api/teams/{id}")
	public String updateTeam(@RequestBody Team team ,@PathVariable int id) {
		String msg = teamService.updateTeam(id, team);
		return msg;
	}
	
}
