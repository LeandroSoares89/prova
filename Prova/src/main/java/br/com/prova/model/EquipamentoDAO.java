package br.com.prova.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import br.com.prova.util.ConnectionFactory;

public class EquipamentoDAO extends ConnectionFactory implements CRUD{
	
	@Override
	public void inserirEquipamento(Equipamento equipamento) {
		Connection conexao = null;
		PreparedStatement ps = null;
		String sql ="INSERT INTO equipamento (nome, descricao)" 
				+ " VAlUES (?, ?)";
		try {
			conexao = openConnection();
			ps = conexao.prepareStatement(sql);
			ps.setString(1, equipamento.getNome());
			ps.setString(2, equipamento.getDescricao());
			ps.executeQuery();
		} catch (Exception e) {
			System.err.println("Erro: "+ e.getMessage());
			e.printStackTrace();
		}
		
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
