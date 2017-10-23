package abstract_classes;

public class SanDiego extends City {
	
	double taxes = 0;

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);

	}

	@Override
	double getAnnualTaxes() {
		taxes = (population * growthRate) + 1000000;
		return taxes;
	}

}
