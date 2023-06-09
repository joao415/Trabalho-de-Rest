//package com.security;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
//import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfiguration{
//
//	@Autowired
//	private UserDetailsService userDetailsService;
//
//	@Autowired
//	private DataSource dataSource;
//
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//		return bCryptPasswordEncoder;
//	}
//
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//
//		// Setting Service to find User in the database.
//		// And Setting PassswordEncoder
//		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//
//	}
//
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http.csrf().disable().authorizeRequests()
//        .antMatchers("/").permitAll()
//        .antMatchers(HttpMethod.POST,"/turmas").permitAll()
//        .antMatchers(HttpMethod.POST, "/login").permitAll()
//        .antMatchers(HttpMethod.POST,"/newuser/*").permitAll()
//        .antMatchers(HttpMethod.GET,"/master/*").permitAll()
//         .antMatchers(HttpMethod.GET,"/exploreCourse").permitAll()
//        .anyRequest().authenticated()
////		http.csrf().disable();
////
////		// The pages does not require login
////		http.authorizeRequests().requestMatchers("/", "/login", "/logout").permitAll();
////
////		// /userInfo page requires login as ROLE_USER or ROLE_ADMIN.
////		// If no login, it will redirect to /login page.
////		http.authorizeRequests().requestMatchers("/turmas").permitAll();
////
////		// For ADMIN only.
////		http.authorizeRequests().requestMatchers("/admin").access("hasRole('ROLE_ADMIN')");
////
////		// When the user has logged in as XX.
////		// But access a page that requires role YY,
////		// AccessDeniedException will be thrown.
////		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");
////
////		// Config for Login Form
////		http.authorizeRequests().and().formLogin()//
////				// Submit URL of login page.
////				.loginProcessingUrl("/j_spring_security_check") // Submit URL
////				.loginPage("/login")//
////				.defaultSuccessUrl("/userAccountInfo")//
////				.failureUrl("/login?error=true")//
////				.usernameParameter("username")//
////				.passwordParameter("password")
////				// Config for Logout Page
////				.and().logout().logoutUrl("/logout").logoutSuccessUrl("/logoutSuccessful");
////
////		// Config Remember Me.
////		http.authorizeRequests().and() //
////				.rememberMe().tokenRepository(this.persistentTokenRepository()) //
////				.tokenValiditySeconds(1 * 24 * 60 * 60); // 24h
//
//	}
//
//	@Bean
//	public PersistentTokenRepository persistentTokenRepository() {
//		JdbcTokenRepositoryImpl db = new JdbcTokenRepositoryImpl();
//		db.setDataSource(dataSource);
//		return db;
//	}
//}
