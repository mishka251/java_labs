
/**
 * enum для типа стрельбы
 * 
 * @author Михаил
 *
 */
enum ShotType {
	ONE, THREE, AUTO
};

/**
 * Автомат
 * 
 * @author Михаил
 *
 */
public class AutomaticRifle extends Weapon {
	/**
	 * тип стрельбы этого автомата
	 */
	ShotType shotType;

	/**
	 * есть ли прицел
	 */
	public boolean has_scope;

	public AutomaticRifle(int max_ammo, int max_dirt, String ammo_type) {
		super(max_ammo, max_dirt, ammo_type);
		this.shotType = ShotType.ONE;
		this.has_scope = false;
	}

	public void changeShotType(ShotType type) {
		this.shotType = type;
	}

	/**
	 * Выстрел
	 */
	public void shot() {
		if (this.dirt == this.max_dirt) {
			System.out.println("Оружие грязное, нельзя стрелять");
		} else {

			switch (this.shotType) {
			case ONE:
				if (this.ammo_count > 0) {
					System.out.println("пиу");
					this.ammo_count--;
				} else {
					System.out.println("Кончились патроны");
				}
				break;

			case THREE:
				if (this.ammo_count > 3) {
					for (int i = 0; i < 3; i++) {
						System.out.print("пиу");
						this.ammo_count--;
					}
					System.out.println();

				} else {
					for (int i = 0; i < this.ammo_count; i++) {
						System.out.print("пиу");
						this.ammo_count--;
					}
					System.out.println("Кончились патроны");
				}
				break;

			case AUTO:
				while (this.ammo_count > 0) {
					System.out.println("пиу");
					this.ammo_count--;
				}
				System.out.println("Кончились патроны");

				break;
			}
		}
	}

}
