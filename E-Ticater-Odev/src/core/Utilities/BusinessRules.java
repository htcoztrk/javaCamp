package core.Utilities;

public class BusinessRules {

	public static boolean Run(boolean... rules) {
		for(boolean rul: rules) {
			if(!rul) {
				return false;
			}
		}
		return true;
	}
}
