package fr.treeptik.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.treeptik.model.Player;

@Repository
public interface PlayerDAO extends JpaRepository<Player,Integer>{
	List<Player> findBylastName(String name);
	List<Player> findByfirstName(String name);
	Player findById(Integer id);
	List<Player> findBytshirtNumber(Integer ts);
	
	
	

}
