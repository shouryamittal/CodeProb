/**There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].
Return the minimum cost to fly every person to a city such that exactly N people arrive in each city. */
//solution: this is greedy algorithm.
import java.util.Arrays;
public class TwoCityScheduling{

    public int twoCitySchedCost(int[][] costs) { 
        int count = costs.length/2;
        int cost = 0;
        int diff [] = new int[costs.length];
        for(int i = 0; i < costs.length; i++) {
            cost+=costs[i][0];
            diff[i] = costs[i][0]-costs[i][1];
        }
        
        Arrays.sort(diff);
        for(int j = diff.length - 1 ; j >=count; j--) {
            cost-=diff[j];
        }
        return cost;
    }
    public static void main(String[] args) {
        TwoCityScheduling t = new TwoCityScheduling();
        int costs[][] = {{20,10},{30,100},{90,50},{30,20}};
        int minCost = t.twoCitySchedCost(costs);
        System.out.println(minCost);
    }
}