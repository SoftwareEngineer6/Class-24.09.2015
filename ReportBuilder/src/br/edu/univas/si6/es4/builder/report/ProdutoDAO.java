package br.edu.univas.si6.es4.builder.report;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

	public List<Produto> listar() {
		List<Produto> result = new ArrayList<>();
		result.add(new Produto("Arroz", 10, 15));
		result.add(new Produto("Macarr�o", 8, 3));
		result.add(new Produto("Farinha", 15, 2.5f));
		return result;
	}
}
