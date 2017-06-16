package test6;
public class Lab01Task1
{
    public int minPos(GameRecord[] records, int size) {
        
    	int lowestLevel = records[0].getLevel();
    	int lowestScore = records[0].getScore();
    	int index = 0; 
    	for (int i = 1; i < size; i++){
    		
    		if (records[i].getLevel() < lowestLevel ){
    			
    				lowestLevel = records[i].getLevel();
    				lowestScore = records[i].getScore();
    				index = i;
    		}
    		else
    			if (records[i].getLevel() == lowestLevel )
    				if (records[i].getScore() <= lowestScore){
    					lowestLevel = records[i].getLevel();
        				lowestScore = records[i].getScore();
        				index = i;
    				}
    	}
    	return index; // this line should be removed or modified after the implementation of this method is completed.
    }
    
    public static void testCase1() {
    
        GameRecord[] records = new GameRecord[5];
        records[0] = new GameRecord("fff", 2, 12);
        records[1] = new GameRecord("ggg", 0, 42);
        records[2] = new GameRecord("bbb", 0, 40);
        records[3] = new GameRecord("aaa", 0, 51);
        records[4] = new GameRecord("AAA", 1, 15);
        

        Lab01Task1 lab01Task1 = new Lab01Task1();
        int actualOutput = lab01Task1.minPos(records, 5); // only searching the first 3 elements
        
        System.out.println("Expected output: 2");
        System.out.println("Actual output: " + actualOutput);
    }
    
    public static void main(String [] args){

    	int temp = 0;

    	for (int i = 0; i < 3; i++) {
    	    
    	    temp += 1;

    	    if (i > 0) { break; }
    	    
    	    for (int j = 0; j < 3; j++) {
    	        temp += 2;
    	        if (j > 0) { continue; }
    	        temp += 3;
    	    }

    	    temp += 4;
    	}

    	System.out.println(temp);
    // You can add more test cases to test your program prior to submitting your code to the online grader.
}
}
