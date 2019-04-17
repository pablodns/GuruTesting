package mainTest;

import java.util.ArrayList;
import java.util.List;

import ExcelUtil.ExcelReader;
import ExcelUtil.ExcelWriter;
import JavaVO.AccountVO;
import JavaVO.ReportVO;

public class MainTestArtifact {

	public static void main(String[] args) {
		
			List<AccountVO> acc = new ArrayList<AccountVO>();
			acc.add(new AccountVO());
			acc.add(new AccountVO("Ana", "Lopez", "Soltera", "28"));
			acc.add(new AccountVO("Blanca", "Arzola", "Casada", "50"));
			acc.add(new AccountVO("Pablo", "Garcia", "Casado", "50"));

				acc = null;
				ExcelWriter.write(acc);

			System.out.println("*****************************");
			List<ReportVO> rep = new ArrayList<ReportVO>();
			rep.add(new ReportVO());
			rep.add(new ReportVO("CreditCards", "10", "5", "0", "15"));
			rep.add(new ReportVO("Debit", "13", "1", "2", "16"));
				ExcelWriter.write(rep);
			
			
		
	}

}
