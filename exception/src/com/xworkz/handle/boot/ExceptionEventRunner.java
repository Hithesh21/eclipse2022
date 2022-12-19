package com.xworkz.handle.boot;

import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.activation.ActivationException;
import java.security.cert.CertificateException;
import java.util.TooManyListenersException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.zip.DataFormatException;

import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.IntrospectionException;
import javax.management.InvalidApplicationException;
import javax.naming.NamingException;
import javax.security.auth.login.AccountException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.datatype.DatatypeConfigurationException;

import com.xworkz.handle.ExceptionEvents;

public class ExceptionEventRunner {

	public static void main(String[] args) throws AccountException, ActivationException, AlreadyBoundException, AWTException,
	BadAttributeValueExpException, BadBinaryOpValueExpException, BadLocationException, BadStringOperationException, 
	BrokenBarrierException,
	CertificateException, CloneNotSupportedException, DataFormatException, DatatypeConfigurationException, ExecutionException,
	ExpandVetoException, FontFormatException, IllegalClassFormatException, InterruptedException, InvalidApplicationException,
	IntrospectionException, IOException, KeySelectorException, LineUnavailableException, NamingException, NotBoundException,
	PrinterException, TooManyListenersException 
	{

		
		ExceptionEvents event=new ExceptionEvents();
		event.AccountException();
		event.AccountNotFoundException();
		event.AclNotFoundException();
		event.ActivationException();
		event.AlreadyBoundException();
		event.AWTException();
		event.BadAttributeValueExpException();
		event.BadBinaryOpValueExpException();
		event.BadLocationException();
		event.BadStringOperationException();
		event.BrokenBarrierException();
		event.BrokenBarrierException1();
		event.CertificateException();
		event.CloneNotSupportedException();
		event.CoderMalfunctionError();
		event.DataFormatException();
		event.DatatypeConfigurationException();
		event.equals(event);
		event.ExecutionException();
		event.ExpandVetoException();
		event.FactoryConfigurationError();
		event.FontFormatException();
		event.IllegalClassFormatException();
		event.InterruptedException();
		event.IntrospectionException();
		event.InvalidApplicationException();
		event.IOError();
		event.IOException();
		event.KeySelectorException();
		event.LineUnavailableException();
		event.NamingException();
		event.NotBoundException();
		event.PrinterException();
		event.RuntimeErrorException();
		event.PrinterException();
		event.TooManyListenersException();
	}

}

