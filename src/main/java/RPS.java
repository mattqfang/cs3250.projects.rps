public class RPS {
    public static String winner(String input) {
        if (input.equals("")){
            return "Error: String is Empty.";
        }
        String temp = input.replaceAll(" ", "").toUpperCase();
      
        String[] moves = temp.split(",");

        
        int countA = 0;
        int countB = 0;
        for (String check : moves){
            
            if(check.equals("RS") || check.equals("PR") || check.equals("SP")){
                
                countA++;
            }
            if(check.equals("RP") || check.equals("PS") || check.equals("SR")){
               
                countB++;
            }
    }
    if (countA == countB) {
        return "Draw";
    }
    return countA > countB? "A" : "B";
    
        
    }
} 