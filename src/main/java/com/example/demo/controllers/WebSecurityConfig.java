/*package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//import com.cristianruizblog.loginSecurity.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    //Necesario para evitar que la seguridad se aplique a los resources
    //Como los css, imagenes y javascripts
    String[] resources = new String[]{
            "/include/**","/css/**","/icons/**","/img/**","/js/**","/layer/**"
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(resources).permitAll()
                .antMatchers("/","/index").permitAll()
                .antMatchers("/Administrador*").access("hasRole('ADMINISTRADOR')")
                .antMatchers("/Usuario*").access("hasRole('USUARIO') or hasRole('ADMINISTRADOR')")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .defaultSuccessUrl("/menu")
                .failureUrl("/login?error=true")
                .usernameParameter("usuario")
                .passwordParameter("contraseña")
                .and()
                .logout()
                .permitAll()
                .logoutSuccessUrl("/login?logout");
    }
    BCryptPasswordEncoder bCryptPasswordEncoder;
}
*/