package com.zensar.lms.daointerface;

import java.sql.ResultSet;

import com.zensar.lms.bean.LicenseBean;

public interface DAOInterface {

	public boolean insert(LicenseBean lb1);
	public boolean modify(LicenseBean lb1);
	public boolean delete(LicenseBean lb1);
	public ResultSet view(LicenseBean lb1);
}
