package com.hcl.obj;
public class Agent {
	public StringBuilder show(String agentId,String fullName,int maritalStatus,String zipcode){
		StringBuilder sbError=new StringBuilder();
		boolean isValid=true;
		if(agentId.charAt(0)!='A'){
			sbError.append("agent id must start with A"+"\r\n");
			isValid=false;
		}
		if(fullName.indexOf(' ')==-1){
			sbError.append("name must contains both firstname and lastname"+"\r\n");
			isValid=false;		
		}
		if(fullName.length()>20){
			sbError.append("name must not exceed 20 characters"+"\r\n");
			isValid=false;			
		}
		if(maritalStatus==0){
			sbError.append("not married"+"\r\n");
			isValid=false;				
		}
		if(zipcode.length()>6){
			sbError.append("Zipcode is long"+"\r\n");
			isValid=false;
			
		}
		if(isValid==true){
			sbError.append(agentId+"\r\n");
			sbError.append(fullName+"\r\n");
			sbError.append(maritalStatus+"\r\n");
			sbError.append(zipcode+"\r\n");	
	}
		return sbError;
	}

	public static void main(String[] args) {
		String agentId;
		String fullName;
		int maritalStatus;
		String zipcode;
		agentId="A1";
		fullName="ram dudu";
		maritalStatus=1;
	 zipcode="234587";
		 StringBuilder sbRes=new Agent().show(agentId,fullName,maritalStatus,zipcode );
		System.out.println(sbRes);
		

	}

}
