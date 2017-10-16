package za.ac.mzilikazi.Security;

/**
 * Created by Asavela on 2017/08/15.
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(AuthenticationManagerBuilder amb) throws Exception{
        amb.inMemoryAuthentication().withUser("User").password("Password")
                .roles("USER").and().withUser("Camzilikazi").password("Milisakuse").roles("ADMIN");

    }

    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.httpBasic().and().authorizeRequests().antMatchers("/PassengerLocator/**")
                .hasRole("USER").and().csrf().disable().headers().frameOptions().disable();
    }

}
