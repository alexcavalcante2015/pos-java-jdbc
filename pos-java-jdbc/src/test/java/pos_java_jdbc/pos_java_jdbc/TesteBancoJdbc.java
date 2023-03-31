package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;

public class TesteBancoJdbc {
	
	@Test
	public void initBanco() { // metodo de insert
		
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setNome("Paulo");
		userposjava.setEmail("paulo@gmail.com");
		
		userPosDAO.salvar(userposjava);
	}
	
	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();
		try {
			List<Userposjava> list = dao.listar();
			
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("--------------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void initBuscar() {
		
		UserPosDAO dao = new UserPosDAO();
		try {
			Userposjava userposjava = dao.buscar(5L);
			
			System.out.println(userposjava);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void initAtualizar() {
		
		try {
			
			UserPosDAO dao = new UserPosDAO();
			
			Userposjava objetoBanco = dao.buscar(5L);
			
			objetoBanco.setNome("Nome mudado com o método atualizar");
			
			dao.atualizar(objetoBanco);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void initDeletar() {
		
		try {
			
			UserPosDAO dao = new UserPosDAO();
			dao.delete(10L);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testeInsertTelefone() { 
		
		Telefone telefone = new Telefone();
		telefone.setNumero("(88) 9 9393-9495");
		telefone.setTipo("casa");
		telefone.setUsuário(4L);
		
		UserPosDAO userPosDAO = new UserPosDAO();
		userPosDAO.salvarTelefone(telefone);
		
	}
	
	@Test
	public void testeCarregaFonesUser() {
		
		UserPosDAO dao = new UserPosDAO();
		
		List<BeanUserFone> list = dao.listaUserFone(2L);
		
		for (BeanUserFone beanUserFone : list) {
			System.out.println(beanUserFone);
			System.out.println("--------------------------------------------");
		}
		
	}
	
	@Test
	public void testeDeletarFones() {
			
			UserPosDAO dao = new UserPosDAO();
			dao.deleteFonesPorUser(4L);
			
	}
	
}
