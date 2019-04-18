package JavaVO;

import java.util.ArrayList;
import java.util.List;

import ExcelUtil.IExcelWriter;

public class ReportVO implements IExcelWriter{
		
	String stream = "";
	int passed = 0; 
	int failed = 0;
	int skipped = 0;
	int total = 0;
	
	public String[] getHeaders() {
		String []headers = {"Stream","Passed","Failed","Skipped", "Total"};
		return headers;
	}

	public List<Object> getValues() {
		List<Object> values = new ArrayList<Object>();
		values.add(stream);
		values.add(passed);
		values.add(failed);
		values.add(skipped);
		values.add(total);
		
		return values;
	}

	public ReportVO() {
		
	}
	public ReportVO(String stream, int passed, int failed, int skipped, int total) {
		super();
		this.stream = stream;
		this.passed = passed;
		this.failed = failed;
		this.skipped = skipped;
		this.total = total;
	}

	
	public static List<ReportVO> addTotal(List<ReportVO> reportList){
		String stream = "TOTAL";
		int passed = 0;
		int failed = 0;
		int skipped = 0;
		int total = 0;
		
		for(ReportVO report: reportList) {
			passed += report.getPassed();
			failed += report.getFailed();
			skipped += report.getSkipped();
			total += report.getTotal();
		}
		ReportVO report = new ReportVO();
		report.setStream(stream);
		report.setPassed(passed);
		report.setFailed(failed);
		report.setSkipped(skipped);
		report.setTotal(total);
		
		reportList.add(report);
		
		return reportList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getPassed() {
		return passed;
	}

	public void setPassed(int passed) {
		this.passed = passed;
	}

	public int getFailed() {
		return failed;
	}

	public void setFailed(int failed) {
		this.failed = failed;
	}

	public int getSkipped() {
		return skipped;
	}

	public void setSkipped(int skipped) {
		this.skipped = skipped;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
