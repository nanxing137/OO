package net.bittreasury.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.stereotype.Service;

import net.bittreasury.entity.Team;
import net.bittreasury.entity.User;
import net.bittreasury.repository.UserRepository;
import net.bittreasury.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsersByTeamId(Integer teamId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByLogin(String name, String password) {
	
		
		User user = new User();
		user.setUname(name);
		user.setUpassword(password);
		ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("uname", GenericPropertyMatchers.exact()).withMatcher("upassword", GenericPropertyMatchers.exact());
		Example<User> example = Example.of(user,matcher);
		
		
		userRepository.findOne(example);
		return null;
	}

	@Override
	public User getUserByLogin2(String name, String password) {
		
		return userRepository.getByLogin(name, password);
	}

	@Override
	public User getUserById(Integer userid) {
		
		return userRepository.getOne(userid);
	}

	@Override
	public boolean save(User user) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void delete(User user) {
		userRepository.deleteById(user.getUid());
	}

	@Override
	public User getUserByName(String username) {
		// TODO Auto-generated method stub
		
		return userRepository.getByUname(username);
	}
	@Override
	public User addUser(User user) {
		User save = userRepository.save(user);
		return save;
	}

}
