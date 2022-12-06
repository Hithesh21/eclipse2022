package com.xworkz.handle;

import javax.management.RuntimeErrorException;
import javax.security.auth.login.AccountException;
import javax.security.auth.login.AccountNotFoundException;

import org.omg.CORBA.UserException;

public class ExceptionEvents {
	 
	public void RuntimeErrorException() {
		System.out.println("running RuntimeErrorException");
		throw new RuntimeErrorException(null) ;
	}
	
	public void ActivationException() throws java.rmi.activation.ActivationException {
		System.out.println("ActivationException");
		throw new java.rmi.activation.ActivationException();
	}
	public void AclNotFoundException() throws AccountNotFoundException {
		System.out.println("AclNotFoundException");
		throw new AccountNotFoundException();
	}
	public void  AccountException() throws AccountException {
		System.out.println(" AccountException");
		throw new  AccountException();
	}
		
    public void AccountNotFoundException() throws javax.security.auth.login.AccountNotFoundException {
    	throw new AccountNotFoundException(null);
    }
	 
    public void  AlreadyBoundException() throws java.rmi.AlreadyBoundException
    {
    	throw new  java.rmi.AlreadyBoundException();
    }
		
	public void AWTException() throws java.awt.AWTException {
		throw new java.awt.AWTException(null);
		
	}
	
	public void BadAttributeValueExpException() throws javax.management.BadAttributeValueExpException {
		throw new javax.management.BadAttributeValueExpException(getClass());
	}
		
	public void BadBinaryOpValueExpException() throws javax.management.BadBinaryOpValueExpException {
		throw new javax.management.BadBinaryOpValueExpException(null);
		
	}
	
	public void BadLocationException() throws javax.swing.text.BadLocationException {
		throw new javax.swing.text.BadLocationException(null, 0);
	}
	
	public void BadStringOperationException() throws javax.management.BadStringOperationException {
		throw new javax.management.BadStringOperationException(null);
	
	}
	
	public void BrokenBarrierException() throws java.util.concurrent.BrokenBarrierException {
		throw new java.util.concurrent.BrokenBarrierException();
	}
		
	public void BrokenBarrierException1() throws java.util.concurrent.BrokenBarrierException	{
		throw new java.util.concurrent.BrokenBarrierException(null);
	}
	
	public void CertificateException() throws java.security.cert.CertificateException {
		throw new java.security.cert.CertificateException();
		
	}
		public void CertificateException1() throws javax.security.cert.CertificateException {
			throw new javax.security.cert.CertificateException(null);
		}
	 
		public void CloneNotSupportedException() throws java.lang.CloneNotSupportedException {
			throw new java.lang.CloneNotSupportedException();
		}
		
		public void DataFormatException() throws java.util.zip.DataFormatException {
			throw new java.util.zip.DataFormatException();
		}

		public void DataFormatException1() throws java.util.zip.DataFormatException
		{
			throw new java.util.zip.DataFormatException(null);
		}
		
		public void DatatypeConfigurationException() throws javax.xml.datatype.DatatypeConfigurationException {
			throw new javax.xml.datatype.DatatypeConfigurationException();
		}
		
		public void ExecutionException() throws java.util.concurrent.ExecutionException {
			throw new java.util.concurrent.ExecutionException(null);
		}
		
		public void ExpandVetoException() throws javax.swing.tree.ExpandVetoException {
			throw new javax.swing.tree.ExpandVetoException(null);
		}
		
		public void FontFormatException() throws java.awt.FontFormatException {
			throw new java.awt.FontFormatException(null);
			
		}
		
		public void IllegalClassFormatException() throws java.lang.instrument.IllegalClassFormatException {
			throw new java.lang.instrument.IllegalClassFormatException();
		}
		
		public void InterruptedException() throws java.lang.InterruptedException {
			throw new java.lang.InterruptedException();
			
		}
		
		public void IntrospectionException() throws javax.management.IntrospectionException {
			throw new javax.management.IntrospectionException();
		}
		
		
		public void InvalidApplicationException() throws javax.management.InvalidApplicationException {
			throw new javax.management.InvalidApplicationException(getClass());
			
		}
		
		public void  IOException() throws java.io.IOException {
			throw new  java.io.IOException();
			
		}
		
		public void KeySelectorException() throws javax.xml.crypto.KeySelectorException {
			throw new javax.xml.crypto.KeySelectorException();
			
		}
		
		public void LineUnavailableException() throws javax.sound.sampled.LineUnavailableException {
			throw new javax.sound.sampled.LineUnavailableException();
		}
		
		
		public void NamingException() throws javax.naming.NamingException {
			throw new javax.naming.NamingException();
		}
		
		public void NamingException1() throws javax.naming.NamingException {
			throw new javax.naming.NamingException(null);
			
		}
		
		public void  NotBoundException() throws java.rmi.NotBoundException {
			throw new  java.rmi.NotBoundException();
		}
		
		public void PrinterException() throws java.awt.print.PrinterException {
			throw new java.awt.print.PrinterException();
		}
		
		public void TooManyListenersException() throws java.util.TooManyListenersException {
			throw new java.util.TooManyListenersException();
		}
		 
		public void IOError() {
			throw new java.io.IOError(null);
			
		}
		public void CoderMalfunctionError() {
			throw new java.nio.charset.CoderMalfunctionError(null);
			
		}
		
		public void FactoryConfigurationError() {
			throw new javax.xml.parsers.FactoryConfigurationError();
		}
}
