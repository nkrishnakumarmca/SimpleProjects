package com.test.calc;

import java.util.concurrent.Future;

import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 * 
 * @author 559207
 *
 */
import javax.jws.WebService;
import javax.ws.rs.core.Response;

@WebService
public interface CalculatorIfc {
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	@WebMethod
	public int addition(@WebParam(name = "number1") int num1, @WebParam(name = "number2") int num2);

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	@WebMethod(operationName="")
	public int subtraction(int num1, int num2);

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	@WebMethod
	public int multiplication(int num1, int num2);

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 * @throws Exception
	 */
	@WebMethod
	public float division(int num1, int num2) throws Exception;
	
	
	   //async polling Method
    public Response<AddNumbersResponse> addNumbers(int number1, int number2);
    //async callback Method
    public Future<?> calladdNumbers(int number1, int number2, AsyncHandler<AddNumbersResponse>);
}
