package com.example.organisation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests()
		.antMatchers("/").permitAll()
		.anyRequest().authenticated()
		.and().httpBasic().and()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("{noop}userPass").roles("USER") //noop used as password storage format; noop -> NoOpPasswordEncoder
		.and().withUser("admin").password("{noop}admin")
				.credentialsExpired(false).accountExpired(false).accountLocked(false)
				.authorities("WRITE_PRIVILEGES", "READ_PRIVILEGES").roles("ADMIN");
	}

}
