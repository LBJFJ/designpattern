package observer.sample02.observer;

import java.util.EventListener;
import observer.sample02.eventobject.LoginEvent;

// Abstract Observer
public interface LoginEventListener extends EventListener {
    public void validateLogin(LoginEvent event);
}
