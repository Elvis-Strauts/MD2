
package imperative;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;


public class md_2 {
	
	
	
	public enum STATE {
		PERFECTNUM, DEFICIENTNUM, ABUNDANTNUM;
	}

	
	
		public static STATE process(int n) {
			Integer sum = Number(n).stream().mapToInt(Integer::intValue).filter((num) -> num != n).sum();
			if (sum == n)
				return STATE.PERFECTNUM;
			else {
				if (sum < n) {
					return STATE.DEFICIENTNUM;
				} else {
					return STATE.ABUNDANTNUM;
				}
		}
	}
				

		public static Set<Integer> Number(int n) {
			System.out.println("Elvis Strauts 3.g 171RDB062");
			System.out.print("Enter your number here: ");
			Set<Integer> sNumber =  new HashSet<Integer>();
				int nsqr = (int) Math.round(Math.sqrt(n)) + 1;
				System.out.println(n);
				IntStream.range(1, nsqr).forEach( (num) ->{
					System.out.println(n);
					if (n%num == 0){
						sNumber.add(num);
						sNumber.add(n/num);
					}
				});
			return sNumber;
		}
        
    }     
