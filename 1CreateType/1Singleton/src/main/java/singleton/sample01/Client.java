package singleton.sample01;

public class Client {
    public static void main(String a[]) {
        IdentityCardNo identityCardNo1 = IdentityCardNo.getInstance();
        IdentityCardNo identityCardNo2 = IdentityCardNo.getInstance();
        
        System.out.println("------------------------------------------");
        System.out.println("身份证号码是否一致：" + (identityCardNo1 == identityCardNo2));

        String str1 = identityCardNo1.getIdentityCardNo();
        String str2 = identityCardNo1.getIdentityCardNo();
        
        System.out.println("------------------------------------------");
        System.out.println("第一次号码：" + str1);
        System.out.println("第二次号码：" + str2);
        
        System.out.println("------------------------------------------");
        System.out.println("内容是否相等：" + str1.equalsIgnoreCase(str2));
        System.out.println("是否是相同对象：" + (str1 == str2));
    }
}
