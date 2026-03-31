package pekan1_2511532025;

public class JamDriver_2511532025 {

	public static void main(String[] args) {
		Jam_2511532025 a = new Jam_2511532025(23, 59, 50);
		Jam_2511532025 b = new Jam_2511532025(0, 0, 15);
		System.out.println("a = " + b);
		System.out.println("b = " + b);
		System.out.println("a + b = " + a.plus(b));
		System.out.println("next 20s = " + a.nextNSeconds(20));
		System.out.println("durasi (a,b) = " + Jam_2511532025.durasiDetik(a, b));
		System.out.println("a.compereTo(b) = " + a.compareTo(b));
	}
}
