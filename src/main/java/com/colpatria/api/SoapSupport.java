package com.colpatria.api;

import javax.xml.bind.JAXBElement;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.colpatria.api.wsdl.DetailHeaderRqType;
import com.colpatria.api.wsdl.EsbHeaderRqType;
import com.colpatria.api.wsdl.ListOfListOfValuesType;
import com.colpatria.api.wsdl.ListOfValuesQueryRqType;
import com.colpatria.api.wsdl.ListOfValuesQueryRsType;
import com.colpatria.api.wsdl.ObjectFactory;
import com.colpatria.api.wsdl.QuerylistofvaluesType;
import com.colpatria.api.wsdl.UsernameTokenType;

public class SoapSupport extends WebServiceGatewaySupport {

	public String getBreakEvenPointResult(double fixedCost, double variableCost, double returnsPerUnit) {
		/*
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
		*/
		return null;
	}
	
	public ListOfListOfValuesType customerListOfValuesQuery(String transactionId, String serviceCode, String operationCode, String requestUser, String requestSystem, String channel, String host, String executionMode, String operationCountry, String operationBank, String transactionDate, String transactionTime, String officeCode, String numberPages, String totalPages, String institutionCode, String username, String password, String querylistofvaluesType) {
		
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.colpatria.api.wsdl");
		
		setDefaultUri("http://127.0.0.1:8181/services/Customer/CustomerListOfValuesQuery");
		setMarshaller(marshaller);
		setUnmarshaller(marshaller);
				
		DetailHeaderRqType dhrt = new DetailHeaderRqType();
		dhrt.setTransactionId(transactionId);
		dhrt.setServiceCode(serviceCode);
		dhrt.setOperationCode(operationCode);
		dhrt.setRequestUser(requestUser);
		dhrt.setRequestSystem(requestSystem);
		dhrt.setChannel(channel);
		dhrt.setHost(host);
		dhrt.setExecutionMode(executionMode);
		dhrt.setOperationCountry(operationCountry);
		dhrt.setOperationBank(operationBank);
		dhrt.setTransactionDate(transactionDate);
		dhrt.setTransactionTime(transactionTime);
		dhrt.setOfficeCode(officeCode);
		dhrt.setNumberPages(numberPages);
		dhrt.setTotalPages(totalPages);
		dhrt.setInstitutionCode(institutionCode);
		
		UsernameTokenType untt = new UsernameTokenType();
		untt.setUsername(username);
		untt.setPassword(password);
		dhrt.setUsernameToken(untt);
		
		QuerylistofvaluesType qlvt = new QuerylistofvaluesType();
		qlvt.setType(querylistofvaluesType);
		
		EsbHeaderRqType rh = new EsbHeaderRqType();
		rh.setEsbHeader(dhrt);
		
		ListOfValuesQueryRqType lvqrt = new ListOfValuesQueryRqType();
		lvqrt.setRequestHeader(rh);
		lvqrt.setQuerylistofvalues(qlvt);
		
		ObjectFactory of = new ObjectFactory();
		
		JAXBElement<ListOfValuesQueryRsType> response = (JAXBElement<ListOfValuesQueryRsType>) getWebServiceTemplate()
				.marshalSendAndReceive("http://127.0.0.1:8181/services/Customer/CustomerListOfValuesQuery",
						of.createListOfValuesQueryRq(lvqrt),
						new SoapActionCallback("http://127.0.0.1:8181/services/Customer/CustomerListOfValuesQuery"));
		
		return response.getValue().getListOfListOfValues();
	}
}
























