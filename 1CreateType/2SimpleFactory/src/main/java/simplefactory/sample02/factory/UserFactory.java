package simplefactory.sample02.factory;

import simplefactory.sample02.user.Administrator;
import simplefactory.sample02.user.Employee;
import simplefactory.sample02.user.Manager;
import simplefactory.sample02.user.User;

public class UserFactory {
    public static User getUser(int permission) {
        if (0 == permission) {
            return new Employee();
        } else if (1 == permission) {
            return new Manager();
        } else if (2 == permission) {
            return new Administrator();
        } else {
            return null;
        }
    }
}
