class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = candies[0];
        List<Boolean> result = new ArrayList<>();

        for(int i=0; i<candies.length; i++) {
            if(candies[i] > greatest) {
                greatest = candies[i];
            }
        }

        for(int i=0; i<candies.length; i++) {

            if(greatest<=candies[i]+extraCandies) {
                result.add(true);
            }

            else {
                result.add(false);
            }
        }
        return result;
    }
}
