public class Main {
	public static void main(String[] args) {
		Gun colt = new Gun(7, 100, ".45");
		AutomaticRifle AK = new AutomaticRifle(30, 100000, "7.62x39");
		MachineGun MG42 = new MachineGun(200, 10000, "7.92", 250);

		colt.shot();
		colt.reload(".45");
		for (int i = 0; i < 10; i++) {
			colt.shot();
		}
		colt.reload("7.62x39");
		colt.add_silencer();
		colt.shot();
		colt.remove_silencer();
		for (int i = 0; i < 15; ++i) {
			for (int j = 0; j < 7; j++) {
				colt.shot();
			}

			colt.reload(".45");
		}

		AK.reload("7.62x39");
		AK.shot();
		AK.changeShotType(ShotType.AUTO);
		AK.shot();

		MG42.reload("7.92");
		MG42.shot();
		MG42.reload("7.92");
		MG42.shot();
		MG42.cold();
		MG42.shot();

		System.out.println("End");
	}
}
