package singleton.other;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class MainClass extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JButton button;
    private JDesktopPane desktopPane;
    private SubFrame iFrame = null;

    public static void main(String[] args) {
        new MainClass();
    }
    
    public MainClass() {
        super("主窗体");
        Container container = this.getContentPane();
        container.setLayout(new BorderLayout());

        button = new JButton("点击创建一个内部窗体");
        button.addActionListener(new BtListener());
        container.add(button, BorderLayout.SOUTH);

        desktopPane = new JDesktopPane(); // 创建desktopPane
        container.add(desktopPane);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.show();
    }

    class BtListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (iFrame != null) {
                desktopPane.remove(iFrame);
            }
            
            iFrame = SubFrame.getFrame();
            desktopPane.add(iFrame);
        }
    }
}
