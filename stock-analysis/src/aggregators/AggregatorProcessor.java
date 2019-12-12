package aggregators;

import java.io.IOException;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor <T extends Aggregator> { //The T is the generic allowing Aggregator or its sub/child classes to be passed as an arg. 
	T aggregator;
	String file;
	
	public AggregatorProcessor(T aggregator, String file) {
		super();
		this.aggregator = aggregator;
		this.file = file;
	}
	
	public double runAggregator(int col) throws IOException {
		StockFileReader sfr = new StockFileReader(file);
		List<String> lines = sfr.readFileData();
		
		col--; //This is so when column 1 is selected its -1 because the index position is 0
		
		for(String line : lines) { //Iteration over the collection called lines. Using the variable line. 
			String [] numbers = line.split(",");	//splits the line by ,'s with each split added to the []Array
			double value = Double.parseDouble(numbers[col]); //Because its an Array of Strings its cast or parsed to a double. 
			aggregator.add(value); //The parent Aggregator class has a ArrayList of doubles in its constructor which all children classes inherit.
		}
		double number = aggregator.calculate(); //Calculate is a abstract method of the parent class Aggregator, so each agg implements it to suit its type.
		return number;
	}
	
	


	
	
}
	
	
		
		
	

