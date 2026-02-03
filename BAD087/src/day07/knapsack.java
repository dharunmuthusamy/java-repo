package day07;

import java.util.Arrays;
import java.util.Scanner;
public class knapsack {
	static class Product{
		int value;
		int weight;
		double ratio;
		Product(int val,int wt){
			this.value = val;
			this.weight = wt;
			this.ratio = (double)val/wt;
		}
	}
	static double fractionalKnapsack(int w,int[] value,int[] weight) {
		double profit=0.0;
		int n = weight.length;
		Product products[] = new Product[n];
		for(int i=0;i<n;i++) {
			products[i] = new Product(value[i],weight[i]);
	    }
		Arrays.sort(products,(a,b)->Double.compare(b.ratio,a.ratio));
		for(Product prod:products) {
			if(w>prod.weight) {
				profit+=prod.value;
				w-=prod.weight;
			}
			else {
				profit+=w*prod.ratio;
				break;
			}
		}
		return profit;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int value[]  = new int[n];
		for(int i=0;i<n;i++) {
			value[i] = sc.nextInt();
		     }
		int weight[]  = new int[n];
		for(int i=0;i<n;i++) {
			weight[i] = sc.nextInt();
		     }
		System.out.print(fractionalKnapsack(w,value,weight));
		}
}

