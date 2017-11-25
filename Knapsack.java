import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.Stack;

public class Knapsack {

	public TreeSet<Integer> knapsack(Set<Integer> set, int t) {
		TreeSet<Integer> result_set = new TreeSet<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		for(int s: set) {
			if(sum + s > t){
				sum -= stack.pop();
			}
			if(sum + s <= t) {
				sum+=s;
				stack.push(s);
			}
			if(sum == t) {
				result_set.addAll(stack);
				return result_set;
			}
		}
	
		return null;
	}

	public static void main(String[] args) {
		TreeSet<Integer> testSet = new TreeSet<Integer>(Arrays.asList( 14, 6, 7, 8, 10, 11,24));
		System.out.println(testSet);
		Knapsack kp = new Knapsack();
		System.out.println(kp.knapsack(testSet, 23));
	}

}
