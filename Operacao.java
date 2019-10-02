import java.util.Calendar;


public class Operacao {

	private Calendar dataInicio;
	private Calendar dataFim;
	
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Calendar getDataFim() {
		return dataFim;
	}
	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacao [dataInicio=");
		builder.append(dataInicio);
		builder.append(", dataFim=");
		builder.append(dataFim);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
