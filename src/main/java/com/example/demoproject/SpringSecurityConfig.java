package com.example.demoproject;


import com.example.demoproject.Security.LoginAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private LoginAuthenticationProvider loginAuthenticationProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       // http.csrf().requireCsrfProtectionMatcher(new AntPathRequestMatcher("**/login"))
              //  .and().formLogin().defaultSuccessUrl("/")
              //  .loginPage("/login").and()
               // .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login");


        http.authorizeRequests()
                .formLogin()   //glykeria
                .LoginPage("/login")  //glykeria
                .defaultSuccessUrl("/") //otan ginei success ua pigainei ekei
                .and() //append to login me to logout
                .logout()                                   //glykeria
                .logoutUrl("/logout")                           //glykeria
                .logoutSuccessfullUrl("/login")                 //glykeria
                .permitAll()
                




                .antMatchers("/admin/**").hasAuthority("ADMIN")
                .anyRequest().fullyAuthenticated()
                .and().csrf().disable()  //ok
                .formLogin().successHandler(LoginSuccessHandler)
                .loginPage("/login")
                .permitAll()
                .usernameParameter("email")
                .passwordParameter("password")
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(loginAuthenticationProvider);
    }

}
