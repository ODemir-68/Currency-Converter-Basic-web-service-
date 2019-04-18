package webservices;

public class Currency {
	private String currencyCode;
	private String country;
	private double conversionRateWithSGD;

	public Currency() {}

	public Currency(String currencyCode, String country, double conversionRateWithSGD) {
		setCurrencyCode(currencyCode);
		setCountry(country);
		setConversionRateWithSGD(conversionRateWithSGD);
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setConversionRateWithSGD(double conversionRateWithSGD) {
		this.conversionRateWithSGD = conversionRateWithSGD;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public String getCountry() {
		return country;
	}

	public double getConversionRateWithSGD() {
		return conversionRateWithSGD;
	}
}