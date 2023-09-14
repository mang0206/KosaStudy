package day12_study01;

import day08_study01.Person;
import java.util.LinkedList;

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


public class LinkedListLab1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Friend> friends = new LinkedList<>();
		friends.add(new Friend("김씨", "123-456", "kim@email"));
		friends.add(new Friend("이씨", "213-546", "lee@email"));
		friends.add(new Friend("박씨", "321-654", "park@email"));
		friends.add(new Friend("최씨", "222-555", "choi@email"));
		friends.add(new Friend("구씨", "777-777", "ku@email"));
		
		System.out.println("이름\t 전화번호\t 메일주소");
		System.out.println("****************************");
		for(int i=0; i<friends.size();i++)
			System.out.printf("%s\n", friends.get(i).getInfo());
	}

}
