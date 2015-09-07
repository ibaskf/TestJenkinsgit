package fr.treeptik.service;

import java.util.List;

import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.treeptik.dao.PlayerDAO;
import fr.treeptik.exception.DAOException;
import fr.treeptik.exception.ServiceException;
import fr.treeptik.model.Player;
@Service
public class PlayerService {

	private Logger logger = Logger.getLogger(PlayerService.class);

	@Autowired
	private PlayerDAO playerDAO;

	@Transactional
	public Player save(Player player) throws Exception {
		logger.debug("appel de la methode save par " + player.getFirstName());
		try {
			return playerDAO.save(player);
		} catch (PersistenceException e) {
			logger.error("erreur save player " + e.getMessage());
			throw new ServiceException("erreur save player", e);
		}
	}

	public List<Player> findAll() throws ServiceException, DAOException {
		try {
			return playerDAO.findAll();
		} catch (PersistenceException e) {
			throw new ServiceException("erreur save personne", e);
		}
	}
	


		
	
	@Transactional
	public Player update(Player player) throws DAOException{
	
			return playerDAO.save(player);
	
	}
	
	@Transactional
	public void remove(Player player) throws DAOException{
	  
		playerDAO.delete(player);
			
	
	}
	
	
	@Transactional
	public void removeById(Integer id) throws DAOException{
	  
		playerDAO.delete(id);
			
	
	}
	
	public List<Player> findBylastName(String name){
		return playerDAO.findBylastName(name);
		
	}
	public List<Player> findByfirstName(String name){
		return playerDAO.findByfirstName(name);
		
	}
	public Player findById(Integer id){
		return playerDAO.findById(id);
	}
 public 	List<Player> findBytshirtNumber(Integer ts){
		return playerDAO.findBytshirtNumber(ts);
	}
	public PlayerDAO getPlayerDAO() {
		return playerDAO;
	}

	public void setPlayerDAO(PlayerDAO playerDAO) {
		this.playerDAO = playerDAO;
	}

}
