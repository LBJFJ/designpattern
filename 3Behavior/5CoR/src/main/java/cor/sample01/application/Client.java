package cor.sample01.application;

import cor.sample01.director.Director;
import cor.sample01.handler.GeneralManager;
import cor.sample01.handler.Leader;
import cor.sample01.handler.Manager;
import cor.sample01.handler.ViceGeneralManager;
import cor.sample01.request.LeaveRequest;

public class Client {
    public static void main(String args[]) {
        Leader objDirector = new Director("王明");
        Leader objManager = new Manager("赵强");
        Leader objGeneralManager = new GeneralManager("李波");
        Leader objViceGeneralManager = new ViceGeneralManager("肖红");

        objDirector.setSuccessor(objManager);
        objManager.setSuccessor(objViceGeneralManager);
        objViceGeneralManager.setSuccessor(objGeneralManager);

        LeaveRequest lr1 = new LeaveRequest("张三", 2);
        objDirector.handleRequest(lr1);

        LeaveRequest lr2 = new LeaveRequest("李四", 5);
        objDirector.handleRequest(lr2);

        LeaveRequest lr3 = new LeaveRequest("王五", 15);
        objDirector.handleRequest(lr3);

        LeaveRequest lr4 = new LeaveRequest("赵六", 25);
        objDirector.handleRequest(lr4);

        LeaveRequest lr5 = new LeaveRequest("硅胶七", 35);
        objDirector.handleRequest(lr5);
    }
}
