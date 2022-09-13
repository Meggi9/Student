package com.example.application.securingweb;

import com.example.application.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    StudentService studentService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeRequests()
                  .antMatchers("/", "/student-create","/templates/**","/image_entrance/**","/style/**").permitAll()
                  .anyRequest().authenticated()
                .and()
                  .formLogin()
                  .loginPage("/login")
                  .permitAll()
                .and()
                  .logout()
                  .permitAll();
    }





    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(studentService)
                .passwordEncoder(NoOpPasswordEncoder.getInstance());
                /**.usersByUsernameQuery("select login, password from student where login=?")
                .authoritiesByUsernameQuery("select s.login, sr.roles from student s inner join student_role sr on s.record_number" +
                        "=sr.student.id where s.login=?");*/
    }
}