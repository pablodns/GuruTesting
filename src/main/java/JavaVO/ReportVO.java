package JavaVO;

import java.util.ArrayList;
import java.util.List;

import ExcelUtil.IExcelWriter;

public class ReportVO implements IExcelWriter{
		
	String stream = "Deposits";
	String passed = "2"; 
	String failed = "4";
	String skipped = "0";
	String total = "6";
	
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
	public ReportVO(String stream, String passed, String failed, String skipped, String total) {
		super();
		this.stream = stream;
		this.passed = passed;
		this.failed = failed;
		this.skipped = skipped;
		this.total = total;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getPassed() {
		return passed;
	}

	public void setPassed(String passed) {
		this.passed = passed;
	}

	public String getFailed() {
		return failed;
	}

	public void setFailed(String failed) {
		this.failed = failed;
	}

	public String getSkipped() {
		return skipped;
	}

	public void setSkipped(String skipped) {
		this.skipped = skipped;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	
	
}
