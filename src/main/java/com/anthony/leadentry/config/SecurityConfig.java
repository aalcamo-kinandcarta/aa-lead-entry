package com.anthony.leadentry.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
/**
 * we are configuring web-based security for http requests. In this example, we are simply
 * authorizing any user to issue any request if the user is authenticated by a SAML 2.0
 * Service Provider.via SAML.
 *
 * since we are extending the WebSecurityConfigurerAdapter when we include the
 * spring-security-saml2-service-privider the configure below is basically the
 * same as the defaults.
 *
 * we override as we are sure to perfomr som role-based authorization in here as well.
 *
 * Spring boot also creates a RelyingPartyRegistrationRepository bean which represents the
 * asserting party and relying party metadata (e.g. the sso endpoint location the relying
 * party should use when requesting authentication). unsure if this will need to be
 * overridden as this application will not be multitenant (initially).
 *
 * we have configured the identity provider information in our application.yml, but could also
 * have done it here via overriding relyingPartyRegistration(). Note: the registrationId is an
 * arbitrary value to differentiate between IdP registrations (e.g. okta, google).
 *
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .saml2Login(withDefaults());

        // /future role-based authorization might be done like this:
        // http.authorizeRequests().antMatchers("/**").hasRole("LOAN_APPROVER")

    }

}
