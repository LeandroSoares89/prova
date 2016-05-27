package br.com.prova.model;

import java.util.List;




public class EquipamentoRN {
	private EquipamentoDAO equipamentoDAO = new EquipamentoDAO(); 


	public void inserirEquipamento(Equipamento equipamento) {
		if(equipamento.getCodigo() == null || equipamento.getCodigo()==0){
		new EquipamentoDAO().inserirEquipamento(equipamento);
		}else{
			new EquipamentoDAO().updateEquipamento(equipamento);
		}
	}

	public void deletarEquipamento(Equipamento equipamento) {
		new EquipamentoDAO().deletarEquipamento(equipamento);

	}






	public List<Equipamento> selectAll() {
		return this.equipamentoDAO.selectAll();
	}

}
