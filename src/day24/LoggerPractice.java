package day24;

import com.sun.tools.javac.Main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerPractice {

    private static final Logger myLogger = Logger.getLogger("day24");

    public static void main(String[] args) {

//        Logger.getGlobal().setLevel(Level.ALL);
//
//        Logger.getGlobal().severe("This is severe kind of log");
//        Logger.getGlobal().warning("This is warning kind of log");
//        Logger.getGlobal().info("This is info kind of log");
//        Logger.getGlobal().config("This is config kind of log");


        myLogger.setLevel(Level.OFF);

        myLogger.severe("This is severe kind of log");
        myLogger.warning("This is warning kind of log");
        myLogger.info("This is info kind of log");
        myLogger.config("This is config kind of log");

    }
}
