package dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import po.UsertablePO;
import util.DBTool;
import util.DatabaseTableNames;
import util.JsonTool;
import util.SelectSql;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by AT on 2018/4/5.
 */
public class UsertableDao {

    private DBTool dbTool = new DBTool();
    private Connection connection = dbTool.getConnection();
    private ObjectMapper objectMapper = new ObjectMapper();

    public List<UsertablePO> selectall() throws Exception {
        SelectSql selectSql = new SelectSql();
        String sql = selectSql.getSelectAllSql(DatabaseTableNames._usertable);
        ResultSet resultSet = selectSql.execSelect(sql);
        String objectJson = JsonTool.resultSetToJson(resultSet);
        return objectMapper.readValue(objectJson, new TypeReference<List<UsertablePO>>() {
        });
    }

    public UsertablePO seletcByUsername(String username) throws SQLException, IOException {
        SelectSql selectSql = new SelectSql();
        selectSql.setSelect("*").setTable(DatabaseTableNames._usertable).setCondition("username ='"+username+"'");
        String sql = selectSql.getSelectSql();
        ResultSet resultSet = selectSql.execSelect(sql);
        String usertablePOListJson = JsonTool.resultSetToJson(resultSet);
        List<UsertablePO> usertablePOList = objectMapper.readValue(usertablePOListJson, new TypeReference<List<UsertablePO>>() {
        });
        return usertablePOList.get(0);

    }


}
