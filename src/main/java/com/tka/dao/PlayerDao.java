package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.model.Player;

@Repository
public class PlayerDao {

List<Player> players = new ArrayList<Player>();
	
	public PlayerDao() {
		players.add(new Player(1,"Rohit sharma",33,"MI","Batsman"));
		players.add(new Player(2,"Virat Kohali",32,"RCB","Batsman"));
	}

	public String addPlayer(Player player) {
		players.add(player);
		return "Added Successfully";
	}
	public List<Player> getAllPlayers(){
		
		return players;
	}
	
	public Player getPlayerById(int id) {
		for (Player player : players) {
			if(player.getPlayerId()==id) {
				return player;
			}else {
				return null;
			}
		}
		
		return null;
	}
	
	public String deletePlayer(int id) {
		String msg="";
		for (Player player : players) {
			if(player.getPlayerId()==id) {
				players.remove(player);
			return msg="Player Deleted";
			}
		}
		return msg="Player not found!!";
		
	}
	
	public String updatePlayer(int id , Player player) {
		String msg="";
		for (Player player2 : players) {
			if(player2.getPlayerId()==id) {
				players.add(player);
				return msg="Player updated";
			}
		}
		return msg="Player Not found!!";
	}

}
