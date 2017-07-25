package com.zensar.lms.dao;

import com.zensar.lms.bean.LicenseBean;
import com.zensar.lms.connection.DBUtil;
import com.zensar.lms.daointerface.DAOInterface;
import java.sql.*;

public class DAOClass implements DAOInterface {

	Connection conn;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	String sqlpre;
	int rows=0;
	public DAOClass() throws SQLException {

		conn=DBUtil.getMyConnection();
		System.out.println("test");
	}


	@Override
	public boolean insert(LicenseBean lb1) {


		try{
			sqlpre="INSERT INTO sample_details_1 VALUES (lno.nextval,?,?,?,?,?,?,?,?,?,?)";
			pst=conn.prepareStatement(sqlpre);
			//pst.setInt(1,lb1.getLicenseID());
			pst.setString(1,lb1.getLicenseType());
			pst.setString(2,lb1.getUserName());
			pst.setString(3,lb1.getUserAddress());
			pst.setString(4,lb1.getUserDOB());
			pst.setString(5,lb1.getUserBlood());
			pst.setString(6,lb1.getUserPlace());
			pst.setString(7,lb1.getUserFather());
			pst.setString(8,lb1.getIssueDate());
			pst.setString(9,lb1.getExpiryDate());
			pst.setLong(10,lb1.getUserContact());
			rows=pst.executeUpdate();
			System.out.println("Rows impacted: "+rows+".");
		}
		catch(Exception e1)
		{
			System.out.println("IN DAOClass.."+e1);
		}
		if(rows>0)
			return true;
		else
			return false;

	}


	@Override
	public boolean modify(LicenseBean lb1) {

		try {
			sqlpre= "UPDATE sample_details_1 SET address=?,contactno=? WHERE licenseid=?";
			pst=conn.prepareStatement(sqlpre);
			pst.setInt(3,lb1.getLicenseID());
			pst.setString(1,lb1.getUserAddress());
			pst.setLong(2,lb1.getUserContact());
			rows=pst.executeUpdate();
			System.out.println("Rows impacted: "+rows+".");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		if(rows>0)
			return true;
		else
			return false;
	}


	@Override
	public boolean delete(LicenseBean lb1) {
		try {
			sqlpre= "DELETE FROM sample_details_1 WHERE licenseid=?";
			pst=conn.prepareStatement(sqlpre);
			pst.setInt(1,lb1.getLicenseID());
			rows=pst.executeUpdate();
			System.out.println("Rows deleted: "+rows+".");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		if(rows>0)
			return true;
		else
			return false;
	}


	@Override
	public ResultSet view(LicenseBean lb1) {
		ResultSet rs1=null;
		try {
			sqlpre= "SELECT * FROM sample_details_1 WHERE licenseid=?";
			pst=conn.prepareStatement(sqlpre);
			pst.setInt(1,lb1.getLicenseID());
			rs1=pst.executeQuery();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return rs1;
	}




}

