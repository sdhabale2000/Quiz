package com.Quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
public class GetQuestions {

	GetConnection get=new GetConnection();
	Connection con=null;
	PreparedStatement ps=null;
	HashMap<String, String> getdata() {
		 HashMap<String, String> list=new HashMap<>();
	
		try {
			con=get.getConnection();
			
			
			
			ps=con.prepareStatement("select * from questions");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				list.put(("\n" +rs.getString(2)+"\n"+rs.getString(3)+"\n"+rs.getString(4)+"\n"+rs.getString(5)+"\n"+rs.getString(6)+"\n") ,rs.getString(7));
			
			
			}


			//System.out.println(list);
			
			
		} catch (Exception e) {
			System.out.println(e);	
			
		}
		return list;
		
	
	}
	}

	
	
	//	public static void main(String[] args) {
//		GetQuestions questions=new GetQuestions();
//		questions.getdata();
//	}
//}
