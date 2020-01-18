package Them8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcPanel extends JPanel {
    JTextField jtf = null;
    int a = 0;
    int b = 0;
    String s = "";

    public CalcPanel() {
        try {

            setLayout(null);
            final TextField jtf = new TextField();
            jtf.setBounds(10, 10, 200, 25);
            add(jtf);

            JButton b9 = new JButton("9");
            b9.setBounds(110, 40, 50, 50);

            JButton b8 = new JButton("8");
            b8.setBounds(60, 40, 50, 50);

            JButton b7 = new JButton("7");
            b7.setBounds(10, 40, 50, 50);

            JButton b6 = new JButton("6");
            b6.setBounds(110, 100, 50, 50);

            JButton b5 = new JButton("5");
            b5.setBounds(60, 100, 50, 50);


            JButton b4 = new JButton("4");
            b4.setBounds(10, 100, 50, 50);


            JButton b3 = new JButton("3");
            b3.setBounds(110, 160, 50, 50);


            JButton b2 = new JButton("2");
            b2.setBounds(60, 160, 50, 50);


            JButton b1 = new JButton("1");
            b1.setBounds(10, 160, 50, 50);


            JButton b0 = new JButton("0");
            b0.setBounds(60, 220, 50, 50);


            JButton bRes = new JButton("=");
            bRes.setBounds(110, 220, 50, 50);

            JButton bClear = new JButton("clear");
            bClear.setBounds(10, 280, 200, 25);


            JButton bMulti = new JButton("*");
            bMulti.setBounds(160, 100, 50, 50);


            JButton bDivision = new JButton("/");
            bDivision.setBounds(160, 220, 50, 50);


            JButton bMinus = new JButton("-");
            bMinus.setBounds(160, 160, 50, 50);


            JButton bPlus = new JButton("+");
            bPlus.setBounds(160, 40, 50, 50);

            JButton bDegree = new JButton("x*");
            bDegree.setBounds(10, 220, 50, 50);

            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(b0);
            add(bDivision);
            add(bMulti);
            add(bRes);
            add(bMinus);
            add(bPlus);
            add(bDegree);
            add(bClear);


            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jtf.setText(jtf.getText() + 1);
                    if (a == 0) {
                        a = Integer.valueOf(jtf.getText());
                    } else {
                        b = Integer.valueOf(jtf.getText());
                    }
                }
            });

            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jtf.setText(jtf.getText() + 2);
                    if (a == 0) {
                        a = Integer.valueOf(jtf.getText());
                    } else {
                        b = Integer.valueOf(jtf.getText());
                    }
                }
            });

            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jtf.setText(jtf.getText() + 3);
                    if (a == 0) {
                        a = Integer.valueOf(jtf.getText());
                    } else {
                        b = Integer.valueOf(jtf.getText());
                    }
                }
            });

            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jtf.setText(jtf.getText() + 4);
                    if (a == 0) {
                        a = Integer.valueOf(jtf.getText());
                    } else {
                        b = Integer.valueOf(jtf.getText());
                    }
                }
            });

            b5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jtf.setText(jtf.getText() + 5);
                    if (a == 0) {
                        a = Integer.valueOf(jtf.getText());
                    } else {
                        b = Integer.valueOf(jtf.getText());
                    }
                }
            });

            b6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jtf.setText(jtf.getText() + 6);
                    if (a == 0) {
                        a = Integer.valueOf(jtf.getText());
                    } else {
                        b = Integer.valueOf(jtf.getText());
                    }
                }
            });

            b7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jtf.setText(jtf.getText() + 7);
                    if (a == 0) {
                        a = Integer.valueOf(jtf.getText());
                    } else {
                        b = Integer.valueOf(jtf.getText());
                    }
                }
            });

            b8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jtf.setText(jtf.getText() + 8);
                    if (a == 0) {
                        a = Integer.valueOf(jtf.getText());
                    } else {
                        b = Integer.valueOf(jtf.getText());
                    }
                }
            });

            b9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jtf.setText(jtf.getText() + 9);
                    if (a == 0) {
                        a = Integer.valueOf(jtf.getText());
                    } else {
                        b = Integer.valueOf(jtf.getText());
                    }
                }
            });

            b0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jtf.setText(jtf.getText() + 0);
                    if (a == 0) {
                        a = Integer.valueOf(jtf.getText());
                    } else {
                        b = Integer.valueOf(jtf.getText());
                    }
                }
            });


            bPlus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    a = Integer.valueOf(jtf.getText());
                    jtf.setText("");
                    s = "+";
                }
            });

            bDegree.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    a = Integer.valueOf(jtf.getText());
                    jtf.setText("");
                    s = "x*";
                }
            });

            bMinus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    a = Integer.valueOf(jtf.getText());
                    jtf.setText("");
                    s = "-";
                }
            });

            bMulti.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    a = Integer.valueOf(jtf.getText());
                    jtf.setText("");
                    s = "*";
                }
            });

            bDivision.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    a = Integer.valueOf(jtf.getText());
                    jtf.setText("");
                    s = "/";
                }
            });

            bClear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==bClear)
                    {
                        String s=jtf.getText();
                        jtf.setText("");
                        for(int i=0;i<s.length()-1;i++)
                            jtf.setText(jtf.getText()+s.charAt(i));
                    }

                }
            } );

            bRes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    int num = Integer.valueOf(a);
                    int num1 = Integer.valueOf(b);
                    String strOp = s;

                    MetCalc mc = new MetCalc();
                    String strRes = String.valueOf(mc.calc(num, strOp, num1));
                    jtf.setText(strRes);
                }
            });


        } catch (ArithmeticException exception) {
        }


    }

    static class MetCalc {
        public int calc(int n1, String s, int n2) {
            int a = 0;
            switch (s) {
                case "+":
                    a = n1 + n2;
                    break;
                case "-":
                    a = n1 - n2;
                    break;
                case "*":
                    a = n1 * n2;
                    break;
                case "/":
                    a = n1 / n2;
                    break;
                case "x*":
                    a = raiseToPower(n1, n2);
                    break;
                default:
                    a = 0;
                    break;
            }
            return a;
        }

    }

    public static int raiseToPower(int n1, int n2) {
        int result = 1;
        for (int i = 1; i <= n2; i++) {
            result *= n1;
        }
        return result;
    }
}
