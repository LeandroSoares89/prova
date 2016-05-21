package br.com.prova.model;

import java.util.List;

public class EquipamentoRN implements CRUD{

	@Override
	public void inserirEquipamento(Equipamento equipamento) {
		new EquipamentoDAO().inserirEquipamento(equipamento);
		
	}

	@Override
	public void deletarEquipamento(Equipamento equipamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEquipamento(Equipamento equipamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Equipamento> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
