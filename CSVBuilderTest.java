
public class CSVBuilderTest {
	public static void main(String[] args) {
		
		
		// Unsafe issues
		// want to output test,2,3.4
		CSVBuilder csvBuilder = new CSVBuilder();
		csvBuilder.append(null).append(2).append(3.4);
		System.out.println(csvBuilder);
		// everything is ok
		csvBuilder.clear();
		
		// want to output V1,V2,V3, but programmer makes mistake and uses char instead of String
		for (int i = 1; i <= 3; i++) {
			// this is not reported by compiler
			csvBuilder.append('V' + i);
		}
		System.out.println(csvBuilder);

		csvBuilder.clear();
		// want to output values as int, but one value is double - not reported by compiler
		double val = 3.0;
		csvBuilder.append(1).append((int) 2.3).append(val);
		System.out.println(csvBuilder);
	}
}