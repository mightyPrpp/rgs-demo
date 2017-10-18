package com.example.demoproject;


import com.example.demoproject.Security.LoginAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import com.example.demoproject.Security.LoginSuccessHandler;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

  /*  @Autowired
    private LoginAuthenticationProvider loginAuthenticationProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {


    //  .and().formLogin().defaultSuccessUrl("/")
    //  .loginPage("/login").and()
    // .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login");


      /*  http.authorizeRequests()
                .formLogin()   //glykeria
                .LoginPage("/login")  //glykeria
                .defaultSuccessUrl("/") //otan ginei success ua pigainei ekei
                .and() //append to login me to logout
                .logout()                                   //glykeria
                .logoutUrl("/logout")                           //glykeria
                .logoutSuccessfullUrl("/login")                 //glykeria
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/register").anonymous()
                .antMatchers("/adminPage").hasAnyAuthority("ADMIN")
                .antMatchers("/userPage").hasAnyAuthority("SIMPLE")

                .and()
                .authenticationProvider(loginAuthenticationProvider);





        /*
                .antMatchers("/admin/**").hasAuthority("ADMIN")
                .anyRequest().fullyAuthenticated()
                .and().csrf().disable()  //ok
                .formLogin().successHandler(loginSuccessHandler)
                .loginPage("/login")
                .permitAll()
                .usernameParameter("email")
                .passwordParameter("password")
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")
                .permitAll();
                */
    //}
/*
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(loginAuthenticationProvider);
    }

}
*/


        @Autowired
        private LoginAuthenticationProvider loginAuthenticationProvider;

        @Autowired
        private LoginSuccessHandler loginSuccessHandler;

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable()

                    .formLogin()
                    .loginPage("/login")
                    .successHandler(loginSuccessHandler)
                    .and()
                    .logout()
                    .logoutUrl("/logout")
                    .logoutSuccessUrl("/login")
                    .permitAll()

                    .and()
                    .authorizeRequests()
                    .antMatchers("/").permitAll()
                    .antMatchers("/register").anonymous()
                    .antMatchers("/adminPage").hasAnyAuthority("ADMIN")
                    .antMatchers("/userPage").hasAnyAuthority("SIMPLE")

                    .and()
                    .authenticationProvider(loginAuthenticationProvider);
        }
    }
