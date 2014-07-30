package org.example;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserService implements UserDetailsService {

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		Collection<? extends GrantedAuthority> authorities = AuthorityUtils
				.createAuthorityList("Role1", "role2", "role3");
		return new User("testuser", "testpwd", authorities);

	}
}
