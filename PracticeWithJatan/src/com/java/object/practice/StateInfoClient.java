package com.java.object.practice;

public class StateInfoClient {

	public static void main(String[] args) {
		
		StateInfo s1 = new StateInfo("IL","Illinois","Sprinfield");
		StateInfo s2 = new StateInfo("TX","Illinois","Austin");
		StateInfo s3 = new StateInfo("NY","Illinois","Albany");
		StateInfo s4 = new StateInfo("NJ","Illinois","Trenton");
		StateInfo s5 = new StateInfo("CA","Illinois","Sacramento");
		StateInfo s6 = new StateInfo("SC","Illinois","Columbia");
		StateInfo s7 = new StateInfo("FL","Illinois","Tallahassee");
		StateInfo s8 = new StateInfo("AZ","Arizona","Phoenix");
		StateInfo s9 = new StateInfo("IN","Indiana","Indianapolis");
		StateInfo s10 = new StateInfo("PA","Pennsylvania","Harrisburg");
		
		StateInfo[] states = new StateInfo[10];
		states[0] = s1;
		states[1] = s2;
		states[2] = s3;
		states[3] = s4;
		states[4] = s5;
		states[5] = s6;
		states[6] = s7;
		states[7] = s8;
		states[8] = s9;
		states[9] = s10;
		
		for(StateInfo n : states) {
			//System.out.println(n.getStateCode() + ", " + n.getStateName() + ", " + n.getStateCapitol());
			System.out.println(n);
		}

		StateInfo s11 = new StateInfo("SA","Pennsylvania","Harrisburg");
		System.out.println(s11.equals(s10));
	}

}
