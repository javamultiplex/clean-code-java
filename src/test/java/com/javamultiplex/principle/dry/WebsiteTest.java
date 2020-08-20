package com.javamultiplex.principle.dry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 20/08/20 11:55 pm
 * @copyright www.javamultiplex.com
 */
public class WebsiteTest {
    private Website website;

    @BeforeEach
    void setUp() {
        website=new Website();
    }

    @Test
    public void shouldPrintHomePage(){
        website.homePage();
    }

    @Test
    public void shouldPrintAboutPage(){
        website.aboutPage();
    }

    @Test
    public void shouldPrintContactPage(){
        website.contactPage();
    }
}
