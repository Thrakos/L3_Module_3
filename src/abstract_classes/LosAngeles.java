package abstract_classes;

public class LosAngeles extends City {
	
	double taxes = 0;

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);

	}

	@Override
	double getAnnualTaxes() {
		taxes = (population * growthRate) * (growthRate/2);
		return taxes;
	}

}
