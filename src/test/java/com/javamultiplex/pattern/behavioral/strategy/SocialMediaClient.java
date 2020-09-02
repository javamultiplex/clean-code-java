package com.javamultiplex.pattern.behavioral.strategy;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 02/09/20 11:46 pm
 * @copyright www.javamultiplex.com
 */
public class SocialMediaClient {

    @Test
    public void shouldConnectToFacebook() {
        SocialMediaContext socialMediaContext = new SocialMediaContext(new FacebookStrategy());
        socialMediaContext.connect("Rohit");
    }

    @Test
    public void shouldConnectToTwitter() {
        SocialMediaContext socialMediaContext = new SocialMediaContext(new TwitterStrategy());
        socialMediaContext.connect("Rohit");
    }

    @Test
    public void shouldConnectToGooglePlus() {
        SocialMediaContext socialMediaContext = new SocialMediaContext(new GooglePlusStrategy());
        socialMediaContext.connect("Rohit");
    }

    @Test
    public void shouldConnectToOrkut() {
        SocialMediaContext socialMediaContext = new SocialMediaContext(new OrkutStrategy());
        socialMediaContext.connect("Rohit");
    }
}
