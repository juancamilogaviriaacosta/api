package com.colpatria.api;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.colpatria.api.wsdl.BreakEvenPoint;
import com.colpatria.api.wsdl.BreakEvenPointResponse;

public class SoapSupport extends WebServiceGatewaySupport {

	public String getBreakEvenPointResult(double fixedCost, double variableCost, double returnsPerUnit) {
		
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.colpatria.api.wsdl");
		
		setDefaultUri("http://www.webservicex.net/bep.asmx");
		setMarshaller(marshaller);
		setUnmarshaller(marshaller);
		
		BreakEvenPoint request =  new BreakEvenPoint();
		request.setFixedCost(fixedCost);
		request.setVariableCost(variableCost);
		request.setReturnsPerUnit(returnsPerUnit);
		
		BreakEvenPointResponse response = (BreakEvenPointResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://www.webservicex.net/bep.asmx", request, new SoapActionCallback("http://www.webserviceX.NET/BreakEvenPoint"));
		return String.valueOf(response.getBreakEvenPointResult());
	}
}
