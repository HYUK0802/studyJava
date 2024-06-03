package Chapter3.ch13.domain.userInfo.dao;

import Chapter3.ch13.domain.userInfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
