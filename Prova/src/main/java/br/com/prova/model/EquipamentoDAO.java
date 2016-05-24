package br.com.prova.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
			ps.executeUpdate();
		} catch (Exception e) {
			System.err.println("Erro: "+ e.getMessage());
			e.printStackTrace();
		}finally{
			closeConnection(conexao, ps, null);
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
		List<Equipamento> lsEquipamento = null;
		Connection conexao = null;
		PreparedStatement  ps = null;
		ResultSet rs = null;
		String sql = "SELECT codigo, nome, descricao"+
		" FROM equipamento ORDER BY codigo";
		
		try {
			conexao = openConnection();
			ps = conexao.prepareStatement(sql);
			rs= ps.executeQuery();
			lsEquipamento = new ArrayList<Equipamento>();
			while(rs.next()){
				Equipamento equipamento = new Equipamento();
				equipamento.setCodigo(rs.getLong("codigo"));
				equipamento.setNome(rs.getString("nome"));
				equipamento.setDescricao(rs.getString("descricao"));
				lsEquipamento.add(equipamento);
			}
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
		return lsEquipamento;
	}

}
