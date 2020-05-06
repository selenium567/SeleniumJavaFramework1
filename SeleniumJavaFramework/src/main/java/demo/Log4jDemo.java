package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	public static void main(String[] args) {
		//create a instance of class logger file
		Logger logger=LogManager.getLogger(Log4jDemo.class);

		System.out.println("\n Hello World.....!  \n");
		logger.trace("This is trace message");
		logger.info("This is information message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.fatal("This is fatal message");
		logger.debug("This is debug message");

		System.out.println("\n Completed");

	}

}
