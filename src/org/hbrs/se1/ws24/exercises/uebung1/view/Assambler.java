package org.hbrs.se1.ws24.exercises.uebung1.view;

import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;

public class Assambler {
    public static void main(String[] args) {
        GermanTranslator = new GermanTranslator();

        Client client = new Client(translator);
        client.display(2);

        client.setTranslator( new Englishtranslator());
        client.dislay(3);
    }
}
