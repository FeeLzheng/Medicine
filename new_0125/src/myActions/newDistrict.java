package myActions;

public class newDistrict {
	 int id;
     String M_name;
     String D_company;
     String D_district;
     String D_form;
     String D_phone1;
     String D_email1;
     String D_phone2;
     String D_email2;
     
     
     
     public newDistrict (){}
     
     public newDistrict(int id ,String M_name,String D_company,String D_district,String D_form,String D_phone1,String D_email1,String D_phone2,String D_email2){
    	 this.id=id;
    	 this.M_name=M_name;
    	 this.D_company=D_company;
    	 this.D_district=D_district;
    	 this.D_form=D_form;
    	 this.D_phone1=D_phone1;
    	 this.D_email1=D_email1;
    	 this.D_phone2=D_phone2;
    	 this.D_email2=D_email2;
         
    	 
     }
     public int getId(){
    	 return id;
     }
     public void setId(int id){
    	this.id=id;
     }
     public String getM_name(){
    	 return M_name;
     }
     public void setM_name(String M_name){
    	this.M_name=M_name;
     }
     
     public String getD_company(){
    	 return D_company;
    	 
     }
     public void setD_company(String D_company){
    	 this.D_company=D_company;
    	 
    	 
     }
     public String getD_district(){
    	 
    	 return D_district;
     }
     public void setD_district(String D_district){
    	 this.D_district = D_district;
    	 
    	 	 
     }
     
     public String getD_form(){
    	 return D_form;
     }
     public void setD_form(String D_form){
    	 this.D_form = D_form;
    	 
    	 	 
     }
     
     public String getD_phone1(){
    	 return D_phone1;
     }
     public void setD_phone1(String D_phone1){
    	 this.D_phone1=D_phone1;
     }
     public String getD_email1(){
    	 return D_email1;
     }
     public void setD_email1(String D_email1){
    	 this.D_email1=D_email1;
    	 
    	 
     }
     public String getD_phone2(){
    	 return D_phone2;
    	 
     }
     public void setD_phone2(String D_phone2){
    	 this.D_phone2=D_phone2;
     }
     public String getD_email2(){
    	 return D_email2;
     }
     public void setD_email2(String D_email2){
    	 this.D_email2=D_email2;
     }

	
}
