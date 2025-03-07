package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.model.Match;


@Repository
public class MatchDao {

	List<Match> matchs = new ArrayList<Match>();
	
	public MatchDao() {
		matchs.add(new Match(1,"MI","RCB","15-Nov-2025","Mumbai","MI win by 10 wickets"));
		matchs.add(new Match(2,"GG","RCB","16-Nov-2025","Gujrat","GG win by 4 wickets"));
	}

	public String addMatch(Match match) {
		matchs.add(match);
		return "Added Successfully";
	}
	public List<Match> getAllMatchs(){
		
		return matchs;
	}
	
	public Match getMatchById(int id) {
		for (Match match : matchs) {
			if(match.getMatchId()==id) {
				return match;
			}else {
				return null;
			}
		}
		
		return null;
	}
	
	public String deleteMatch(int id) {
		String msg="";
		for (Match match : matchs) {
			if(match.getMatchId()==id) {
				matchs.remove(match);
			return msg="Match Deleted";
			}
		}
		return msg="Match not found!!";
		
	}
	
	public String updateMatch(int id , Match match) {
		String msg="";
		for (Match match2 : matchs) {
			if(match2.getMatchId()==id) {
				matchs.add(match);
				return msg="Match updated";
			}
		}
		return msg="Match Not found!!";
	}

	
}
