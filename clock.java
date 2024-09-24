import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(true);

        timeFormat = new SimpleDateFormat("HH:mm:ss");

        timeLabel = new JLabel();

        this.add(timeLabel);
        this.setVisible(true);

        timeLabel.setFont(new Font("Sans Serif", Font.PLAIN, 50));

        Timer timer = new Timer(1000, e -> {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
        });
        timer.start();
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
