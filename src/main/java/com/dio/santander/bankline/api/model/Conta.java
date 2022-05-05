package com.dio.santander.bankline.api.model;

public class Conta {
	
	private Long numero;
	private  Double saldo;
	
	/**
	private Correntista correntista;
	
	public Correntista getCorrentista() {
		return correntista;
	}
	
	
	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}
	*/
	
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	

}
