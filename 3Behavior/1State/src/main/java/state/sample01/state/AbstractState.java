package state.sample01.state;

import state.sample01.context.ForumAccount;

public abstract class AbstractState {
    protected ForumAccount forumAccount;
    protected int point;
    protected String stateName;

    public abstract void checkState(int score);

    public void downloadFile(int score) {
        System.out.println(forumAccount.getName() + "下载文件，扣除" + score + "积分。");
        this.point -= score;
        checkState(score);
        System.out.println("剩余积分为：" + this.point + "，当前级别为：" + forumAccount.getState().stateName + "。");
    }

    public void writeNote(int score) {
        System.out.println(forumAccount.getName() + "发布留言" + "，增加" + score + "积分。");
        this.point += score;
        checkState(score);
        System.out.println("剩余积分为：" + this.point + "，当前级别为：" + forumAccount.getState().stateName + "。");
    }

    public void replyNote(int score) {
        System.out.println(forumAccount.getName() + "回复留言，增加" + score + "积分。");
        this.point += score;
        checkState(score);
        System.out.println("剩余积分为：" + this.point + "，当前级别为：" + forumAccount.getState().stateName + "。");
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return (this.point);
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return (this.stateName);
    }
}
