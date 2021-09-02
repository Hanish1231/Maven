package com.htc.pharma.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	

	@Autowired
	PasswordEncoder passwordEncoder;
	
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	auth.inMemoryAuthentication()
    	.passwordEncoder(passwordEncoder)
    	.withUser("user").password(passwordEncoder.encode("user")).roles("USER")
    	.and()
    	.withUser("admin").password(passwordEncoder.encode("admin")).roles("USER", "ADMIN");
 
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/static/**");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
			.antMatchers("/login").permitAll()
			.antMatchers("/").hasRole("USER")
			.antMatchers("/registration").hasRole("ADMIN")
			.antMatchers("/viewRegisteredMedicines").hasRole("ADMIN")
			.antMatchers("/viewRegisteredMedicines").hasRole("USER")
			.antMatchers("/editPharmaForm").hasRole("ADMIN")
			.antMatchers("/searchMedicine").hasRole("USER")
			.antMatchers("/searchview").hasRole("USER")
			.anyRequest()
			.authenticated()
            .and().csrf().disable()
            .formLogin()
            	.loginPage("/login")
            	.failureUrl("/login?error=true")
            	.usernameParameter("username")
            	.passwordParameter("password")
            	.defaultSuccessUrl("/")
            	.and()
            	.logout()
            		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            		.logoutSuccessUrl("/login?logout=true")
            		.and()
            		.exceptionHandling()
            			.accessDeniedPage("/accessDenied");
	}
	
	
	
}
