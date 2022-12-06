package com.xworkz.handle.boot;

import java.rmi.activation.ActivationException;

import javax.security.auth.login.AccountException;

import com.xworkz.handle.ExceptionEvents;

public class ExceptionEventRunner {

	public static void main(String[] args) throws AccountException, ActivationException {

		
		ExceptionEvents event=new ExceptionEvents();
		event.AccountException();
		event.AccountNotFoundException();
		event.AclNotFoundException();
		event.ActivationException();
	}

}

