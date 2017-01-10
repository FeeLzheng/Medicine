package myActions;

public class newMedicine {
     String M_name;
     String M_id;
     String M_standard1;
     String M_standard2;
     String M_adaptation;
     String M_use;
     String M_effect;
     String M_execute;
     String M_instruction;
     String M_date;
     
     public newMedicine (){}
     
     public newMedicine(String M_name,String M_id,String M_standard1,String M_standard2,String M_adaptation,String M_use,String M_effect,String M_execute,String M_instruction,String M_date){
    	 this.M_name=M_name;
    	 this.M_id=M_id;
    	 this.M_standard1=M_standard1;
    	 this.M_standard2=M_standard2;
    	 this.M_adaptation=M_adaptation;
    	 this.M_use=M_use;
    	 this.M_effect=M_effect;
    	 this.M_execute=M_execute;
    	 this.M_instruction=M_instruction;
    	 this.M_date=M_date;
     }
     
     public String getM_name(){
    	 return M_name;
     }
     public void setM_name(String M_name){
    	this.M_name=M_name;
     }
     public String getM_date() {
		return M_date;
	}

	public void setM_date(String m_date) {
		M_date = m_date;
	}

	public String getM_id(){
    	 return M_id;
    	 
     }
     public void setM_id(String M_id){
    	 this.M_id=M_id;
    	 
    	 
     }
     public String getM_standard1(){
    	 return M_standard1;
     }
     public void setM_standard1(String M_standard1){
    	 this.M_standard1 = M_standard1;
    	 
    	 	 
     }
     
     public String getM_standard2(){
    	 return M_standard2;
     }
     public void setM_standard2(String M_standard2){
    	 this.M_standard2 = M_standard2;
    	 
    	 	 
     }
     
     public String getM_adaptation(){
    	 return M_adaptation;
     }
     public void setM_adaptation(String M_adaptation){
    	 this.M_adaptation=M_adaptation;
     }
     public String getM_use(){
    	 return M_use;
     }
     public void setM_use(String M_use){
    	 this.M_use=M_use;
    	 
    	 
     }
     public String getM_effect(){
    	 return M_effect;
    	 
     }
     public void setM_effect(String M_effect){
    	 this.M_effect=M_effect;
     }
     public String getM_execute(){
    	 return M_execute;
     }
     public void setM_execute(String M_execute){
    	 this.M_execute=M_execute;
     }
     public String getM_instruction(){
    	 return M_instruction;
    	 
    	 
     }
     public void setM_instruction(String M_instruction){
    	 this.M_instruction=M_instruction;
    	 
    	 
    	 
     }
     
	
}
