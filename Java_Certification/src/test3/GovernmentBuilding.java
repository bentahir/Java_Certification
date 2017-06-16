package test3;

public class GovernmentBuilding extends Building {
	private String name;
	
	public GovernmentBuilding(int G_age, int G_people_nbr, String G_name){
		//super(G_age, G_people_nbr);
		super (G_age, G_people_nbr);
		this.name = G_name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name ;
	}
	
	public void displayInfo(){
		System.out.println("Gov building age "+getAge()+ " years, Gov building people nbr  "+getPeople_nbr()+ " men & women, Gov building name "+ getName());
	}
	
}