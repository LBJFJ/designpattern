package simplefactory.sample02.application;

import simplefactory.sample02.dao.UserDAO;
import simplefactory.sample02.factory.UserFactory;
import simplefactory.sample02.user.User;

public class Client {
    public static void main(String args[]) {
        try {
            UserDAO userDao = new UserDAO();
            int permission = userDao.findPermission("zhangsan", "123456");
            
            User user = UserFactory.getUser(permission);
            user.sameOperation();
            user.diffOperation();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
