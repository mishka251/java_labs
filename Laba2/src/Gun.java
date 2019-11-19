/**
 * пистолет
 * 
 * @author Ìèõàèë
 *
 */
public class Gun extends Weapon {

	public Gun(int max_ammo, int max_dirt, String ammo_type) {
		super(max_ammo, max_dirt, ammo_type);
		this.has_laser = false;
		this.has_silencer = false;
	}

	/**
	 * есть ли глушитель
	 */
	boolean has_silencer;

	/**
	 * есть ли лцу
	 */
	public boolean has_laser;

	public void add_silencer() {
		this.has_silencer = true;
	}

	public void remove_silencer() {
		this.has_silencer = false;
	}

	/**
	 * выстрел
	 */
	public void shot() {
		if (this.dirt == this.max_dirt) {
			System.out.println("оружие грязное");
		} else {
			if (this.can_shot()) {
				if (this.has_silencer) {
					System.out.println("пик");
				} else {
					System.out.println("пиу");
				}

				this.ammo_count--;
				this.dirt++;
			} else {
				System.out.println("нет патронов");
			}
		}
	}
}
