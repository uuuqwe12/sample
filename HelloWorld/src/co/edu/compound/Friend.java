package co.edu.compound;

public class Friend {

	private String name;
	private String tel;
	private String email;
	private String birthday;
	private double height;
	private double weight;

	public Friend() {

	}

	public void showInfo() {
		System.out.println("이름: " + name + ", 연락처: " + tel + "이메일: " + email);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setHeight(double height) {
		if (height < 0) {
			System.out.println("잘못된 값이 입력됐습니다.");
			this.height = 20.3;
		} else {
			this.height = height;
		}
	}

	public void setWeight(double weight) {
		if (weight>0) {
			this.weight = weight;
		} else {
			weight = 185.9;
		}
	}

	public double getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

	public String getBirthday() {
		return birthday;
	}

	public double getWeight() {
		return weight;
	}
}
