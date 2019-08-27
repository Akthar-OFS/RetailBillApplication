package com.abcCompany.RetailBill.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * The Class RetailBillExceptionController.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
@ControllerAdvice
public class RetailBillExceptionController extends ResponseEntityExceptionHandler {

    /**
     * Method to handle exception
     *
     * @param exception
     *            the Exception object
     * @return response entity
     * 				the ResponseEntity<Object>
     */
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Object> exception(Exception exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, 
    		HttpHeaders headers, HttpStatus status, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
