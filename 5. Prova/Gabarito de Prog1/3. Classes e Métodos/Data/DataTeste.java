public class DataTeste{
	public static void main(String [] args){
		Data data1, data2, data3;
		
		try{
			data1 = new Data(7, 5, 2019);
			data2 = new Data(31, 12, 2006);
			data3 = new Data(-29, 2, 1988);

			System.out.println("DATA 1: ");
			System.out.println(data1.getDataHoje());
			System.out.println(data1.getDataOntem());
			System.out.println(data1.getDataAmanha());

			System.out.println("DATA 2: ");
			System.out.println(data2.getDataHoje());
			System.out.println(data2.getDataOntem());
			System.out.println(data2.getDataAmanha());

			System.out.println("DATA 3: ");
			System.out.println(data3.getDataHoje());
			System.out.println(data3.getDataOntem());
			System.out.println(data3.getDataAmanha());
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("DEU RUIM!");
		}

	}
}