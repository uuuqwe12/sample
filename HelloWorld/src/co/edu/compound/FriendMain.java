package co.edu.compound;

public class FriendMain {

	public static void main(String[] args) {
		
		Friend f1 = new Friend();
//		f1.name = "버거킹";
//		f1.tel = "053-112";
//		f1.birthday = "7월 7일";
//		f1.email = "BgKing@naver.com";
//		f1.height = 20.3;
//		System.out.println("키는: "+f1.getHeight());
		f1.setName("홍콩반점");
		f1.setTel("010-111 ");
//		f1.weight = 50.1;
		f1.setEmail("alsdmlkkml@naver.com");
		f1.setHeight(550);
		System.out.println(f1.getHeight());
		f1.showInfo();
		
	}

}
