package test3;

public class Building {

	private int people_nbr;
	private int age;
	private double cost;
	
	public Building(int building_age, int building_people_nbr){
		this.age = building_age;
		this.people_nbr = building_people_nbr;
		
	}

	public int getPeople_nbr() {
		return people_nbr;
	}

	public void setPeople_nbr(int people_nbr) {
		this.people_nbr = people_nbr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	public void addOneToAge(){
		this.age +=1;
	}
	
}
