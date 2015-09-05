import java.util.Arrays;


public class DesignRecipe {
	public static String[] intersperse(String s, String[] arr) {
		if (s == null || arr == null) {
			return null;
		} else if (arr.length < 2) {
			return arr;
		} else {
			String[] ret = new String[2 * arr.length-1];
			for (int i = 0; i < arr.length -1; i++) {
				ret[i*2] = arr[i];
				ret[2*i+1] = s;
			}
			ret[ret.length - 1] = arr[arr.length - 1];
			return ret;
		}
	}

	public static void main(String[] args) {
		String[] arr1 = new String[1];
		arr1[0] = "1";
		String[] empty = {};
		System.out.println(Arrays.toString(intersperse(null,null)));
		System.out.println(Arrays.toString(intersperse("hello",null)));
		System.out.println(Arrays.toString(intersperse(null,arr1)));
		System.out.println(Arrays.toString(intersperse("hello", arr1)));
		System.out.println(Arrays.toString(intersperse("hello",empty)));
		String[] arr2 = new String[2];
		arr2[0] = "a";
		arr2[1] = "b";
		System.out.println(Arrays.toString(intersperse("hello", arr2)));
		String[] arr3 = new String[3];
		arr3[0] = "a";
		arr3[1] = "b";
		arr3[2] = "c";
		System.out.println(Arrays.toString(intersperse("hello", arr3)));
		
		System.out.println(Arrays.toString(intersperse("hello",empty)));
	}

}
