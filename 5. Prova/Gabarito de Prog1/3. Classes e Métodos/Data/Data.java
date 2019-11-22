public class Data{
	private int dia, mes, ano;
	private int[] diasMeses = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public Data (int dia, int mes, int ano) throws Exception{

		if(mes < 1 || mes > 12 || dia < 1 || dia > diasMeses[mes - 1]){ // Data invalida
			throw new Exception("Amigao, digite uma data valida na proxima! :-)");
		}

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;



		if(ano % 4 != 0) // Trata ano bissexto
			diasMeses[1] = 28;
	}

	public String getDataHoje(){
		String dataHoje;
		dataHoje = dia + "/" + mes + "/" + ano;
		return dataHoje;
	}

	public String getDataOntem(){
		int diaOntem, mesOntem, anoOntem;
		String dataOntem;

		if(dia == 1){
			if(mes == 1){
				mesOntem = 12;
				diaOntem = diasMeses[mesOntem - 1];
				anoOntem = ano - 1;
			}

			else{
				mesOntem = mes - 1;
				diaOntem = diasMeses[mesOntem - 1];
				anoOntem = ano;
			}
		}

		else{
			mesOntem = mes;
			diaOntem = dia - 1;
			anoOntem = ano;
		}

		dataOntem = diaOntem + "/" + mesOntem + "/" + anoOntem;
		return dataOntem;
	}

	public String getDataAmanha(){
		int diaAmanha, mesAmanha, anoAmanha;
		String dataAmanha;

		if(dia == diasMeses[mes - 1]){ // Eh o ultimo dia do mes
			if(mes != 12){ // Nao eh dezembro
				diaAmanha = 1;
				mesAmanha = mes + 1;
				anoAmanha = ano;
			}
			else{ // Dezembro
				diaAmanha = 1;
				mesAmanha = 1;
				anoAmanha = ano + 1;
			}
		}
		else{ // Nao eh o ultimo dia do mes
			diaAmanha = dia + 1;
			mesAmanha = mes;
			anoAmanha = ano;
		}

		dataAmanha = diaAmanha + "/" + mesAmanha + "/" + anoAmanha;
		return dataAmanha;
	}	
}