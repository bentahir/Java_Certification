package test6;

public class GameRecord {
	String mName;
	int mLevel;
	int mScore;
	
	public GameRecord(String name, int level, int score){
		mName =name;
		mLevel  = level;
		mScore = score;
	}
	public String getName(){
		return (mName);
	}
	
	public int getLevel(){
		return (mLevel);
	}
	
	public int getScore(){
		return(mScore);
	}
	
	public void setName(String name){
		mName = name;
	}
	
	public void setLevel(int level){
		mLevel  = level;
	}
	
	public void setScore(int score){
		mScore = score;
	}

}
