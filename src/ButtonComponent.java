import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonComponent extends JFrame {
    ButtonComponent() throws Exception{
        initiate();
    }

    // Initalization
    JPanel panel;
    JButton up,down;
    JLabel text;

    private void initiate() {

        setTitle("Example of Button Listnner");
        setSize(200,130);
        panel=new JPanel();
        panel.setLayout(new FlowLayout());
        up=new JButton("Up");
        down=new JButton("Down");

        text=new JLabel("Default text");

        up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("This is Up");
            }
        });
        down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("This is Down");
            }
        });



        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.add(up);panel.add(down);panel.add(text);
        add(panel);
    }
}
