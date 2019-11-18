/**
 * ��������
 * 
 * @author ������
 *
 */
public class Gun extends Weapon {

	public Gun(int max_ammo, int max_dirt, String ammo_type) {
		super(max_ammo, max_dirt, ammo_type);
		this.has_laser = false;
		this.has_silencer = false;
	}

	/**
	 * ���� ���������
	 */
	boolean has_silencer;

	/**
	 * ���� �� �������� �������������
	 */
	public boolean has_laser;

	public void add_silencer() {
		this.has_silencer = true;
	}

	public void remove_silencer() {
		this.has_silencer = false;
	}

	/**
	 * �������
	 */
	public void shot() {
		if (this.dirt == this.max_dirt) {
			System.out.println("������ �������, ������ ��������");
		} else {
			if (this.can_shot()) {
				if (this.has_silencer) {
					System.out.println("���");
				} else {
					System.out.println("���");
				}

				this.ammo_count--;
				this.dirt++;
			} else {
				System.out.println("��������� �������");
			}
		}
	}
}
