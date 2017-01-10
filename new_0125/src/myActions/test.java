import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public List<newClient> getClient() throws Exception {
        
    	allClient2 = new ArrayList<newClient>();//创建数组列表集合对象
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        int C_id =client.getC_id();
        
        
        
        ResultSet rs = db.doQuery("SELECT client.*,districtinfo.*,query.*,purchaseinfo.*,medicinequery.*,complain.*,department.*,reaction.*,others.* FROM client,districtinfo,query,purchaseinfo,medicinequery,complain,department,reaction,others WHERE client.C_id="+C_id+" client.C_id=districtinfo.C_id and client.C_id=query.Q_id and client.C_id=purchaseinfo.P_id and client.C_id=medicinequery.MD_id and client.C_id=complain.Co_id and client.C_id=department.Da_id and client.C_id=reaction.Re_id and  client.C_id=others.O_id and  ;");//执行查询，返回新闻栏目记录
  
       
    	String M_name;
    	String C_phone;
    	String C_name;
    	String C_districtinfo;
    	String C_query;
    	String C_purchase;
    	String C_medicinequery;
    	String C_complain;
    	String C_department;
    	String C_reaction;
    	String C_other;
    	String C_Date;

    	int Di_id;
    	String Di_info;
    	int Q_id;
    	String Q_info;
    	int P_id;
    	String P_info;
    	int MQ_id;
    	String MQ_info;
    	int Co_id;
        String Co_info;
        String Co_department;
        String Co_deliver;
        String Co_dealer;
        String Co_category;
        String Co_replay;
        String Co_result;
        String Co_replenish; 
    	int Da_id;
    	String Da_info;
        int Re_id;
        String Re_name;
        String Re_sex;
        String Re_age;
        String Re_nation;
        String Re_weight;
        String Re_disease;
        String Re_reactionN;
        String Re_reactionD;
        String Re_timeM;
        String Re_use;
        String Re_time;
        String Re_result;
        String Re_number;
        String Re_merge;
        String Re_family;
        String Re_reactionP;
        String Re_others;
        String Re_hospital;
        String Re_case;
        String Re_phone;
    	int O_id;
    	String O_info;
    	
    
while (rs.next()) {
    		  
        	 C_id=rs.getInt("C_id");
        	 
        	 M_name = rs.getString("M_name");
        	 C_name = rs.getString("C_name");
        	 C_phone = rs.getString("C_phone");       		
        	 C_districtinfo = rs.getString("C_districtinfo");       	
        	 C_query = rs.getString("C_query");        	
        	 C_purchase = rs.getString("C_purchase");        	
        	 C_medicinequery = rs.getString("C_medicinequery");        	
        	 C_complain = rs.getString("C_complain");
       
        	 C_department = rs.getString("C_department");
     
        	 C_reaction = rs.getString("C_reaction");
        	 C_other = rs.getString("C_other");
        	 C_Date = rs.getString("C_Date");
        	
        	 
        	  Di_id=rs.getInt("C_id");
        	 	
         	Di_info=rs.getString("info");
          	
         	Q_id=rs.getInt("Q_id");
         	
         	
         	Q_info=rs.getString("Q_info");
         	P_id=rs.getInt("P_id");
        
         	P_info=rs.getString("P_info");
         	MQ_id=rs.getInt("MD_id");
         	MQ_info=rs.getString("MD_info");
        	
            Co_id=rs.getInt("Co_id");
              Co_info=rs.getString("Co_info");
              Co_department=rs.getString("Co_department");
       
              Co_deliver=rs.getString("Co_deliver");
              Co_dealer=rs.getString("Co_dealer");
              Co_category=rs.getString("Co_category");
              Co_replay=rs.getString("Co_replay");
              Co_result=rs.getString("Co_result");
             Co_replenish=rs.getString("Co_replenish");
           
         	 Da_id=rs.getInt("Da_id");
         	 Da_info=rs.getString("Da_info");
             Re_id=rs.getInt("Re_id");
             Re_name=rs.getString("Re_name");
             Re_sex=rs.getString("Re_sex");
             Re_age=rs.getString("Re_age");
             Re_nation=rs.getString("Re_nation");
             Re_weight=rs.getString("Re_weight");
             Re_disease=rs.getString("Re_disease");
             Re_reactionN=rs.getString("Re_reactionN");
             Re_reactionD=rs.getString("Re_reactionD");
             Re_timeM=rs.getString("Re_timeM");
              Re_use=rs.getString("Re_use");
             Re_time=rs.getString("Re_time");
             Re_result=rs.getString("Re_result");
             Re_number=rs.getString("Re_number");
             Re_merge=rs.getString("Re_merge");
             Re_family=rs.getString("Re_family");
             Re_reactionP=rs.getString("Re_reactionP");
             Re_others=rs.getString("Re_others");
             Re_hospital=rs.getString("Re_hospital");
             Re_case=rs.getString("Re_case");
             Re_phone=rs.getString("Re_phone");
         	O_id=rs.getInt("O_id");
         	O_info=rs.getString("O_info");
        	 
        
        	
        
        	allClient2.add(new newClient(C_id,M_name,C_name,C_phone,C_districtinfo,C_query,C_purchase,C_medicinequery,C_complain,C_department,C_reaction,C_other,C_Date,
        			 Di_id,Di_info,Q_id,Q_info,P_id,P_info,MQ_id,MQ_info,Co_id,Co_info,Co_department,Co_deliver,Co_dealer,
        			 Co_category,Co_replay,Co_result,Co_replenish,Da_id,Da_info,Re_id, Re_name,Re_sex,Re_age,Re_nation,Re_weight,Re_disease,Re_reactionN,Re_reactionD,Re_timeM,Re_use
        			 ,Re_time,Re_result,Re_number,Re_merge,Re_family,Re_reactionP,Re_others,Re_hospital,Re_case,Re_phone,O_id,O_info));//创建新闻栏目对象，加入列表对象
             
        }
        System.out.println("allClient2");
        db.close();//清理数据库模型对象
        return allClient2;
    }






public String admin_outPut() throws Exception {
            try {
                WritableWorkbook wwb = null;
                 
                   // 创建可写入的Excel工作簿
                   String fileName = "D://book.xls";
                   File file=new File(fileName);
                   if (!file.exists()) {
                       file.createNewFile();
                   }
                   //以fileName为文件名来创建一个Workbook
                   wwb = Workbook.createWorkbook(file);

                   // 创建工作表
                   WritableSheet ws = wwb.createSheet("Test Shee 1", 0);
                   
                   //查询数据库中所有的数据
                    
                   //要插入到的Excel表格的行号，默认从0开始
                   Label labelM_name= new Label(0, 0, "药品名称(M_name)");
                   Label labelC_name= new Label(1, 0, "客户姓名(C_name)");
                   Label labelC_phone= new Label(2, 0, "客户电话(C_phone)");
                   Label labelRecord= new Label(3, 0, "客服服务记录(record)");
                   Label labeldistrictinfo= new Label(3, 1, "产品代理");
                   Label labeldinfo1= new Label(4, 1, "具体内容");
                   Label labelquery= new Label(3, 2, "个人咨询");
                   Label labeldinfo2= new Label(4, 2, "具体内容");
                   Label labelpurchase= new Label(3,3, "个人购买");
                   Label labeldinfo3= new Label(4, 3, "具体内容");
                   Label labelmedicinequery= new Label(3,4, "用药咨询");
                   Label labeldinfo4= new Label(4, 4, "具体内容");
                   
                   Label labelcomplain= new Label(3,4, "投诉");
                   Label labelCo_info= new Label(4, 5, "产品信息");
                   Label labelCo_department= new Label(4, 6, "用药单位");                 
                   Label labelCo_dealer= new Label(4, 7, "经销商信息");                
                   Label labelCo_category= new Label(4, 8, "投诉类别");
                   Label labelCo_deliver= new Label(4, 9, "转交部门");
                   Label labelCo_replay= new Label(4, 9, "投诉回复");                   
                   Label labelCo_result= new Label(4, 10, "投诉处理结果");
                   Label labelCo_replenish= new Label(4, 11, "补货信息");
                   Label labeldepartment= new Label(3,12, "药监部门");
                   Label labeldinfo5= new Label(4, 12, "具体内容");

                   Label labeldreaction= new Label(3,13, "不良反应");                
                   Label labelRe_name= new Label(4, 14, "患者姓名");
                   Label labelRe_sex= new Label(6, 14, "性别");               
                   Label labelRe_age= new Label(4, 15, "年龄");                   
                   Label labelRe_nation= new Label(6, 15, "民族");
                   Label labelRe_weight= new Label(4, 16, "体重");
                   Label labelRe_disease= new Label(6, 16, "原患疾病");                   
                   Label labelRe_reactionN= new Label(4, 17, "不良反应/事件名称");
                   Label labelRe_reactionD= new Label(4, 18, "不良反应/事件过程描述");                
                   Label labelRe_timeM= new Label(4, 19, "用药起止时间");
                   Label labelRe_use= new Label(4, 20, "用法用量");
                   Label labelRe_time= new Label(4, 21, "不良反应/事件发生时间");
                  
                   Label labelRe_result= new Label(4, 22, "不良反应/事件的结果");
                   Label labelRe_number= new Label(4, 23, "生产批号");
                   Label labelRe_merge= new Label(4, 24, "合并用药品情况");
                   Label labelRe_family= new Label(4, 25, "家族药品不良反应/事件");
                   Label labelRe_reactionP= new Label(6, 25, "既往药品不良反应/事件");                   
                   Label labelRe_others= new Label(4, 26, "其他");
                   Label labelRe_hospital= new Label(6, 26, "医院名称");
                   Label labelRe_case= new Label(4, 27, "病历号/门诊号");
                   Label labelRe_phone= new Label(6, 27, "联系方式");   
                   
                   Label labelothers= new Label(3, 28, "其它事项");
                   Label labelinfo6= new Label(4, 28, "具体内容");
                   
                   ws.addCell(labelM_name);
                   ws.addCell(labelC_name);
                   ws.addCell(labelC_phone);
                   ws.addCell(labelRecord);
                   
                   ws.addCell(labeldistrictinfo);
                   ws.addCell(labeldinfo1);
                   
                   ws.addCell(labelquery);
                   ws.addCell(labeldinfo2);
                   
                   ws.addCell(labelmedicinequery);
                   ws.addCell(labeldinfo3);
                   
                   ws.addCell(labelpurchase);
                   ws.addCell(labeldinfo4);
                   
                   ws.addCell(labelcomplain);
                   ws.addCell(labelCo_info);
                   ws.addCell(labelCo_department);
                   ws.addCell(labelCo_dealer);
                   ws.addCell(labelCo_category);
                   ws.addCell(labelCo_deliver);
                   ws.addCell(labelCo_replay);
                   ws.addCell(labelCo_result);
                   ws.addCell(labelCo_replenish);
                   
                   ws.addCell(labeldepartment);
                   ws.addCell(labeldinfo5);
              
                   ws.addCell(labeldreaction);
                   ws.addCell(labelRe_name);
                   ws.addCell(labelRe_sex);
                   ws.addCell(labelRe_age);
                   ws.addCell(labelRe_nation);
                   ws.addCell(labelRe_weight);
                   ws.addCell(labelRe_disease);
                   ws.addCell(labelRe_reactionN);
                   ws.addCell(labelRe_reactionD);
                   ws.addCell(labelRe_timeM);
                   ws.addCell(labelRe_use);
                   ws.addCell(labelRe_time);
                   ws.addCell(labelRe_result);
                   ws.addCell(labelRe_number);
                   ws.addCell(labelRe_merge);
                   ws.addCell(labelRe_family);
                   ws.addCell(labelRe_reactionP);
                   ws.addCell(labelRe_others);
                   ws.addCell(labelRe_hospital);
                   ws.addCell(labelRe_case);
                   ws.addCell(labelRe_phone);
                   
                   ws.addCell(labelothers);
                   ws.addCell(labelinfo6);
                   
                   
                   
                   Label labelM_name2= new Label(0, 1, allClient2.get(0).getM_name());
                   Label labelC_name2= new Label(1,1, allClient2.get(0).getC_name());
                   Label labelC_phone2= new Label(2, 1, allClient2.get(0).getC_phone());
                   
             
                   Label labeldinfo12= new Label(5, 1, allClient2.get(0).getDi_info());

                   Label labeldinfo22= new Label(5, 2, allClient2.get(0).getQ_info());
                
                   Label labeldinfo32= new Label(5, 3, allClient2.get(0).getP_info());

                   Label labeldinfo42= new Label(5, 4, allClient2.get(0).getMQ_info());
                   

                   Label labelCo_info2= new Label(5, 5, allClient2.get(0).getCo_info());
                   Label labelCo_department2= new Label(5, 6, allClient2.get(0).getCo_department());                 
                   Label labelCo_dealer2= new Label(5, 7, allClient2.get(0).getCo_dealer());                
                   Label labelCo_category2= new Label(5, 8, allClient2.get(0).getCo_category());
                   Label labelCo_deliver2= new Label(5, 9, allClient2.get(0).getCo_deliver());
                   Label labelCo_replay2= new Label(5, 9, allClient2.get(0).getCo_replay());                   
                   Label labelCo_result2= new Label(5, 10, allClient2.get(0).getCo_result());
                   Label labelCo_replenish2= new Label(5, 11, allClient2.get(0).getCo_replenish());
                
                   Label labeldinfo52= new Label(5, 12, allClient2.get(0).getDa_info());

                      
                   Label labelRe_name2= new Label(5, 14, allClient2.get(0).getRe_name());
                   Label labelRe_sex2= new Label(7, 14, allClient2.get(0).getRe_sex());               
                   Label labelRe_age2= new Label(5, 15, allClient2.get(0).getRe_age());                   
                   Label labelRe_nation2= new Label(7, 15, allClient2.get(0).getRe_nation());
                   Label labelRe_weight2= new Label(5, 16, allClient2.get(0).getRe_weight());
                   Label labelRe_disease2= new Label(7, 16, allClient2.get(0).getRe_disease());                   
                   Label labelRe_reactionN2= new Label(5, 17, allClient2.get(0).getRe_reactionN());
                   Label labelRe_reactionD2= new Label(5, 18, allClient2.get(0).getRe_reactionD());                
                   Label labelRe_timeM2= new Label(5, 19, allClient2.get(0).getRe_timeM());
                   Label labelRe_use2= new Label(5, 20, allClient2.get(0).getRe_use());
                   Label labelRe_time2= new Label(5, 21, allClient2.get(0).getRe_time());
                  
                   Label labelRe_result2= new Label(5, 22, allClient2.get(0).getRe_result());
                   Label labelRe_number2= new Label(5, 23, allClient2.get(0).getRe_number());
                   Label labelRe_merge2= new Label(5, 24, allClient2.get(0).getRe_merge());
                   Label labelRe_family2= new Label(5, 25, allClient2.get(0).getRe_family());
                   Label labelRe_reactionP2= new Label(7, 25, allClient2.get(0).getRe_reactionP());                   
                   Label labelRe_others2= new Label(5, 26, allClient2.get(0).getRe_others());
                   Label labelRe_hospital2= new Label(7, 26, allClient2.get(0).getRe_hospital());
                   Label labelRe_case2= new Label(5, 27, allClient2.get(0).getRe_case());
                   Label labelRe_phone2= new Label(7, 27, allClient2.get(0).getRe_phone());   
                   
 
                   Label labelinfo62= new Label(5, 28, allClient2.get(0).getO_info());
                   
  
                   ws.addCell(labelM_name2);
                   ws.addCell(labelC_name2);
                   ws.addCell(labelC_phone2);
                 
                   
           
                   ws.addCell(labeldinfo12);
                   
           
                   ws.addCell(labeldinfo22);
                   
                
                   ws.addCell(labeldinfo32);
                   
                 
                   ws.addCell(labeldinfo42);
                   
                   
                   ws.addCell(labelCo_info2);
                   ws.addCell(labelCo_department2);
                   ws.addCell(labelCo_dealer2);
                   ws.addCell(labelCo_category2);
                   ws.addCell(labelCo_deliver2);
                   ws.addCell(labelCo_replay2);
                   ws.addCell(labelCo_result2);
                   ws.addCell(labelCo_replenish2);
                   
                   
                   ws.addCell(labeldinfo52);
              
                 
                   ws.addCell(labelRe_name2);
                   ws.addCell(labelRe_sex2);
                   ws.addCell(labelRe_age2);
                   ws.addCell(labelRe_nation2);
                   ws.addCell(labelRe_weight2);
                   ws.addCell(labelRe_disease2);
                   ws.addCell(labelRe_reactionN2);
                   ws.addCell(labelRe_reactionD2);
                   ws.addCell(labelRe_timeM2);
                   ws.addCell(labelRe_use2);
                   ws.addCell(labelRe_time2);
                   ws.addCell(labelRe_result2);
                   ws.addCell(labelRe_number2);
                   ws.addCell(labelRe_merge2);
                   ws.addCell(labelRe_family2);
                   ws.addCell(labelRe_reactionP2);
                   ws.addCell(labelRe_others2);
                   ws.addCell(labelRe_hospital2);
                   ws.addCell(labelRe_case2);
                   ws.addCell(labelRe_phone2);

                   ws.addCell(labelinfo62);
                       
                      
                   
                 
                  //写进文档
                   wwb.write();
                  // 关闭Excel工作簿对象
                   wwb.close();
                 
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
            
            return SUCCESS;
        }
}