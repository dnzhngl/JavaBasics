package com.company;

public class Main {

    public static void main(String[] args) {
	    EmailLogger emailLogger = new EmailLogger();
	   // emailLogger.log("E-mail logger.");

	    BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()}; //--> All of the loggers have been inherits from BaseLogger.
        /*for(BaseLogger logger : loggers){
            logger.log("Log message");
        }*/

        //CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
