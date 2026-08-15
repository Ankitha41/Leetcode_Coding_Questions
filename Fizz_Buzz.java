class Solution {
    public List<String> fizzBuzz(int n) {

        // Create an empty List of Strings to store the FizzBuzz results
        List<String> answer = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
            answer.add("FizzBuzz");        
        }
        else if(i % 3 == 0) {
            answer.add("Fizz"); 
        }
        else if(i % 5 == 0) {
           answer.add("Buzz"); 
        }
        else {
            // Convert the integer i into a String and add it to the answer list
            answer.add(String.valueOf(i)); 
        }
        }

        return answer;
        
    }
}
