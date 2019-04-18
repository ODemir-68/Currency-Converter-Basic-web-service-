/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import java.util.HashMap;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Osman
 */
@WebService(serviceName = "Converter")
public class Converter {
        private HashMap<String, Currency> currencies = new HashMap<String, Currency>();
        
        public Converter(){
		currencies.put("SGD", new Currency("SGD", "Singapore", 1));
		currencies.put("USD", new Currency("USD", "United States", 1.28));
		currencies.put("MYR", new Currency("MYR", "Malaysia", 0.42));
	}


       public double getConversionRate(Currency from, Currency to){
        return from.getConversionRateWithSGD() * to.getConversionRateWithSGD();
	}
                
    @WebMethod(operationName = "Convert")
    public double Convert(@WebParam(name = "Country1") String Country1, @WebParam(name = "ConvertM") Double ConvertM, @WebParam(name = "Country2") String Country2) {
        
        return ConvertM;
    }
}
