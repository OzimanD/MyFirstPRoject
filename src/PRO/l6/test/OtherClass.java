package PRO.l6.test;

public class OtherClass {
	// Приймаємо масив рядків
	public static String work(String... ls) {
		StringBuilder sb = new StringBuilder();
		for (String s : ls)
			sb.append(s);
		
		return sb.toString();
	}
	
	@Test
	public static boolean testMethod() {
		// Передаємо рядки та порівнюємо з 122333
		boolean res = work("1", "22", "3333").equals("122333");
		System.out.println("OtherClass: " + res);
		return res;
	}
}