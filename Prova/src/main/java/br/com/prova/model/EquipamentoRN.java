package br.com.prova.model;

import java.util.List;

public class EquipamentoRN implements CRUD{
	private EquipamentoDAO equipamentoDAO = new EquipamentoDAO(); 

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
	public List<Equipamento> selectAll(Equipamento equipamento) {
		return this.equipamentoDAO.selectAll(equipamento);
	}

}
