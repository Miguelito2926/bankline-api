package com.dio.santander.bankline.api.service;

import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;

@Service
public class CorrentistaService {
	public void save(NovoCorrentista novoCorrentista) {
		Correntista correntista = new Correntista();
	}	

}
