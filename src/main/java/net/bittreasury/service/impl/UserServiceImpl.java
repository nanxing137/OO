package net.bittreasury.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.bittreasury.entity.User;
import net.bittreasury.repository.UserRepository;
import net.bittreasury.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsersByTeamId(Integer teamId) {
		// TODO Auto-generated method stub
		return null;
	}

}
