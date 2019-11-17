
/**
 * Пулемет
 * 
 * @author Михаил
 *
 */
public class MachineGun extends Weapon {
	/**
	 * max перегрева
	 */
	int max_overheat;

	/**
	 * текущий перегрев
	 */
	int overheat;

	public MachineGun(int max_ammo, int max_dirt, String ammo_type, int max_overheat) {
		super(max_ammo, max_dirt, ammo_type);
		this.max_overheat = max_overheat;
	}

	public void cold() {
		this.overheat = 0;
	}

	/**
	 * Выстрел
	 */
	public void shot() {

		while (this.can_shot()) {
			System.out.print("pew");
			this.ammo_count--;
			this.overheat++;
			this.dirt++;
		}
		
		System.out.println();
		if (this.overheat == this.max_overheat) {
			System.out.println("Pshhh");
		} else {
			System.out.println("Click");
		}

	}

	public boolean can_shot() {
		return super.can_shot() && this.overheat < this.max_overheat;
	}

}
