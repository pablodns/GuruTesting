package mainTest;

import java.util.ArrayList;
import java.util.List;

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
			ExcelWriter.write(acc);

			System.out.println("*****************************");
			List<ReportVO> rep = new ArrayList<ReportVO>();
			rep.add(new ReportVO());
			rep.add(new ReportVO("CreditCards", 4, 12,0, 18));
			rep.add(new ReportVO("Debit", 12, 32,0, 44));
			rep.add(new ReportVO("Deposits", 24, 2,0, 26));
			ExcelWriter.write(rep);
			
			
		
	}

}
