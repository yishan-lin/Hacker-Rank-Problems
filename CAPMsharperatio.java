import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.*;

public class test {
	
	private static DecimalFormat df = new DecimalFormat("###.##");
	private static DecimalFormat dff = new DecimalFormat("###.###");
	
	private static double riskfree = 0.0082;
	private static double marketret = 0.07;
	
	static double CAPM(double beta) {

		double expret = riskfree + beta*(marketret - riskfree);
		return expret;
	}
	
	static void dashboard(double expreturnA, double expreturnB, double stdevA, double stdevB, double corrcoeff) {
		
		double bestsharperatio = -1;
		double bestweightA = -1;
		double bestweightB = -1;
		double bestPFrisk = -1;
		double bestPFret = -1;
				
		for (double x = 0.0; x <= 1.0; x += 0.1) {
			
			System.out.println("**********************************");
			
			double reverseweight = 1.0-x;
						
			System.out.println(df.format(x) + " VS " + df.format(reverseweight));
			
			double weightedAret = x * expreturnA;			
			double weightedBret = reverseweight* expreturnB;
			
			System.out.println("Return of CAKE: " + df.format((weightedAret) * 100) + "%");
			System.out.println("Return of TSLA: " + df.format((weightedBret) * 100) + "%");
		
			System.out.println();
			
			double variance = ((Math.pow(x, 2)*Math.pow(stdevA, 2))+(Math.pow(reverseweight, 2)*(Math.pow(stdevB, 2)) + (2*x*reverseweight*stdevA*stdevB*corrcoeff)));
			double sharperatio = ((weightedAret + weightedBret) - riskfree)/Math.sqrt(variance);
			
			System.err.println("Total PF return = " + df.format((weightedAret * 100) + (weightedBret * 100)) + "%");
			System.err.println("Total risk = " + dff.format(Math.sqrt(variance)));
			System.err.println("Sharpe Ratio = " + df.format(sharperatio));
						
			if (sharperatio > bestsharperatio) {
			
				bestsharperatio = sharperatio;
				bestweightA = x;
				bestweightB = reverseweight;
				bestPFrisk = Math.sqrt(variance);
				bestPFret = ((weightedAret * 100) + (weightedBret * 100));
				
			}

			System.out.println();
			
		}
		
		System.out.println("---------------------------");
		System.out.println("We recommend a PF of " + df.format(bestweightA) + " & " + df.format(bestweightB));
		System.out.println("Expected PF return: " + dff.format(bestPFret) + "%");
		System.out.println("Expected PF risk: " + dff.format(bestPFrisk*100) + "%");
		System.out.println("Expected Sharpe Ratio = " + dff.format(bestsharperatio));
		
		//System.out.println("Best return: " + df.format(bestreturn) + " CAKE: " + df.format(bestAweight) + " CMG: " + df.format(bestBweight));
		
		
	}
	

	public static void main(String[] args) {
		
		//ret of CAKE, ret of TSLA, STDEv of CAKE, STDev of TSLA, CORR of both
		dashboard(CAPM(0.82), CAPM(1.63), 0.05, 0.1021, 0.2227);
		
	}

}
