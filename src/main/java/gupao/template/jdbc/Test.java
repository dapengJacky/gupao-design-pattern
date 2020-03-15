package gupao.template.jdbc;

import gupao.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class Test {

    public static void main(String[] args) {
        MemberDao dao = new MemberDao(null);
        List<?> resultSet = dao.selectAll();
    }
}
