package br.com.prova.model;

import java.util.List;

public interface CRUD {
	void inserirEquipamento(Equipamento equipamento);

	void deletarEquipamento(Equipamento equipamento);

	void updateEquipamento(Equipamento equipamento);

	List<Equipamento> selectAll(Equipamento equipamento);
}
