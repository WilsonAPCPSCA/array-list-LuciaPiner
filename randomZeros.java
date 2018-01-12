import java.util.ArrayList;
import java.util.Random;
public class randomZeros {
public static void main(String[] args){
	ArrayList<Integer> numsRandom = new ArrayList<Integer>(10);
	Random rand = new Random();
	for(int i = 0; i<10; i++){
		numsRandom.add(rand.nextInt(11));
	}
	System.out.println("Original arraylist: "+numsRandom);
	for(int i = 0; i<numsRandom.size(); i++){
		numsRandom.set(i,0);
	}
	System.out.println("Modified arraylist: "+numsRandom);
}
}
