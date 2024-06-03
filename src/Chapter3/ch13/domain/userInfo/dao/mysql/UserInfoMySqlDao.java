package Chapter3.ch13.domain.userInfo.dao.mysql;

import Chapter3.ch13.domain.userInfo.UserInfo;
import Chapter3.ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySql DB userID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MySql DB userID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete into MySql DB userID = " + userInfo.getUserId());
    }
}
