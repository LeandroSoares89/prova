package br.com.prova.model;

import java.util.List;

public class EquipamentoRN {

	public void inserirEquipamento(Equipamento equipamento) {
		new EquipamentoDAO().inserirEquipamento(equipamento);

	}

	public void deletarEquipamento(Equipamento equipamento) {
		// TODO Auto-generated method stub

	}

	public void updateEquipamento(Equipamento equipamento) {
		// TODO Auto-generated method stub

	}

	public List<Equipamento> selectAll() {
		return new EquipamentoDAO().selectAll();
	}

}
