/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QuizPackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;


/**
 *
 * @author VISHAKHA
 */
public class Question extends javax.swing.JPanel implements ActionListener{
    
    private String currentAns;
    private String correctAns;
    private static Question[] allQuestions = getQuestionsFromdataBase();
    private static int QuestionNo = 0;
    private static int score = 0;

    public Question() {
        initComponents();
         
    }
    
  
    public static  Question[] getQuestionsFromdataBase(){
        Question[] questions = new Question[2];
        
        Question question1 = new Question();
        question1.questionLabel.setText("Question 1");
        question1.option1.setText("op 1 1");
        question1.option2.setText("op 1 2");
        question1.option3.setText("op 1 3");
        question1.option4.setText("op 1 4");
        question1.correctAns = "op 1 1";
        questions[0] = question1;
        
        Question question2 = new Question();
        question2.questionLabel.setText("Question 2");
        question2.option1.setText("op 2 1");
        question2.option2.setText("op 2 2");
        question2.option3.setText("op 2 3");
        question2.option4.setText("op 2 4");
        question2.correctAns= "op 2 4";
       
        questions[1] = question2;
        
        return questions;
    }
    
    public void loadQuestion(int i){
        
       
        if(i== allQuestions.length-1) nextbutton.setText("Submit");
        questionNoLabel.setText(String.valueOf(i+1));
        questionLabel.setText(allQuestions[i].questionLabel.getText());
        option1.setText(allQuestions[i].option1.getText());
        option2.setText(allQuestions[i].option2.getText());
        option3.setText(allQuestions[i].option3.getText());
        option4.setText(allQuestions[i].option4.getText());
        nextbutton.setText("Skip");
        
        
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        questionLabel = new javax.swing.JLabel();
        nextbutton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        questionNoLabel = new javax.swing.JLabel();
        option1 = new javax.swing.JRadioButton();
        option2 = new javax.swing.JRadioButton();
        option3 = new javax.swing.JRadioButton();
        option4 = new javax.swing.JRadioButton();
        answerMessage = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(481, 300));

        questionLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        questionLabel.setText("What is your Name ?");

        nextbutton.setBackground(new java.awt.Color(0, 204, 204));
        nextbutton.setText("Next");
        nextbutton.setBorderPainted(false);
        nextbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextbutton.setFocusPainted(false);
        nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        questionNoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        questionNoLabel.setText("1");

        buttonGroup1.add(option1);
        option1.setText("jRadioButton1");
        option1.setContentAreaFilled(false);
        option1.setFocusPainted(false);
        option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(option2);
        option2.setText("jRadioButton2");
        option2.setContentAreaFilled(false);
        option2.setFocusPainted(false);
        option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(option3);
        option3.setText("jRadioButton3");
        option3.setContentAreaFilled(false);
        option3.setFocusPainted(false);
        option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(option4);
        option4.setText("jRadioButton4");
        option4.setContentAreaFilled(false);
        option4.setFocusPainted(false);
        option4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextbutton)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(questionNoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(questionLabel))
                            .addComponent(answerMessage)
                            .addComponent(option1)
                            .addComponent(option2)
                            .addComponent(option3)
                            .addComponent(option4))
                        .addGap(0, 181, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(answerMessage)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionLabel)
                    .addComponent(questionNoLabel))
                .addGap(29, 29, 29)
                .addComponent(option1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(option4)
                .addGap(39, 39, 39)
                .addComponent(nextbutton)
                .addGap(36, 36, 36))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonActionPerformed
            this.done = true;
            nextQuestion();
            
    }//GEN-LAST:event_nextbuttonActionPerformed

    private void option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option1ActionPerformed
        checkAnswer();        
    }//GEN-LAST:event_option1ActionPerformed

    private void option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option2ActionPerformed
        checkAnswer();        
    }//GEN-LAST:event_option2ActionPerformed

    private void option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option3ActionPerformed
        checkAnswer();        
    }//GEN-LAST:event_option3ActionPerformed

    private void option4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option4ActionPerformed
            checkAnswer();       
    }//GEN-LAST:event_option4ActionPerformed
   private void checkAnswer(){
       Enumeration<AbstractButton> optionsEnumeration = buttonGroup1.getElements();
 
        AbstractButton selectedOption = null; 
            if(option1.isSelected()) selectedOption = option1;
            if(option2.isSelected()) selectedOption = option2;
            if(option3.isSelected()) selectedOption = option3;
            if(option4.isSelected()) selectedOption = option4;
            
            int q = QuestionNo-1;
            if(q== allQuestions.length-1) nextbutton.setText("Submit");
            else nextbutton.setText("Next");
            while(optionsEnumeration.hasMoreElements()){
                    AbstractButton btn = optionsEnumeration.nextElement();
                    if(btn!=selectedOption) btn.setEnabled(false);
                 }
            
            currentAns = selectedOption.getText();
            if(currentAns.equals(allQuestions[q].correctAns)){
                selectedOption.setForeground(Color.green);
                answerMessage.setText("✅ Correct Answer !");
                answerMessage.setForeground(Color.green);
                score++;  
            }
            else {
                selectedOption.setForeground(Color.red);
                answerMessage.setText("Opps! wrong Answer !");
                answerMessage.setForeground(Color.red);
            }
   }  
    public void nextQuestion(){
        if(QuestionNo>= allQuestions.length){
                questionLabel.setText("Score :"+ score +"/"+allQuestions.length);
                
                questionNoLabel.setVisible(false);
                answerMessage.setVisible(false);
                nextbutton.setVisible(false);
                option1.setVisible(false);
                option2.setVisible(false);
                option3.setVisible(false);
                option4.setVisible(false);

            }  
        else{
            enableOptions();
            loadQuestion(QuestionNo++);
        }
    }
    
    private void enableOptions(){
        Enumeration<AbstractButton> optionsEnumeration = buttonGroup1.getElements();
        while(optionsEnumeration.hasMoreElements()){
            optionsEnumeration.nextElement().setEnabled(true);
            option1.setForeground(Color.black);
            option2.setForeground(Color.black);
            option3.setForeground(Color.black);
            option4.setForeground(Color.black);
            buttonGroup1.clearSelection();
            answerMessage.setText("");
    }
    }
    @Override
     public void actionPerformed(ActionEvent ae) {
         
               

     }
     
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerMessage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton nextbutton;
    private javax.swing.JRadioButton option1;
    private javax.swing.JRadioButton option2;
    private javax.swing.JRadioButton option3;
    private javax.swing.JRadioButton option4;
    public javax.swing.JLabel questionLabel;
    private javax.swing.JLabel questionNoLabel;
    // End of variables declaration//GEN-END:variables
    public boolean done = false;

}
