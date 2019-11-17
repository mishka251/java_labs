/**
 * Пистолет
 * @author Михаил
 *
 */
public class Gun extends Weapon {
	
	public Gun(int max_ammo, int max_dirt, String ammo_type) {
		super(max_ammo, max_dirt, ammo_type);
	}

/**
 * Есть глушитель	
 */
	boolean has_silencer;
	
	public void add_silencer() {
		this.has_silencer=true;
	}
	
	public void remove_silencer() {
		this.has_silencer=false;
	}
	
	/**
	 * Выстрел
	 */
	public void shot() {
		if (this.can_shot()) {
			if(this.has_silencer) {
				System.out.println("pick");
			}else {
				System.out.println("pew");
			}
			
			this.ammo_count--;
			this.dirt++;
		} else {
			System.out.println("Click");
		}

	}
}
