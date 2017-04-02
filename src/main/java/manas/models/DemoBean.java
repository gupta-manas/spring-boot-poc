package manas.models;

public class DemoBean {

	private long beanID;
	private int intNum;
	private String stringVal;
	private boolean boolVal;
	
	public DemoBean(){
		
	}
	public DemoBean(long beanID, int intNum, String stringVal, boolean boolVal) {
		super();
		this.beanID = beanID;
		this.intNum = intNum;
		this.stringVal = stringVal;
		this.boolVal = boolVal;
	}
	public long getBeanID() {
		return beanID;
	}
	public void setBeanID(long beanID) {
		this.beanID = beanID;
	}
	public int getIntNum() {
		return intNum;
	}
	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}
	public String getStringVal() {
		return stringVal;
	}
	public void setStringVal(String stringVal) {
		this.stringVal = stringVal;
	}
	public boolean isBoolVal() {
		return boolVal;
	}
	public void setBoolVal(boolean boolVal) {
		this.boolVal = boolVal;
	}

	@Override
	public String toString() {
		return "DemoBean [beanID=" + beanID + ", intNum=" + intNum + ", stringVal=" + stringVal + ", boolVal=" + boolVal
				+ "]";
	}

}
