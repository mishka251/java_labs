/**
 * ������
 * 
 * @author ������
 *
 */
public class Weapon {

	public Weapon(int max_ammo, int max_dirt, String ammo_type) {
		this.dirt = 0;
		this.max_dirt = max_dirt;
		this.max_ammo_count = max_ammo;
		this.ammo_count = 0;
		this.ammo_type = ammo_type;
	}

	/**
	 * ������������ �������������� ��������
	 */
	int max_ammo_count;
	/**
	 * ���-�� �������� � ��������
	 */
	int ammo_count;

	/**
	 * ��� �����������
	 */
	String ammo_type;

	/**
	 * ����������� ������
	 */
	int dirt;
	/**
	 * ������������ ����������� ������
	 */
	int max_dirt;

	/**
	 * �������
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
	 * ����� �� ��������(������� �� ��������)
	 * 
	 * @return
	 */
	public boolean can_shot() {
		return this.ammo_count > 0;
	}

	/**
	 * ������� �� ������ ��-�� �����������
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
	 * �����������
	 */
	public final void reload(String ammo_type) {
		if (ammo_type == this.ammo_type) {
			this.ammo_count = this.max_ammo_count;
		} else {
			System.out.println("������������ �������");
		}
	}
}
