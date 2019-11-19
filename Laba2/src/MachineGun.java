
/**
 * пулемет
 * 
 * @author Ìèõàèë
 *
 */
public class MachineGun extends Weapon {
	/**
	 * max перегрев
	 */
	int max_overheat;

	/**
	 * текущий перегрев
	 */
	int overheat;

	public MachineGun(int max_ammo, int max_dirt, String ammo_type, int max_overheat) {
		super(max_ammo, max_dirt, ammo_type);
		this.max_overheat = max_overheat;
		this.overheat = 0;
	}

	/**
	 * охладить
	 */
	public void cold() {
		this.overheat = 0;
	}

	/**
	 * стрельба
	 */
	public void shot() {

		while (this.can_shot()) {
			System.out.print("пиу");
			this.ammo_count--;
			this.overheat++;
			this.dirt++;
		}

		System.out.println();
		if (this.dirt == this.max_dirt) {
			System.out.println("оружие грязное");
		} else if (this.overheat == this.max_overheat) {
			System.out.println("перегрелся");
		} else {
			System.out.println("нет патронов");
		}

	}

	/*
	 * можно ли стрелять
	 */
	public boolean can_shot() {
		return super.can_shot() && this.overheat < this.max_overheat;
	}

	public void clean_gun() {
		this.dirt = 0;
	}

}
