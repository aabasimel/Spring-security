package org.abasimel.spring_security.service;

import org.abasimel.spring_security.model.UserPrincipal;
import org.abasimel.spring_security.model.Users;
import org.abasimel.spring_security.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.findByUsername(username);
        if(user==null){
            System.out.print("User not found");
            throw new UsernameNotFoundException("user not found");
        }

        return new UserPrincipal(user);

    }

}
