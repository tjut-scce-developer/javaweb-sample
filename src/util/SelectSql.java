package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelectSql {
	
	DBTool dbTool = new DBTool();
	Connection connection = dbTool.getConnection();
	
	private String[] selectList;
	private String[] tableList;
	private String[] conditionList;
	
	private String select;
	private String table;
	private String condition;

	private String unionSql;
	private String andOr;

	public SelectSql() {
		andOr="AND";
	}

	//执行查询语句
	public ResultSet execSelect(String sql) throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		return resultSet;
	}

	/**
	 * 返回查询所有的sql
	 * @param tablename
	 * @return
	 */
	public String getSelectAllSql(String tablename){
		return "SELECT * FROM "+tablename;
	}
	
	public String getSelectSql(){
		String selectop;
		String tablename;
		String condition;
		if(this.selectList!=null){
			selectop=String.join(",", this.selectList);
		}else{
			selectop=this.select;
		}
		
		if(this.tableList!=null){
			tablename=String.join(",", this.tableList);
		}else{
			tablename=this.table;
		}
		
		if(this.conditionList!=null){
			condition=String.join(" "+andOr+" ", this.conditionList);
		}else{
			condition=this.condition;
		}
		
		return "SELECT "+selectop+" FROM "+tablename+" WHERE "+condition;
	}

	//多条sql语句
	public String getSelectUnionSql(List<String> sqlList) {
		return String.join(" UNION ",sqlList);
	}


	/*get、set*/

	public String[] getSelectList() {
		return selectList;
	}

	public SelectSql setSelectList(String[] selectList) {
		this.selectList = selectList;
		return this;
	}

	public String[] getTableList() {
		return tableList;
	}

	public SelectSql setTableList(String[] tableList) {
		this.tableList = tableList;
		return this;
	}

	public String[] getConditionList() {
		return conditionList;
	}

	public SelectSql setConditionList(String[] conditionList) {
		this.conditionList = conditionList;
		return this;
	}

	public String getSelect() {
		return select;
	}

	public SelectSql setSelect(String select) {
		this.select = select;
		return this;
	}

	public String getTable() {
		return table;
	}

	public SelectSql setTable(String table) {
		this.table = table;
		return this;
	}

	public String getCondition() {
		return condition;
	}

	public SelectSql setCondition(String condition) {
		this.condition = condition;
		return this;
	}

	public String getUnionSql() {
		return unionSql;
	}

	public SelectSql setUnionSql(String unionSql) {
		this.unionSql = unionSql;
		return this;
	}

	public String getAndOr() {
		return andOr;
	}

	public SelectSql setAndOr(String andOr) {
		this.andOr = andOr;
		return this;
	}

//	/* 全表查询 */
//	public SelectSql setTableAllCondition(String condition) throws Exception {
//		if(this.table==null){
//			return null;
//		}
//		MysqlTool mysqlTool=new MysqlTool();
//		List<String> columnList=mysqlTool.getTableColumnsByTableName(MysqlTool.DATABASENAME,this.table);
//		Map<String,Object> map=new HashMap<>();
//		for(String col:columnList){
//			map.put(col,condition);
//		}
//		this.conditionList=MapTool.returnLikeStringByMap(map);
//		return this;
//	}

}
