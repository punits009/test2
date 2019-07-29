package Lab1point3;

import java.util.List;

public class SBU {

	private int sbuId;
	private String sbuName;
	private String sbuHead;
	private List<String> emplist;

	public List<String> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<String> emplist) {
		this.emplist = emplist;
	}

	public int getSbuId() {
		return sbuId;
	}

	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	

	public SBU(int sbuId, String sbuName, String sbuHead, List<String> emplist) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.emplist = emplist;
	}

	public SBU() {
		// TODO Auto-generated constructor stub
	}

}
