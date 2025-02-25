package com.tka.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.PlayerDao;
import com.tka.model.Player;

@Service
public class PlayerService {

	@Autowired
	private PlayerDao playerDao;
	
	public String addPlayer(Player player) {
		String msg = playerDao.addPlayer(player);
		return msg;
	}
	public List<Player> getAllPlayers(){
		List<Player> allPlayers = playerDao.getAllPlayers();
		return allPlayers;
	}
	
	public Player getPlayerById(int id) {
		Player player = playerDao.getPlayerById(id);
		return player;
	}
	
	public String deletePlayer(int id) {
		String msg = playerDao.deletePlayer(id);
		return msg;
	}
	public String updatePlayer(int id ,Player player) {
		String msg = playerDao.updatePlayer(id, player);
		return msg;
	}

}
