package solicitante;


/*Essa classe tem como objetivo modelar o objeto que será referente ao solicitante da/das chaves para acesso, então essa classe tem ligação *direta com com o banco de dados utilizados para salvar as informações de liberação de chave.
*/
public class Solicitante{
	
	private String matricula;
	private String primeiroNome;
	private String sobreNome;
	private String senhaAcesso;
	private String horaEntrada;
	private String horaSaida;

	public Solicitante (String matricula, String primeiroNome, String sobreNome, String senhaAcesso){
	this.matricula=matricula;
	this.primeiroNome=primeiroNome;
	this.sobreNome=sobreNome;
	this.senhaAcesso=senhaAcesso;
	}

	public Solicitante (String matricula, String primeiroNome, String sobreNome, String senhaAcesso,String horaEntrada, String horaSaida){
	this.matricula=matricula;
	this.primeiroNome=primeiroNome;
	this.sobreNome=sobreNome;
	this.senhaAcesso=senhaAcesso;
	this.horaEntrada=horaEntrada;
	this.horaSaida=horaSaida;
	}

	public String getMatricula(){
		return this.matricula;
	}

	public void setMatricula(String matricula){
		this.matricula=matricula;
	}

	public String getPrimeiroNome(){
		return this.primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome){
		this.primeiroNome=primeiroNome;
	}

	public String getSobreNome(){
		return this.sobreNome;
	}

	public void setSobreNome(String sobreNome){
		this.sobreNome=sobreNome;
	}

	public String getSenhaAcesso(){
		return this.senhaAcesso;
	}

	public void setSenhaAcesso(String senhaAcesso){
		this.senhaAcesso=senhaAcesso;
	}

	public String getHoraEntrada(){
		return this.horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada){
		this.horaEntrada=horaEntrada;
	}
	public String getHoraSaida(){
		return this.horaSaida;
	}

	public void setHoraSaida(String horaSaida){
		this.horaSaida=horaSaida;
	}

}