package com.structural.designpatterns.facade;

import java.sql.Connection;

public class FacadeHelper {
	public static void generateReport(DBTypes dbType, ReportTypes reportType,
			String tableName) {
		Connection con = null;
		switch (dbType) {
		case MYSQL:
			con = MySQLHelper.getMySqlDBConnection();
			MySQLHelper mySqlHelper = new MySQLHelper();
			switch (reportType) {
			case HTML:
				mySqlHelper.generateMySqlHTMLReport(tableName, con);
				break;
			case PDF:
				mySqlHelper.generateMySqlPDFReport(tableName, con);
				break;
			}
			break;
		case ORACLE:
			con = OracleHelper.getOracleDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			switch (reportType) {
			case HTML:
				oracleHelper.generateOracleHTMLReport(tableName, con);
				break;
			case PDF:
				oracleHelper.generateOraclePDFReport(tableName, con);
				break;
			}
			break;
		}

	}

	public static enum DBTypes {
		MYSQL, ORACLE;
	}

	public static enum ReportTypes {
		HTML, PDF;
	}

	public static void main(String[] args) {
		String tableName = "Employee";

		// generating MySql HTML report and Oracle PDF report without using
		// Facade
		Connection con = MySQLHelper.getMySqlDBConnection();
		MySQLHelper mySqlHelper = new MySQLHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);

		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);

		// generating MySql HTML report and Oracle PDF report using Facade
		FacadeHelper.generateReport(FacadeHelper.DBTypes.MYSQL,
				FacadeHelper.ReportTypes.HTML, tableName);
		FacadeHelper.generateReport(FacadeHelper.DBTypes.ORACLE,
				FacadeHelper.ReportTypes.PDF, tableName);

	}
}
