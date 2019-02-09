package org.sample.project.a;

import java.util.logging.Logger;

/**
 * This class greets.
 *
 * @since 1.0.0
 */
public class Greeter {
    Logger logger = Logger.getLogger(Greeter.class.getName());

    private String name;

    public Greeter(String name) {
        this.name = name;
    }

    /**
     * This method outputs an info log saying Hello.
     */
    public void hello() {
        logger.info("====================== Hello " + name);
    }

    /**
     * This method outputs an info log saying bye.
     */
    public void bye() {
        logger.info("====================== Bye " + name);
    }
}
