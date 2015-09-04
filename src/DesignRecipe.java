
public class DesignRecipe {
	public static String[] intersperse(String s, String[] arr) {
		if (s == null || arr == null) {
			return null;
		} else if (arr.length < 2) {
			return arr;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		System.out.println(intersperse(null,null));
		//System.out.println(intersperse("hello", {"1"}));
	}

}
