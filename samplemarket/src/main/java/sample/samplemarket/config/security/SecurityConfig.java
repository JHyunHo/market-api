package sample.samplemarket.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Override
    public void configure(WebSecurity web) throws Exception{
        super.configure(web);
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .httpBasic().disable() // 1번
                .formLogin().disable() // 2번
                .csrf().disable() // 3번
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) // 4번
                .and()
                .authorizeRequests()
                .antMatchers("/**").permitAll(); // 5번
    }
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder(); // 6번
    }

}
