package client;

import java.io.IOException;

import aggregators.AggregatorProcessor;
import aggregators.MaxAggregator;

public class AggregatorApp {

	public static void main(String[] args) throws IOException {
		
		MaxAggregator agg = new MaxAggregator();
		AggregatorProcessor<MaxAggregator> aggsProcessor = new AggregatorProcessor<>(agg, "table.csv");
		double value = aggsProcessor.runAggregator(1);
		System.out.println(value);
	

	}

}

/**
You'll need to uncomment the below code. You'll notice it does not compile!

There are 2 objectives in this assignment.

1).  Make sure the code compiles correctly after you uncomment it below.
2).  Make sure it runs as explained in the assignment video!

-->> YOUR WORK SHOULD BE DONE IN THE AggregatorProcessor CLASS. 
**/
