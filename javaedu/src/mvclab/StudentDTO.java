package mvclab;

public class StudentDTO {

	private String name;
	private int score;
	
	public StudentDTO() {
		
	}
	public StudentDTO(String name){
		this(name, 0);
	}
	public StudentDTO(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return String.format("이름 : %s 점수 : %d", name, score);
	}
	
}
