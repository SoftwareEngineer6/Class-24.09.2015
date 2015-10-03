package br.edu.univas.si6.es4.builder.report;

public class Runner {

	public static void main(String[] args) {
		XMLBuilder builder = new XMLBuilder();
		ReportDirector director = new ReportDirector(builder);
		director.construct();
		String result = builder.getResult();
		System.out.println(result);
	}
	
}
