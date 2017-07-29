package aula1.depois;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteECincoPorCento()),
    TESTER(new QuinzeOuVinteECincoPorCento());
	
	private RegraDeCalculo regra;
	
	private Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}	
	
}
