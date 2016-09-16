package lab;

import java.util.logging.Logger;

import javax.inject.Inject;

public class LabUtils {
	
	@Inject
	static Logger logger;

	
	public static String getText(){
		logger.info("This is a text");
		return "This is a text";
	}
	
}
