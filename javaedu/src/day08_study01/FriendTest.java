package day08_study01;

class Friend extends Person{
	private String phoneNum;
	private String email;
	
	Friend(String name, String phoneNum, String email){
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo() {
		return super.getInfo() + "\t" + phoneNum + "\t" + email;
	}
}

public class FriendTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend[] friends = new Friend[5];
		friends[0] = new Friend("김씨", "123-456", "kim@email");
		friends[1] = new Friend("이씨", "213-546", "lee@email");
		friends[2] = new Friend("박씨", "321-654", "park@email");
		friends[3] = new Friend("최씨", "222-555", "choi@email");
		friends[4] = new Friend("구씨", "777-777", "ku@email");
		
		System.out.println("이름\t 전화번호\t 메일주소");
		System.out.println("****************************");
		for(int i=0; i<friends.length;i++)
			System.out.printf("%s\n", friends[i].getInfo());
	}

}
