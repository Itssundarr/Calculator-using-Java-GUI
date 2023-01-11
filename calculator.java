import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
public class calculator {
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Calculator");

        Font fo = new Font(Font.SANS_SERIF,Font.PLAIN,20);
        Font ff = new Font(Font.SANS_SERIF,Font.PLAIN,23);
        JTextField t = new JTextField();
        t.setFont(ff);
        t.setBounds(50,50,250,30);
        f.add(t);

        JButton n7 = new JButton("7");
        n7.setBounds(50,100,45,45);
        n7.setFont(fo);
        f.add(n7);

        n7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+n7.getText();
                t.setText(n);
            }
        });

        JButton n8 = new JButton("8");
        n8.setBounds(100,100,45,45);
        n8.setFont(fo);
        f.add(n8);

        n8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+n8.getText();
                t.setText(n);
            }
        });

        JButton n9 = new JButton("9");
        n9.setBounds(150,100,45,45);
        n9.setFont(fo);
        f.add(n9);

        n9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+n9.getText();
                t.setText(n);
            }
        });

        JButton n4 = new JButton("4");
        n4.setBounds(50,150,45,45);
        n4.setFont(fo);
        f.add(n4);

        n4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+n4.getText();
                t.setText(n);
            }
        });

        JButton n5 = new JButton("5");
        n5.setBounds(100,150,45,45);
        n5.setFont(fo);
        f.add(n5);

        n5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+n5.getText();
                t.setText(n);
            }
        });

        JButton n6 = new JButton("6");
        n6.setBounds(150,150,45,45);
        n6.setFont(fo);
        f.add(n6);

        n6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+n6.getText();
                t.setText(n);
            }
        });

        JButton n1 = new JButton("1");
        n1.setBounds(50,200,45,45);
        n1.setFont(fo);
        f.add(n1);

        n1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+n1.getText();
                t.setText(n);
            }
        });

        JButton n2 = new JButton("2");
        n2.setBounds(100,200,45,45);
        n2.setFont(fo);
        f.add(n2);

        n2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+n2.getText();
                t.setText(n);
            }
        });

        JButton n3 = new JButton("3");
        n3.setBounds(150,200,45,45);
        n3.setFont(fo);
        f.add(n3);

        n3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+n3.getText();
                t.setText(n);
            }
        });

        JButton n0 = new JButton("0");
        n0.setBounds(50,250,145,45);
        n0.setFont(fo);
        f.add(n0);

        n0.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+n0.getText();
                t.setText(n);
            }
        });

        JButton clear = new JButton("c");
        clear.setBounds(230,102,50,45);
        clear.setFont(fo);
        f.add(clear);

        clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+clear.getText();
                t.setText("");
            }
        });

        JButton plus = new JButton("+");
        plus.setBounds(230,150,50,45);
        plus.setFont(fo);
        f.add(plus);

        plus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+plus.getText();
                t.setText(n);
            }
        });

        JButton minus = new JButton("-");
        minus.setBounds(282,150,50,45);
        minus.setFont(fo);
        f.add(minus);

        minus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+minus.getText();
                t.setText(n);
            }
        });

        JButton mul = new JButton("x");
        mul.setBounds(230,200,50,45);
        mul.setFont(fo);
        f.add(mul);

        mul.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+mul.getText();
                t.setText(n);
            }
        });

        JButton div = new JButton("/");
        div.setBounds(282,200,50,45);
        div.setFont(fo);
        f.add(div);

        div.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText()+div.getText();
                t.setText(n);
            }
        });

        JButton eq = new JButton("=");
        eq.setBounds(230,252,102,45);
        eq.setFont(fo);
        f.add(eq);

        eq.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String n = t.getText();

                if(n.contains("+"))
                {
                    String[] arr = n.split("\\+");
                    Double op1 = Double.parseDouble
                    (arr[0]);
                    Double op2 = Double.parseDouble(arr[1]);
                    Double res = op1+op2;
                    t.setText(Double.toString(res));
                }

                else if(n.contains("-"))
                {
                    String[] arr = n.split("-");
                    Double op1 = Double.parseDouble(arr[0]);
                    Double op2 = Double.parseDouble(arr[1]);
                    Double res = op1-op2;
                    t.setText(Double.toString(res));
                }

                else if(n.contains("x"))
                {
                    String[] arr = n.split("x");
                    Double op1 = Double.parseDouble(arr[0]);
                    Double op2 = Double.parseDouble(arr[1]);
                    Double res = op1*op2;
                    t.setText(Double.toString(res));
                }

                else if(n.contains("/"))
                {
                    String[] arr = n.split("\\/");
                    double op1 = Integer.parseInt(arr[0]);
                    double op2 = Integer.parseInt(arr[1]);
                    double res = op1/op2;
                    t.setText(Double.toString(res));
                }
            }   
        });

        f.setLayout(null);
        f.setSize(400,360);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new java.awt.Color(246, 245, 240));
    }
}
