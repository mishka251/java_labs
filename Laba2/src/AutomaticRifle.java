
/**
 * enum ��� ���� ��������
 * 
 * @author ������
 *
 */
enum ShotType {
	ONE, THREE, AUTO
};

/**
 * �������
 * 
 * @author ������
 *
 */
public class AutomaticRifle extends Weapon {
	/**
	 * ��� �������� ����� ��������
	 */
	ShotType shotType;

	/**
	 * �������
	 */
	public void shot() {
		switch (this.shotType) {
		case ONE:
			if (this.ammo_count > 0) {
				System.out.println("pew");
				this.ammo_count--;
			} else {
				System.out.println("Click");
			}
			break;

		case THREE:
			if (this.ammo_count > 3) {
				for (int i = 0; i < 3; i++) {
					System.out.println("pew");
					this.ammo_count--;
				}

			} else {
				for (int i = 0; i < this.ammo_count; i++) {
					System.out.println("pew");
					this.ammo_count--;
				}
				System.out.println("Click");
			}
			break;

		case AUTO:
			while (this.ammo_count > 0) {
				System.out.println("pew");
				this.ammo_count--;
			} 
				System.out.println("Click");
			
			break;
		}

	}

}
