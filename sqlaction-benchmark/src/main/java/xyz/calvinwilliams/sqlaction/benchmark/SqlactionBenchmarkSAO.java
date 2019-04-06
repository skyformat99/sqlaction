// This file generated by sqlaction v0.0.8.0

package xyz.calvinwilliams.sqlaction.benchmark;

import java.math.*;
import java.util.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SqlactionBenchmarkSAO {

	int				id ; // 编号
	String			name ; // 英文名
	String			nameCn ; // 中文名
	BigDecimal		salary ; // 薪水
	java.sql.Date	birthday ; // 生日

	int				_count_ ; // defining for 'SELECT COUNT(*)'

	// INSERT INTO sqlaction_benchmark (name,name_cn,salary,birthday) VALUES (?,?,?,?)
	public static int INSERT_INTO_sqlaction_benchmark( Connection conn, SqlactionBenchmarkSAO sqlactionBenchmark ) throws Exception {
		PreparedStatement prestmt = conn.prepareStatement("INSERT INTO sqlaction_benchmark (name,name_cn,salary,birthday) VALUES (?,?,?,?)") ;
		prestmt.setString( 1, sqlactionBenchmark.name );
		prestmt.setString( 2, sqlactionBenchmark.nameCn );
		prestmt.setBigDecimal( 3, sqlactionBenchmark.salary );
		prestmt.setDate( 4, sqlactionBenchmark.birthday );
		return prestmt.executeUpdate() ;
	}

	// UPDATE sqlaction_benchmark SET salary=? WHERE name=?
	public static int UPDATE_sqlaction_benchmark_SET_salary_E_WHERE_name_E_( Connection conn, BigDecimal _1_salary_ForSetInput, String _1_name_ForWhereInput ) throws Exception {
		PreparedStatement prestmt = conn.prepareStatement("UPDATE sqlaction_benchmark SET salary=? WHERE name=?") ;
		prestmt.setBigDecimal( 1, _1_salary_ForSetInput );
		prestmt.setString( 2, _1_name_ForWhereInput );
		return prestmt.executeUpdate() ;
	}

	// SELECT * FROM sqlaction_benchmark WHERE name=?
	public static int SELECT_ALL_FROM_sqlaction_benchmark_WHERE_name_E_( Connection conn, List<SqlactionBenchmarkSAO> sqlactionBenchmarkListForSelectOutput, String _1_name ) throws Exception {
		PreparedStatement prestmt = conn.prepareStatement("SELECT * FROM sqlaction_benchmark WHERE name=?") ;
		prestmt.setString( 1, _1_name );
		ResultSet rs = prestmt.executeQuery() ;
		while( rs.next() ) {
			SqlactionBenchmarkSAO sqlactionBenchmark = new SqlactionBenchmarkSAO() ;
			sqlactionBenchmark.id = rs.getInt( 1 ) ;
			sqlactionBenchmark.name = rs.getString( 2 ) ;
			sqlactionBenchmark.nameCn = rs.getString( 3 ) ;
			sqlactionBenchmark.salary = rs.getBigDecimal( 4 ) ;
			sqlactionBenchmark.birthday = rs.getDate( 5 ) ;
			sqlactionBenchmarkListForSelectOutput.add(sqlactionBenchmark) ;
		}
		return sqlactionBenchmarkListForSelectOutput.size();
	}

	// SELECT * FROM sqlaction_benchmark
	public static int SELECT_ALL_FROM_sqlaction_benchmark( Connection conn, List<SqlactionBenchmarkSAO> sqlactionBenchmarkListForSelectOutput ) throws Exception {
		Statement stmt = conn.createStatement() ;
		ResultSet rs = stmt.executeQuery("SELECT * FROM sqlaction_benchmark") ;
		while( rs.next() ) {
			SqlactionBenchmarkSAO sqlactionBenchmark = new SqlactionBenchmarkSAO() ;
			sqlactionBenchmark.id = rs.getInt( 1 ) ;
			sqlactionBenchmark.name = rs.getString( 2 ) ;
			sqlactionBenchmark.nameCn = rs.getString( 3 ) ;
			sqlactionBenchmark.salary = rs.getBigDecimal( 4 ) ;
			sqlactionBenchmark.birthday = rs.getDate( 5 ) ;
			sqlactionBenchmarkListForSelectOutput.add(sqlactionBenchmark) ;
		}
		return sqlactionBenchmarkListForSelectOutput.size();
	}

	// DELETE FROM sqlaction_benchmark WHERE name=?
	public static int DELETE_FROM_sqlaction_benchmark_WHERE_name_E_( Connection conn, String _1_name ) throws Exception {
		PreparedStatement prestmt = conn.prepareStatement("DELETE FROM sqlaction_benchmark WHERE name=?") ;
		prestmt.setString( 1, _1_name );
		return prestmt.executeUpdate() ;
	}

	// DELETE FROM sqlaction_benchmark
	public static int DELETE_FROM_sqlaction_benchmark( Connection conn ) throws Exception {
		PreparedStatement prestmt = conn.prepareStatement("DELETE FROM sqlaction_benchmark") ;
		return prestmt.executeUpdate() ;
	}
}
