import dao.UsertableDao;
import po.UsertablePO;

import java.util.List;

/**
 * Created by AT on 2018/4/5.
 */
public class TestSelect {

    public static void main(String[] args) {

        UsertableDao usertableDao = new UsertableDao();

        try {
            List<UsertablePO> usertablePOList = usertableDao.selectall();
            for(UsertablePO usertablePO: usertablePOList){
                System.out.println(usertablePO.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
