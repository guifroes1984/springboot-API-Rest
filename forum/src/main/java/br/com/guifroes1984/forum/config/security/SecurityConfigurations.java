package br.com.guifroes1984.forum.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {
	
	/*Configurações de autenticação. Controle de acesso, login*/
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	}
	
	/*Configurações de Autorização. Parte de URL's, quem pode acessar cada url, perfil de acesso*/
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers(HttpMethod.GET, "/topicos").permitAll()
			.antMatchers(HttpMethod.GET, "/topicos/*").permitAll()
			.anyRequest().authenticated()
			.and().formLogin();
	}
	
	/*Configurações de recursos estáticos. Requisições para arquivos CSS, JavaScript, imagens...*/
	@Override
	public void configure(WebSecurity web) throws Exception {
	}
	
}
