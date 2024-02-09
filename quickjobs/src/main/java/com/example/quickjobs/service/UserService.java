package com.example.quickjobs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quickjobs.entiry.User;
import com.example.quickjobs.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRopo;

	public boolean createOr(User use) {
		String p1=use.getCof();
		
		if(p1.equals(use.getPassword())) {
			userRopo.save(use);
			return true;
		}
		return false;
	}
}
