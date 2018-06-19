package net.bittreasury.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import net.bittreasury.repository.ManagerRepository;
import net.bittreasury.service.ManagerService;
@Service
public class ManagerServiceImpl implements ManagerService {
	@Autowired 
	private ManagerRepository managerRepository;
	

	@Override
	public List queryTeamLsit() {
		return null;
	}
}
