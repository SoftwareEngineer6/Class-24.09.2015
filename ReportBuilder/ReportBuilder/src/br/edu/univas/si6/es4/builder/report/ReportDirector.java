package br.edu.univas.si6.es4.builder.report;

import java.util.Date;
import java.util.List;

public class ReportDirector {

	private ReportBuilder builder;

	public ReportDirector(ReportBuilder builder) {
		this.builder = builder;
	}

	public void construct() {
	    ProdutoDAO dao = new ProdutoDAO();
	    List<Produto> produtos = dao.listar();
	    int quantTotal = 0;
	    float valorTotal = 0;
	    for(Produto produto: produtos) {
	    	quantTotal += produto.getQuantidade();
	    	float valorProduto = produto.getPreco() *
	    			produto.getQuantidade();
	    	valorTotal += valorProduto;
	    }
	    Date data = new Date();
	    builder.buildHeader(data, quantTotal);
	    builder.buildBody(produtos);
	    builder.buildFooter(valorTotal);
	}

}
