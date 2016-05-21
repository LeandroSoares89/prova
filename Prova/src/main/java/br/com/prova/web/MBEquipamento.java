package br.com.prova.web;


import java.util.List;

import javax.faces.bean.ManagedBean;


import br.com.prova.model.Equipamento;
import br.com.prova.model.EquipamentoRN;

@ManagedBean (name = "mbEquipamento")

public class MBEquipamento  {

	
	
	private Equipamento equipamento = new Equipamento();
	
	private List<Equipamento> lsequipamento = null;

	// Getters e Setters
	
	
		public String getListagemEquipamento(){
			if(lsequipamento == null){
				new EquipamentoRN().selectAll();
			}
			return "lsequipamento";
			
		}
		public Equipamento getEquipamento() {
			return equipamento;
		}

		public void setEquipamento(Equipamento equipamento) {
			this.equipamento = equipamento;
		}
	
	public String inserirEquipamento() {
		new EquipamentoRN().inserirEquipamento(equipamento);
		this.lsequipamento = null;
		return "index";
	}

	
	
}