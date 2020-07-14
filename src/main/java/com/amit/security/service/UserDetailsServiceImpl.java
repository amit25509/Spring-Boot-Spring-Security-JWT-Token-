package com.amit.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.amit.security.model.User;
import com.amit.security.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		//we get full custom User object using UserRepository
		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

		//then we build a UserDetails object using static build() method.
		return UserDetailsImpl.build(user);
	}

}


/*

We need UserDetailsService for getting UserDetails object. 
As UserDetailsService(pre-defined) interface that has only one method: loadUserByUsername(..)

*/