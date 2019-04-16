package ExcelUtil;

import java.util.List;

import Exceptions.ExcelExceptions;



public class ExcelWriter {	
	
	/**
	 * Write any List&lt;T extends IExcelWriter&gt; Object into an excel. 
	 * <p>
	 * This method will write the List in the parameters into an excel.
	 *
	 * @param  obj	A List&lt;T extends IExcelWriter&gt; that will be written in the excel.
	 * @throws ExcelExceptions 
	 */
	public static <T extends IExcelWriter> void write(List<T> obj) throws ExcelExceptions{
		//First, get the headers from the obj.
		if(obj != null) {
			String [] headers = obj.get(0).getHeaders();
			
			for (int i = 0; i < headers.length; i++) {
				System.out.print(headers[i] + "\t");
			}

			//Second, get the values of the obj.
			for(int i = 0; i < obj.size(); i++) {
				List<Object> values = obj.get(i).getValues();
				
				for (int j = 0; j < values.size(); j++) {
					System.out.print(values.get(j) + "\t");
				}
				System.out.print("\n");
			}
		}else {
			throw new ExcelExceptions();
		}
	}



}
