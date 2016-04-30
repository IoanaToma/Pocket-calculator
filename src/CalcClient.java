
import java.rmi.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalcClient extends javax.swing.JFrame {
    
    public static ICalc calculator;
    public static double memory = 0;
    public static double currentResult = 0;
    public static String operator = "";
    public double operand1 = 0;
    public double operand2 = 0;
    public boolean firstOperation = true;

    public CalcClient() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calculatorLabel = new javax.swing.JLabel();
        currentInputArea = new javax.swing.JTextField();
        previousInputsArea = new javax.swing.JTextField();
        MCButton = new javax.swing.JButton();
        MRButton = new javax.swing.JButton();
        MSButton = new javax.swing.JButton();
        MplusButton = new javax.swing.JButton();
        MminusButton = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        divButton = new javax.swing.JButton();
        CButton = new javax.swing.JButton();
        inverseButton = new javax.swing.JButton();
        powerButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        factorialButton = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        pointButton = new javax.swing.JButton();
        multiButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        memoryField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(313, 399));

        calculatorLabel.setText("Calculator");

        currentInputArea.setEditable(false);
        currentInputArea.setText("0");

        previousInputsArea.setEditable(false);

        MCButton.setText("MC");
        MCButton.setMinimumSize(new java.awt.Dimension(53, 39));
        MCButton.setPreferredSize(new java.awt.Dimension(53, 39));
        MCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCButtonActionPerformed(evt);
            }
        });

        MRButton.setText("MR");
        MRButton.setMinimumSize(new java.awt.Dimension(53, 39));
        MRButton.setPreferredSize(new java.awt.Dimension(53, 39));
        MRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRButtonActionPerformed(evt);
            }
        });

        MSButton.setText("MS");
        MSButton.setMinimumSize(new java.awt.Dimension(53, 39));
        MSButton.setPreferredSize(new java.awt.Dimension(53, 39));
        MSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSButtonActionPerformed(evt);
            }
        });

        MplusButton.setText("M+");
        MplusButton.setMinimumSize(new java.awt.Dimension(53, 39));
        MplusButton.setPreferredSize(new java.awt.Dimension(53, 39));
        MplusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MplusButtonActionPerformed(evt);
            }
        });

        MminusButton.setText("M-");
        MminusButton.setMinimumSize(new java.awt.Dimension(53, 39));
        MminusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MminusButtonActionPerformed(evt);
            }
        });

        Button4.setText("4");
        Button4.setMinimumSize(new java.awt.Dimension(53, 39));
        Button4.setPreferredSize(new java.awt.Dimension(53, 39));
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setText("5");
        Button5.setMinimumSize(new java.awt.Dimension(53, 39));
        Button5.setPreferredSize(new java.awt.Dimension(53, 39));
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setText("6");
        Button6.setMinimumSize(new java.awt.Dimension(53, 39));
        Button6.setPreferredSize(new java.awt.Dimension(53, 39));
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        divButton.setText("/");
        divButton.setMinimumSize(new java.awt.Dimension(53, 39));
        divButton.setPreferredSize(new java.awt.Dimension(53, 39));
        divButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divButtonActionPerformed(evt);
            }
        });

        CButton.setText("C");
        CButton.setMinimumSize(new java.awt.Dimension(53, 39));
        CButton.setPreferredSize(new java.awt.Dimension(53, 39));
        CButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CButtonActionPerformed(evt);
            }
        });

        inverseButton.setText("1/x");
        inverseButton.setMinimumSize(new java.awt.Dimension(53, 39));
        inverseButton.setPreferredSize(new java.awt.Dimension(53, 39));
        inverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverseButtonActionPerformed(evt);
            }
        });

        powerButton.setText("x^y");
        powerButton.setMinimumSize(new java.awt.Dimension(53, 39));
        powerButton.setPreferredSize(new java.awt.Dimension(53, 39));
        powerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerButtonActionPerformed(evt);
            }
        });

        squareButton.setText("√x");
        squareButton.setMinimumSize(new java.awt.Dimension(53, 39));
        squareButton.setPreferredSize(new java.awt.Dimension(53, 39));
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });

        Button7.setText("7");
        Button7.setMinimumSize(new java.awt.Dimension(53, 39));
        Button7.setPreferredSize(new java.awt.Dimension(53, 39));
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setText("8");
        Button8.setMinimumSize(new java.awt.Dimension(53, 39));
        Button8.setPreferredSize(new java.awt.Dimension(53, 39));
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        factorialButton.setText("x!");
        factorialButton.setMinimumSize(new java.awt.Dimension(53, 39));
        factorialButton.setPreferredSize(new java.awt.Dimension(53, 39));
        factorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialButtonActionPerformed(evt);
            }
        });

        Button9.setText("9");
        Button9.setMinimumSize(new java.awt.Dimension(53, 39));
        Button9.setPreferredSize(new java.awt.Dimension(53, 39));
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Button1.setText("1");
        Button1.setMinimumSize(new java.awt.Dimension(53, 39));
        Button1.setPreferredSize(new java.awt.Dimension(53, 39));
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setText("2");
        Button2.setMinimumSize(new java.awt.Dimension(53, 39));
        Button2.setPreferredSize(new java.awt.Dimension(53, 39));
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setText("3");
        Button3.setPreferredSize(new java.awt.Dimension(53, 39));
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button0.setText("0");
        Button0.setMinimumSize(new java.awt.Dimension(112, 39));
        Button0.setPreferredSize(new java.awt.Dimension(112, 39));
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        pointButton.setText(".");
        pointButton.setMinimumSize(new java.awt.Dimension(53, 39));
        pointButton.setPreferredSize(new java.awt.Dimension(53, 39));
        pointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointButtonActionPerformed(evt);
            }
        });

        multiButton.setText("*");
        multiButton.setMinimumSize(new java.awt.Dimension(53, 39));
        multiButton.setPreferredSize(new java.awt.Dimension(53, 39));
        multiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiButtonActionPerformed(evt);
            }
        });

        minusButton.setText("-");
        minusButton.setMinimumSize(new java.awt.Dimension(53, 39));
        minusButton.setPreferredSize(new java.awt.Dimension(53, 39));
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        plusButton.setText("+");
        plusButton.setMinimumSize(new java.awt.Dimension(53, 39));
        plusButton.setPreferredSize(new java.awt.Dimension(53, 39));
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        equalsButton.setText("=");
        equalsButton.setMinimumSize(new java.awt.Dimension(53, 174));
        equalsButton.setPreferredSize(new java.awt.Dimension(53, 174));
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(previousInputsArea, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(multiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(MCButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MplusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MminusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(currentInputArea, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inverseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(powerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(factorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(calculatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calculatorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previousInputsArea, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentInputArea, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MplusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(powerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inverseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(factorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(multiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(equalsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(MminusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCButtonActionPerformed
        memory = 0;
        memoryField.setText("");
    }//GEN-LAST:event_MCButtonActionPerformed

    private void MRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRButtonActionPerformed
        currentInputArea.setText(String.valueOf(memory));
    }//GEN-LAST:event_MRButtonActionPerformed

    private void MSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSButtonActionPerformed
        if(currentInputArea.getText().equals("Error! Not a number!"))
            return;
        memory = Double.parseDouble(currentInputArea.getText());
        memoryField.setText("M");
    }//GEN-LAST:event_MSButtonActionPerformed

    private void MplusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MplusButtonActionPerformed
        if(currentInputArea.getText().equals("Error! Not a number!"))
            return;
        memory += Double.parseDouble(currentInputArea.getText());
    }//GEN-LAST:event_MplusButtonActionPerformed

    private void MminusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MminusButtonActionPerformed
        if(currentInputArea.getText().equals("Error! Not a number!"))
            return;
        memory -= Double.parseDouble(currentInputArea.getText());
    }//GEN-LAST:event_MminusButtonActionPerformed

    private void CButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CButtonActionPerformed
        currentInputArea.setText("0");
        previousInputsArea.setText("");
        operand1 = operand2 = currentResult = 0;
        operator = "";
        firstOperation = true;
    }//GEN-LAST:event_CButtonActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        if(currentInputArea.getText().equals("0") || firstOperation == false)
        {
            currentInputArea.setText("0");
            firstOperation = true;
        }
        else
            currentInputArea.setText(currentInputArea.getText() + "0");
        previousInputsArea.setText(previousInputsArea.getText() + "0");
    }//GEN-LAST:event_Button0ActionPerformed

    private void pointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointButtonActionPerformed
        if(!currentInputArea.getText().contains("."))
        {
            if(currentInputArea.getText().equals("0") || firstOperation == false)
            {
                currentInputArea.setText(".");
                firstOperation = true;
            }
            else
                currentInputArea.setText(currentInputArea.getText() + ".");
            previousInputsArea.setText(previousInputsArea.getText() + ".");
        }
    }//GEN-LAST:event_pointButtonActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        if(currentInputArea.getText().equals("0") || firstOperation == false)
        {
            currentInputArea.setText("1");
            firstOperation = true;
        }
        else
            currentInputArea.setText(currentInputArea.getText() + "1");
        previousInputsArea.setText(previousInputsArea.getText() + "1");
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        if(currentInputArea.getText().equals("0") || firstOperation == false)
        {
            currentInputArea.setText("2");
            firstOperation = true;
        }
        else
            currentInputArea.setText(currentInputArea.getText() + "2");
        previousInputsArea.setText(previousInputsArea.getText() + "2");
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        if(currentInputArea.getText().equals("0") || firstOperation == false)
        {
            currentInputArea.setText("3");
            firstOperation = true;
        }
        else
            currentInputArea.setText(currentInputArea.getText() + "3");
        previousInputsArea.setText(previousInputsArea.getText() + "3");
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        if(currentInputArea.getText().equals("0") || firstOperation == false)
        {
            currentInputArea.setText("4");
            firstOperation = true;
        }
        else
            currentInputArea.setText(currentInputArea.getText() + "4");
        previousInputsArea.setText(previousInputsArea.getText() + "4");
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        if(currentInputArea.getText().equals("0") || firstOperation == false)
        {
            currentInputArea.setText("5");
            firstOperation = true;
        }
        else
            currentInputArea.setText(currentInputArea.getText() + "5");
        previousInputsArea.setText(previousInputsArea.getText() + "5");
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        if(currentInputArea.getText().equals("0") || firstOperation == false)
        {
            currentInputArea.setText("6");
            firstOperation = true;
        }
        else
            currentInputArea.setText(currentInputArea.getText() + "6");
        previousInputsArea.setText(previousInputsArea.getText() + "6");
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        if(currentInputArea.getText().equals("0") || firstOperation == false)
        {
            currentInputArea.setText("7");
            firstOperation = true;
        }
        else
            currentInputArea.setText(currentInputArea.getText() + "7");
        previousInputsArea.setText(previousInputsArea.getText() + "7");
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        if(currentInputArea.getText().equals("0") || firstOperation == false)
        {
            currentInputArea.setText("8");
            firstOperation = true;
        }
        else
            currentInputArea.setText(currentInputArea.getText() + "8");
        previousInputsArea.setText(previousInputsArea.getText() + "8");
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        if(currentInputArea.getText().equals("0") || firstOperation == false)
        {
            currentInputArea.setText("9");
            firstOperation = true;
        }
        else
            currentInputArea.setText(currentInputArea.getText() + "9");
        previousInputsArea.setText(previousInputsArea.getText() + "9");
    }//GEN-LAST:event_Button9ActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        if(currentInputArea.getText().equals("Error! Not a number!"))
            return;
        
        if(operator.equals("") || operator.equals("="))
        {   
            operator = "+";
            operand1 = Double.parseDouble(currentInputArea.getText());
            previousInputsArea.setText(previousInputsArea.getText() + " + ");
            firstOperation = false;
        }
        else
            if(firstOperation == true)
            {   
                operand2 = Double.parseDouble(currentInputArea.getText());
                try {
                    currentResult = operation(operator, operand1, operand2);
                } catch (Exception ex) {
                    Logger.getLogger(CalcClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                operator = "+";
                firstOperation = false;
                operand1 = currentResult;
                operand2 = 0;
                if(Double.isNaN(currentResult) == true)
                {
                    currentInputArea.setText("Error! Not a number!");
                    previousInputsArea.setText("");
                    operand1 = currentResult = 0;
                    operator = "";
                }
                else
                {
                    currentInputArea.setText(String.valueOf(currentResult));
                    previousInputsArea.setText(previousInputsArea.getText() + " + ");
                }
            }
            else 
            {
                 operator = "+";
                 String str = previousInputsArea.getText();
                 previousInputsArea.setText(str.substring(0, str.length() - 3) + " + ");
            }
    }//GEN-LAST:event_plusButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        if(currentInputArea.getText().equals("Error! Not a number!"))
            return;
        if(operator.equals("") || operator.equals("="))
        {   
            operator = "-";
            operand1 = Double.parseDouble(currentInputArea.getText());
            previousInputsArea.setText(previousInputsArea.getText() + " - ");
            firstOperation = false;
        }
        else
            if(firstOperation == true)
            {   
                operand2 = Double.parseDouble(currentInputArea.getText());
                try {
                    currentResult = operation(operator, operand1, operand2);
                } catch (Exception ex) {
                    Logger.getLogger(CalcClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                operator = "-";
                firstOperation = false;
                operand1 = currentResult;
                operand2 = 0;
                if(Double.isNaN(currentResult) == true)
                {
                    currentInputArea.setText("Error! Not a number!");
                    previousInputsArea.setText("");
                    operand1 = currentResult = 0;
                    operator = "";
                }
                else
                {
                    currentInputArea.setText(String.valueOf(currentResult));
                    previousInputsArea.setText(previousInputsArea.getText() + " - ");
                }
            }
            else 
            {   
                operator = "-";
                String str = previousInputsArea.getText();
                previousInputsArea.setText(str.substring(0, str.length() - 3) + " - ");
            }
    }//GEN-LAST:event_minusButtonActionPerformed

    private void multiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiButtonActionPerformed
        if(currentInputArea.getText().equals("Error! Not a number!"))
            return;
        if(operator.equals("") || operator.equals("="))
        {   
            operator = "*";
            operand1 = Double.parseDouble(currentInputArea.getText());
            previousInputsArea.setText(previousInputsArea.getText() + " * ");
            firstOperation = false;
        }
        else
            if(firstOperation == true)
            {
                operand2 = Double.parseDouble(currentInputArea.getText());
                try {
                    currentResult = operation(operator, operand1, operand2);
                } catch (Exception ex) {
                    Logger.getLogger(CalcClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                operator = "*";
                firstOperation = false;
                operand1 = currentResult;
                operand2 = 0;
                if(Double.isNaN(currentResult) == true)
                {
                    currentInputArea.setText("Error! Not a number!");
                    previousInputsArea.setText("");
                    operand1 = currentResult = 0;
                    operator = "";
                }
                else
                {
                    currentInputArea.setText(String.valueOf(currentResult));
                    previousInputsArea.setText(previousInputsArea.getText() + " * ");
                }
            }
            else 
            {
                operator = "*";
                String str = previousInputsArea.getText();
                previousInputsArea.setText(str.substring(0, str.length() - 3) + " * ");
            }
    }//GEN-LAST:event_multiButtonActionPerformed

    private void divButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divButtonActionPerformed
        if(currentInputArea.getText().equals("Error! Not a number!"))
            return;
        if(operator.equals("") || operator.equals("="))
        {   
            operator = "/";
            operand1 = Double.parseDouble(currentInputArea.getText());
            previousInputsArea.setText(previousInputsArea.getText() + " / ");
            firstOperation = false;
        }
        else
            if(firstOperation == true)
            {
                operand2 = Double.parseDouble(currentInputArea.getText());
                try {
                    currentResult = operation(operator, operand1, operand2);
                } catch (Exception ex) {
                    Logger.getLogger(CalcClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                operator = "/";
                firstOperation = false;
                operand1 = currentResult;
                operand2 = 0;
                if(Double.isNaN(currentResult) == true)
                {
                    currentInputArea.setText("Error! Not a number!");
                    previousInputsArea.setText("");
                    operand1 = currentResult = 0;
                    operator = "";
                }
                else
                {
                    currentInputArea.setText(String.valueOf(currentResult));
                    previousInputsArea.setText(previousInputsArea.getText() + " / ");
                }
            }
            else 
            {
                operator = "/";
                String str = previousInputsArea.getText();
                previousInputsArea.setText(str.substring(0, str.length() - 3) + " / ");
            }
    }//GEN-LAST:event_divButtonActionPerformed

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed
        if(currentInputArea.getText().equals("Error! Not a number!"))
            return;
        if(operator.equals(""))
        {
            operator = "=";
            firstOperation = false;
        }
        else
            if(firstOperation == true)
            {
                operand2 = Double.parseDouble(currentInputArea.getText());
                try {
                    currentResult = operation(operator, operand1, operand2);
                } catch (Exception ex) {
                    Logger.getLogger(CalcClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                operator = "=";
                firstOperation = false;
                if(Double.isNaN(currentResult) == true)
                {
                    currentInputArea.setText("Error! Not a number!");
                    previousInputsArea.setText("");
                    operand1 = currentResult = 0;
                    operator = "";
                }
                else
                {
                    currentInputArea.setText(String.valueOf(currentResult));
                    previousInputsArea.setText(String.valueOf(currentResult));
                }
            }
            else
            {   
                operator = "=";
                if(Double.isNaN(operand1) == true)
                {
                    currentInputArea.setText("Error! Not a number!");
                    previousInputsArea.setText("");
                }
                else
                {
                    currentInputArea.setText(String.valueOf(operand1));
                    previousInputsArea.setText(String.valueOf(operand1));
                }
            }
        currentResult = 0;
    }//GEN-LAST:event_equalsButtonActionPerformed

    private void inverseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverseButtonActionPerformed
        if(currentInputArea.getText().equals("Error! Not a number!"))
            return;
        if(operator.equals("") || operator.equals("="))
        {   
            try {
                currentResult = calculator.inverse(Double.parseDouble(currentInputArea.getText()));
            } catch (RemoteException ex) {
                Logger.getLogger(CalcClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            previousInputsArea.setText("reciproc(" + currentInputArea.getText() + ") ");
            operator = "inv";
            firstOperation = true;
            operand1 = currentResult;
            if(Double.isNaN(currentResult) == true)
                currentInputArea.setText("Error! Not a number!");
            else
                currentInputArea.setText(String.valueOf(currentResult));
        }
        else
        {
            try {
                    currentResult = operation(operator, operand1, 
                        calculator.inverse(Double.parseDouble(currentInputArea.getText())));
            } catch (Exception ex) {
                Logger.getLogger(CalcClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            String str = previousInputsArea.getText();
            if(str.charAt(str.length()-1) != ' ')
                previousInputsArea.setText(str.substring(0, str.length()-1) 
                        + "reciproc(" + currentInputArea.getText() + ") ");
            else
                previousInputsArea.setText(str + "reciproc(" + currentInputArea.getText() + ") ");
            operator = "inv";
            firstOperation = true;
            operand1 = currentResult;
            if(Double.isNaN(currentResult) == true)
                currentInputArea.setText("Error! Not a number!");
            else
                currentInputArea.setText(String.valueOf(currentResult));
        }
    }//GEN-LAST:event_inverseButtonActionPerformed

    private void powerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerButtonActionPerformed
        if(currentInputArea.getText().equals("Error! Not a number!"))
            return;
        if(operator.equals("") || operator.equals("="))
        {   
            operator = "^";
            operand1 = Double.parseDouble(currentInputArea.getText());
            previousInputsArea.setText(previousInputsArea.getText() + " ^ ");
            firstOperation = false;
        }
        else
            if(firstOperation == true)
            {
                operand2 = Double.parseDouble(currentInputArea.getText());
                try {
                    currentResult = operation(operator, operand1, operand2);
                } catch (Exception ex) {
                    Logger.getLogger(CalcClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                operator = "^";
                firstOperation = false;
                operand1 = currentResult;
                operand2 = 0;
                if(Double.isNaN(currentResult) == true)
                {
                    currentInputArea.setText("Error! Not a number!");
                    previousInputsArea.setText("");
                    operand1 = currentResult = 0;
                    operator = "";
                }
                else
                {
                    currentInputArea.setText(String.valueOf(currentResult));
                    previousInputsArea.setText(previousInputsArea.getText() + " ^ ");
                }
            }
            else 
            {
                operator = "^";
                String str = previousInputsArea.getText();
                previousInputsArea.setText(str.substring(0, str.length() - 3) + " ^ ");
            }
    }//GEN-LAST:event_powerButtonActionPerformed

    private void factorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialButtonActionPerformed
        if(currentInputArea.getText().equals("Error! Not a number!"))
            return;
        if(operator.equals("") || operator.equals("="))
        {   
            try {
                currentResult = calculator.factorial(Double.parseDouble(currentInputArea.getText()));
            } catch (RemoteException ex) {
                Logger.getLogger(CalcClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            previousInputsArea.setText(currentInputArea.getText() + "! ");
            operator = "fact";
            firstOperation = true;
            operand1 = currentResult;
            if(Double.isNaN(currentResult) == true)
                currentInputArea.setText("Error! Not a number!");
            else
                currentInputArea.setText(String.valueOf(currentResult));
        }
        else
        {
            try {
                    currentResult = operation(operator, operand1, 
                        calculator.factorial(Double.parseDouble(currentInputArea.getText())));
            } catch (Exception ex) {
                Logger.getLogger(CalcClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            String str = previousInputsArea.getText();
            if(str.charAt(str.length()-1) != ' ')
                previousInputsArea.setText(str.substring(0, str.length()-1) 
                        + currentInputArea.getText() + "! ");
            else
                previousInputsArea.setText(str + currentInputArea.getText() + "! ");
            operator = "fact";
            firstOperation = true;
            operand1 = currentResult;
            if(Double.isNaN(currentResult) == true)
                currentInputArea.setText("Error! Not a number!");
            else
                currentInputArea.setText(String.valueOf(currentResult));
        }
    }//GEN-LAST:event_factorialButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
       if(currentInputArea.getText().equals("Error! Not a number!"))
            return;
        if(operator.equals("") || operator.equals("="))
        {   
            try {
                currentResult = calculator.squareRoot(Double.parseDouble(currentInputArea.getText()));
            } catch (RemoteException ex) {
                Logger.getLogger(CalcClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            previousInputsArea.setText("√" + currentInputArea.getText() + " ");
            operator = "sq";
            firstOperation = true;
            operand1 = currentResult;
            if(Double.isNaN(currentResult) == true)
                currentInputArea.setText("Error! Not a number!");
            else
                currentInputArea.setText(String.valueOf(currentResult));
        }
        else
        {
            try {
                    currentResult = operation(operator, operand1, 
                        calculator.squareRoot(Double.parseDouble(currentInputArea.getText())));
            } catch (Exception ex) {
                Logger.getLogger(CalcClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            String str = previousInputsArea.getText();
            if(str.charAt(str.length()-1) != ' ')
                previousInputsArea.setText(str.substring(0, str.length()-1) 
                        + "√" + currentInputArea.getText() + " ");
            else
                previousInputsArea.setText(str + "√" + currentInputArea.getText() + " ");
            operator = "sq";
            firstOperation = true;
            operand1 = currentResult;
            if(Double.isNaN(currentResult) == true)
                currentInputArea.setText("Error! Not a number!");
            else
                currentInputArea.setText(String.valueOf(currentResult));
        }
    }//GEN-LAST:event_squareButtonActionPerformed
    
    public double operation(String operator, double operand1, double operand2) throws Exception
    {   
        double result = 0;
        switch(operator) 
        {
            case "+" :
                result = calculator.sum(operand1, operand2);
                break;
            case "-" :
                result = calculator.substraction(operand1, operand2);
                break;
            case "*" :
                result = calculator.multiplication(operand1, operand2);
                break;
            case "/" :
                result = calculator.division(operand1, operand2);
                break;
            case "^" :
                result = calculator.exponentiation(operand1, operand2);
                break;
            default:
                result = operand2;
                break;
        }
        return result;
    }
    
    
    public static void main(String args[]) throws Exception
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalcClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        calculator = (ICalc) Naming.lookup("rmi://" + 
                "localhost" + "/CalculatorImplementation");
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton CButton;
    private javax.swing.JButton MCButton;
    private javax.swing.JButton MRButton;
    private javax.swing.JButton MSButton;
    private javax.swing.JButton MminusButton;
    private javax.swing.JButton MplusButton;
    private javax.swing.JLabel calculatorLabel;
    private javax.swing.JTextField currentInputArea;
    private javax.swing.JButton divButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JButton factorialButton;
    private javax.swing.JButton inverseButton;
    private javax.swing.JTextField memoryField;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton pointButton;
    private javax.swing.JButton powerButton;
    private javax.swing.JTextField previousInputsArea;
    private javax.swing.JButton squareButton;
    // End of variables declaration//GEN-END:variables
}