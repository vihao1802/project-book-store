package form1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.event.AncestorListener;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;

public class menu_west extends JPanel implements MouseListener, ActionListener {
    menu obj;
    JLabel title;

    String[] list = { "Function group", "Chuc nang 2", "Chuc nang 3", "Chuc nang 4" };
    Integer[] list2 = new Integer[list.length];
    JLabel[] lab_menu = new JLabel[list.length];
    public static JFrame temp1=null;
    int temp=0;
    public menu_west(menu obj) {
        this.obj=obj;
        init();
    }
    public void change_panel(String s){

        if(s.equalsIgnoreCase("FUnction group")){
                group_function pan_grp_fun=new group_function(obj);
                JPanel p1=new JPanel();
                pan_grp_fun.setBounds(0,0,1000,700);
                p1.setBackground(Color.red);
                obj.pan_center.removeAll();
                obj.pan_center.add(pan_grp_fun);
                obj.pan_center.repaint();
                obj.pan_center.revalidate();

        }
    }
    private void init() {
        this.setPreferredSize(new Dimension(300, 700));
        // this.setBackground(new Color(50,168, 76));
        this.setBackground(Color.black);
        this.setLayout(null);
        // set title cho panel chuc nang
        title = new JLabel("Menu");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", 3, 38));
        title.setForeground(Color.white);
        title.setBounds(10, 20, 280, 40);
        // title.setOpaque(true);
        // title.setBackground(Color.gray);
        this.add(title);
        // set panel chuc nag
        // 50 168 76
        JPanel pan_menu = new JPanel();
        pan_menu.setBackground(Color.black);
        pan_menu.setBounds(0, 90, 300, 450);
        pan_menu.setLayout(new FlowLayout(0, 1, 5));
        this.add(pan_menu);
        // set cac menu chuc nang
        for (int i = 0; i < list.length; i++) {
            list2[i] = 0;
            lab_menu[i] = new JLabel(list[i]);
            lab_menu[i].setHorizontalAlignment(SwingConstants.CENTER);
            // lab_menu[i].setFont(new Font("Segoe UI",0,24));
            lab_menu[i].setPreferredSize(new Dimension(300, 50));
            lab_menu[i].setFont(new Font("Segoe UI", 0, 20));
            lab_menu[i].setForeground(Color.white);
            lab_menu[i].setOpaque(true);
            lab_menu[i].setBackground(Color.black);
            // lab_menu[i].setBorder(BorderFactory.createLineBorder(Color.black));
            lab_menu[i].addMouseListener(this);
            // lab_menu[i].addActionListener(new ActionListener());
            pan_menu.add(lab_menu[i]);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        for (int i = 0; i < list.length; i++) {
            if (e.getSource() == lab_menu[i]) {
                change_panel(lab_menu[i].getText());
            }

        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        for (int i = 0; i < list.length; i++) {
            if (e.getSource() == lab_menu[i]) {
                lab_menu[i].setBackground(Color.white);
                lab_menu[i].setFont(new Font("Segoe UI", 1, 30));
                lab_menu[i].setForeground(Color.black);
            }

        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        for (int i = 0; i < list.length; i++) {
            if (list2[i] == 0) {
                lab_menu[i].setBackground(Color.black);
                lab_menu[i].setForeground(Color.white);
                lab_menu[i].setFont(new Font("Segoe UI", 0, 20));
            } else {
                lab_menu[i].setBackground(new Color(54, 54, 54));
                lab_menu[i].setFont(new Font("Segoe UI", 1, 30));
                lab_menu[i].setForeground(Color.white);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
