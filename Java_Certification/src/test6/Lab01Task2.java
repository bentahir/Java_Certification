package test6;



public class Lab01Task2
{
    public GameRecord[] updateGameRecords(GameRecord[] oldRecords, GameRecord newRecord) {
        
    	
    	/*  If there is an existing record in the old records having the same name and level 
    	 *  as the new record. If such a record exists and the score of the new record is 
    	 *  higher, replace the existing record with the new record in the old records array,
    	 *  sort the array and return it. If the score of the new record is less than or 
    	 *  equal to the score of the existing record, just return the old records array.*/
    	int nbRecSameLevel = 0;
        for (int i = 0; i< oldRecords.length; i++){
        	if (oldRecords[i].getLevel() == newRecord.getLevel())
        		nbRecSameLevel++;
        	if(oldRecords[i].getName().equals(newRecord.getName()) && 
        			(oldRecords[i].getLevel() == newRecord.getLevel()))
        		if (oldRecords[i].getScore() < newRecord.getScore()){
        			oldRecords[i].setScore(newRecord.getScore());
        			Util.sort(oldRecords);
        			return oldRecords;
        		}
        		else
        			return oldRecords;
        }
        /*
        If there isn't any existing record and the number of old records having the same 
        level as the new record is less than 10, create a new game record array of size 1 
        greater than the old records array. Copy all the entries from the old array to 
        the new array and also insert the new record into the new array. After that, 
        sort the new array and return it.*/
        
        if (nbRecSameLevel < 10){
        	GameRecord [] newRecords  = new GameRecord[oldRecords.length+1];
        	for (int i = 0; i< oldRecords.length; i++){
        		newRecords[i] = oldRecords[i];
        	}
        	newRecords[oldRecords.length]=newRecord;
        	Util.sort(newRecords);
        	return newRecords;
        }
        else{
        	for (int i = 0; i< oldRecords.length; i++){
        		if(oldRecords[i].getLevel() == newRecord.getLevel())
        			if (oldRecords[i].getScore() < newRecord.getScore()){
        				oldRecords[i].setName(newRecord.getName());
        				oldRecords[i].setLevel(newRecord.getLevel());
        				oldRecords[i].setScore(newRecord.getScore());
        				Util.sort(newRecords);
        				return oldRecords;
        			}
        	}
        }
        /*
        If there isn't any existing record and the number of old records having the same 
        level as the new record is equal to 10, find from the old record array a game 
        record having a lower score than the new record and having the same level as 
        the new record. If such a record can be found, replace it with the new record, 
        sort the array and return it. Otherwise, just return the old records array.
    	*/
    	return oldRecords; // this line should be removed or modified when the implementation of this method is completed.
    }
    
    // test case 1: updating an existing record, given that the new record has a better score.
    public static void testCase1() {
    
        GameRecord[] oldRecords = new GameRecord[2];
        oldRecords[0] = new GameRecord("A", 2, 10);
        oldRecords[1] = new GameRecord("B", 2, 8);
        
        GameRecord newRecord = new GameRecord("B", 2, 10);
        
        Lab01Task2 lab01Task2 = new Lab01Task2();
        GameRecord[] updatedRecords = lab01Task2.updateGameRecords(oldRecords, newRecord);
        
        System.out.println("Expected output:");
        System.out.println("============================");
        System.out.println("A, 2, 10");
        System.out.println("B, 2, 10");
        System.out.println("============================\n");
        
        System.out.println("Actual output:");
        System.out.println("============================");
        printHighscoreTable(updatedRecords);
        System.out.println("============================\n");
    }
    
    // test case 2: inserting a new record given that we have less than records for the new record's level.
    public static void testCase2() {
    
        GameRecord[] oldRecords = new GameRecord[2];
        oldRecords[0] = new GameRecord("A", 2, 10);
        oldRecords[1] = new GameRecord("B", 2, 8);
        
        GameRecord newRecord = new GameRecord("C", 2, 10);
        
        Lab01Task2 lab01Task2 = new Lab01Task2();
        GameRecord[] updatedRecords = lab01Task2.updateGameRecords(oldRecords, newRecord);
        
        System.out.println("Expected output:");
        System.out.println("============================");
        System.out.println("A, 2, 10");
        System.out.println("C, 2, 10");
        System.out.println("B, 2, 8");
        System.out.println("============================\n");
        
        System.out.println("Actual output:");
        System.out.println("============================");
        printHighscoreTable(updatedRecords);
        System.out.println("============================\n");
    }

    // test case 3: replacing a lower score record of the same level, given that we already have 10 records for that level.
    public static void testCase3() {
    
        GameRecord[] oldRecords = new GameRecord[10];
        oldRecords[0] = new GameRecord("A", 2, 10);
        oldRecords[1] = new GameRecord("B", 2, 10);
        oldRecords[2] = new GameRecord("C", 2, 10);
        oldRecords[3] = new GameRecord("D", 2, 10);
        oldRecords[4] = new GameRecord("E", 2, 10);
        oldRecords[5] = new GameRecord("F", 2, 10);
        oldRecords[6] = new GameRecord("G", 2, 10);
        oldRecords[7] = new GameRecord("H", 2, 10);
        oldRecords[8] = new GameRecord("I", 2, 10);
        oldRecords[9] = new GameRecord("J", 2, 8);
        
        GameRecord newRecord = new GameRecord("K", 2, 10);
        
        Lab01Task2 lab01Task2 = new Lab01Task2();
        GameRecord[] updatedRecords = lab01Task2.updateGameRecords(oldRecords, newRecord);
        
        System.out.println("Expected output:");
        System.out.println("============================");
        System.out.println("A, 2, 10");
        System.out.println("B, 2, 10");
        System.out.println("C, 2, 10");
        System.out.println("D, 2, 10");
        System.out.println("E, 2, 10");
        System.out.println("F, 2, 10");
        System.out.println("G, 2, 10");
        System.out.println("H, 2, 10");
        System.out.println("I, 2, 10");
        System.out.println("K, 2, 10");
        System.out.println("============================\n");
        
        System.out.println("Actual output:");
        System.out.println("============================");
        printHighscoreTable(updatedRecords);
        System.out.println("============================\n");
    }
    
    // You can add more test case to test your program prior to submitting your code to the online grader.
    
    private static void printHighscoreTable(GameRecord[] records) {
        
        if (records == null) {
            return;
        }
        
        for (int i = 0; i < records.length; i++) {
            if (records[i] != null) {
                System.out.println(records[i].getName() + ", " + records[i].getLevel() + ", " + records[i].getScore());
            } else {
                System.out.println();
            }
        }
    }
}

