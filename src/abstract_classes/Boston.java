package abstract_classes;

public class Boston extends City {
	
	double taxes = 0;

	public Boston(int population, double growthRate) {
		super(population, growthRate);

	}

	@Override
	double getAnnualTaxes() {
		taxes = (population * growthRate) + (0.5 * population);
		return taxes;
	}

}
