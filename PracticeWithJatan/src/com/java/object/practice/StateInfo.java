package com.java.object.practice;

public class StateInfo {
	
	private String stateCode;
	private String stateName;
	private String stateCapitol;
	
	public StateInfo(String stateCode,String stateName,String stateCapitol) {
		this.stateCode = stateCode;
		this.stateName = stateName;
		this.stateCapitol = stateCapitol;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateCapitol() {
		return stateCapitol;
	}

	public void setStateCapitol(String stateCapitol) {
		this.stateCapitol = stateCapitol;
	}

	@Override
	public String toString() {
		return "StateInfo [stateCode=" + stateCode + ", stateName=" + stateName + ", stateCapitol=" + stateCapitol
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((stateCapitol == null) ? 0 : stateCapitol.hashCode());
		result = prime * result + ((stateCode == null) ? 0 : stateCode.hashCode());
		//result = prime * result + ((stateName == null) ? 0 : stateName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object state) {
		return this.stateCode == ((StateInfo) state).getStateCode();
	}
	
	

}
