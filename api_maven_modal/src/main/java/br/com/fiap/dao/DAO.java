package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.conexoes.ConexaoFactory;
import br.com.fiap.model.Acidente;
import br.com.fiap.model.Cliente;
import br.com.fiap.model.LocalProblema;
import br.com.fiap.model.Veiculo;

public class DAO {
	
	public Connection minhaConexao;
	
	public DAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	// Inserir 
	public String inserir (Cliente Cliente) throws SQLException {
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				(" insert into T_CPS_CLIENTE values (?)");
		stmt.setString(1, Cliente.getCliente());
		stmt.setString(2, Cliente.getPlaca());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com Sucesso";
		
	}
	
	public String inserir (Veiculo Veiculo) throws SQLException {
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				(" insert into T_CPS_VEICULO values (?)");
		stmt.setDouble(1, Veiculo.getCargaExtra());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com Sucesso";
		
	}
	
	public String inserir (Acidente Acidente) throws SQLException {
		

		//public Acidente(String batida, String bateria, String pneus, String mauFuncionamento, String rodaTravada,
			//	String pneuCorreia, String combustivelOleo, String sensorFusivel, String radiador, String motorCorreia)
		
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				(" insert into T_CPS_ACIDENTE values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		stmt.setString(1, Acidente.getBatida());
		stmt.setString(2, Acidente.getBateria());
		stmt.setString(3, Acidente.getPneus());
		stmt.setString(4, Acidente.getMauFuncionamento());
		stmt.setString(5, Acidente.getRodaTravada());
		stmt.setString(6, Acidente.getPneuCorreia());
		stmt.setString(7, Acidente.getCombustivelOleo());
		stmt.setString(8, Acidente.getSensorFusivel());
		stmt.setString(9, Acidente.getRadiador());
		stmt.setString(10, Acidente.getMotorCorreia());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com Sucesso";
		
	}

	public String inserir (LocalProblema Local) throws SQLException {
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				(" insert into T_CPS_LOCAL values (?, ?, ?)");
		stmt.setString(1, Local.getPlano());
		stmt.setString(2, Local.getSubida());
		stmt.setString(3, Local.getDescida());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com Sucesso";
		
	}
	
	
}

