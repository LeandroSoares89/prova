package br.com.prova.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.prova.model.Equipamento;
import br.com.prova.model.EquipamentoRN;

@ManagedBean(name = "mbEquipamento")
@SessionScoped
public class MBEquipamento {

	private Equipamento equipamento = new Equipamento();

	private List<Equipamento> lsequipamento = null;

	// Getters e Setters

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public List<Equipamento> getListagemEquipamento() {
		if(lsequipamento == null)
			System.out.println("Passou...");
			lsequipamento = new EquipamentoRN().selectAll();
		return lsequipamento;

	}
	public String actionNovo(){
		this.equipamento = new Equipamento();
		return "form_equipamento";
	}
	public String actionSalvar() {
		new EquipamentoRN().inserirEquipamento(equipamento);
		this.lsequipamento = null;
		return "index";
	}

}