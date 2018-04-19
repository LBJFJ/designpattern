package state.sample01.state;

public class MiddleState extends AbstractState {
    public MiddleState(AbstractState state) {
        this.forumAccount = state.forumAccount;
        this.point = state.getPoint();
        this.stateName = "高手";
    }

    @Override
    public void writeNote(int score) {
        System.out.println(forumAccount.getName() + "发布留言" + "，增加" + score + "*2个积分。");
        this.point += score * 2;
        checkState(score);
        System.out.println("剩余积分为：" + this.point + "，当前级别为：" + forumAccount.getState().stateName + "。");
    }

    @Override
    public void checkState(int score) {
        if (point >= 1000) {
            forumAccount.setState(new HighState(this));
        } else if (point < 0) {
            System.out.println("余额不足，文件下载失败！");
            this.point += score;
        } else if (point <= 100) {
            forumAccount.setState(new PrimaryState(this));
        }
    }
}
