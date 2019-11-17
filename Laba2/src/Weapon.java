/**
 * Оружие
 * 
 * @author Михаил
 *
 */
public class Weapon {

	/**
	 * Скорострелность
	 */
	int shots_per_minute;

	/**
	 * максимальная вмстительность магазина
	 */
	int max_ammo_count;
	/**
	 * кол-во патронов в магазине
	 */
	int ammo_count;

	/**
	 * Тип боеприпасов
	 */
	String ammo_type;

	/**
	 * загрязнение оружия
	 */
	int dirt;
	/**
	 * максимальное загрязнение оружия
	 */
	int max_dirt;

	/**
	 * Выстрел
	 */
	public void shot() {
		if (this.can_shot()) {
			System.out.println("pew");
			this.ammo_count--;
			this.dirt++;
		} else {
			System.out.println("Click");
		}

	}

	/**
	 * Можем ли стрелять(хватает ли патронов)
	 * 
	 * @return
	 */
	public boolean can_shot() {
		return this.ammo_count > 0;
	}

	/**
	 * Сломано ли оружие из-за загрязнения
	 * 
	 * @return
	 */
	public boolean is_broken() {
		return this.dirt >= this.max_dirt;
	}

	public void clean_gun() {
		this.dirt = 0;
	}

	/**
	 * перезарядка
	 */
	public final void reload(String ammo_type) {
		if (ammo_type == this.ammo_type) {
			this.ammo_count = this.max_ammo_count;
		} else {
			System.out.println("Не правильные патроны");
		}
	}
}
