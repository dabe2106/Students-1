import java.util.Random;
import java.util.Scanner;

public class SumAveMax2 {
		 private int sum, max, size, array[];
		 private float average;
		 
		public SumAveMax2(){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Enter Array Size:");
		size = input.nextInt();
		array = new int[size];
	    System.out.print("Random "+ size + " numbers: "); 
		for (int i = 0; i <size; i++){
	     array[i] = rand.nextInt(1000);
		System.out.print(array[i] + " ");
		sum += array[i];
		if (array[i] > max)
			max = array[i];
	}
		System.out.println();
		}
		public void getSum(){
			System.out.println("SUM = " + sum);
		}
		public void getMax(){
			System.out.println("MAX = " + max);
		}
		public void getAverage() {
			average = (float) sum/size;
			System.out.println("AVERAGE = " + average);
		}
		  public static void main(String[] args) {
			  SumAveMax2 demo = new SumAveMax2();
			  demo.getSum();
			  demo.getMax();
			  demo.getAverage();
		  }
		  }