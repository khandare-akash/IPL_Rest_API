package com.tka.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.MatchDao;
import com.tka.model.Match;

@Service
public class MatchService {

	@Autowired
	private MatchDao matchDao;
	
	public String addMatch(Match match) {
		String msg = matchDao.addMatch(match);
		return msg;
	}
	public List<Match> getAllMatchs(){
		List<Match> allMatchs = matchDao.getAllMatchs();
		return allMatchs;
	}
	
	public Match getMatchById(int id) {
		Match match = matchDao.getMatchById(id);
		return match;
	}
	
	public String deleteMatch(int id) {
		String msg = matchDao.deleteMatch(id);
		return msg;
	}
	public String updateMatch(int id ,Match match) {
		String msg = matchDao.updateMatch(id, match);
		return msg;
	}

}
