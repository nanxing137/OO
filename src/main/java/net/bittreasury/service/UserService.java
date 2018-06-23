package net.bittreasury.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.bittreasury.entity.User;
import net.bittreasury.repository.UserRepository;

public interface UserService {
	
	User getUserById(Integer userid);
	
	List<User> getUsersByTeamId(Integer teamId);
	
	User getUserByLogin(String name,String password);
	
	User getUserByLogin2(String name,String password);
	
	boolean save(User user);
	
	void update(User user);
	
	void delete(User user);
	
	User getUserByName(String username);
	
	User addUser(User user);
}

