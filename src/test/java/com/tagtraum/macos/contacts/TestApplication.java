/*
 * =================================================
 * Copyright 2021 tagtraum industries incorporated
 * All rights reserved.
 * =================================================
 */
package com.tagtraum.macos.contacts;

import org.junit.jupiter.api.Test;

/**
 * TestApplication.
 *
 * @author <a href="mailto:hs@tagtraum.com">Hendrik Schreiber</a>
 */
public class TestApplication {

    @Test
    public void testMyCard() {
        final Application application = Application.getInstance();
        final Person card = application.getMyCard();
        System.out.println("My Card: " + card.getFirstName() + " " + card.getLastName());
    }

}
