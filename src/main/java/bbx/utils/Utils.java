package bbx.utils;

public class Utils {

	public static void p(Object o) {
		System.out.println(o);
	}
	
	public static void ps(Object... os) {
		for(Object o : os) {
			System.out.println(o);
		}
	}
	
	public static boolean isStringEmptyOrNull(String str) {
		return str==null ? true : (str.isBlank() || str.isEmpty());
	}
}
