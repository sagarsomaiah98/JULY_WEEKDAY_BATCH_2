
public class Read_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Xls_Reader xls = new Xls_Reader("D:\\JANBASK\\JULY_WEEKDAY_BATCH_2\\Data_Parameterization\\src\\TestData\\TESTSUITE.xlsx");
		
		int row_count= xls.getRowCount("GMAIL");
		System.out.println(row_count);
		
		String value =xls.getCellData("GMAIL", 1, 2);
		
		System.out.println(value);

		
		xls.addColumn("GMAIL", "comments");
	}

}
