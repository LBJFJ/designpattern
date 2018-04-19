package state.sample01.state;

import state.sample01.context.ForumAccount;

public class PrimaryState extends AbstractState {
    public PrimaryState(AbstractState state) {
        this.forumAccount = state.forumAccount;
        this.point = state.getPoint();
        this.stateName = "新手";
    }

    public PrimaryState(ForumAccount acc) {
        this.point = 0;
        this.forumAccount = acc;
        this.stateName = "新手";
    }

    @Override
    public void downloadFile(int score) {
        System.out.println("对不起，" + forumAccount.getName() + "，您没有下载文件的权限！");
    }

    @Override
    public void checkState(int score) {
        if (point >= 1000) {
            forumAccount.setState(new HighState(this));
        } else if (point >= 100) {
            forumAccount.setState(new MiddleState(this));
        }
    }
}
