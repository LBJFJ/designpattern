package composite.sample02;

public class Client {

    public static void main(String[] args) {
        // 文件夹中有三个文件
        Folder folder1 = new Folder("folder1");
        folder1.add(new File("file1"));
        folder1.add(new File("file2"));
        folder1.add(new File("file3"));

        // 子文件中也有三个文件
        Folder folder11 = new Folder("subfolder1");
        folder11.add(new File("file11"));
        folder11.add(new File("file12"));
        folder11.add(new File("file13"));

        // 子文件夹放到文件夹中
        folder1.add(folder11);

        // 显示folder1内容
        folder1.display();
    }

}
