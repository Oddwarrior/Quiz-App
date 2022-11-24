/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QuizPackage;

import java.awt.Color;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author VISHAKHA
 */
public class Question extends javax.swing.JPanel {
    
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
        
        questionLabel.setText(allQuestions[i].questionLabel.getText());
        option1.setText(allQuestions[i].option1.getText());
        option2.setText(allQuestions[i].option2.getText());
        option3.setText(allQuestions[i].option3.getText());
        option4.setText(allQuestions[i].option4.getText());
        
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        nextbutton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        questionNoLabel = new javax.swing.JLabel();
        A = new javax.swing.JPanel();
        option1 = new javax.swing.JLabel();
        B = new javax.swing.JPanel();
        option2 = new javax.swing.JLabel();
        C = new javax.swing.JPanel();
        option3 = new javax.swing.JLabel();
        D = new javax.swing.JPanel();
        option4 = new javax.swing.JLabel();

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

        A.setBackground(new java.awt.Color(255, 255, 255));
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMouseClicked(evt);
            }
        });

        option1.setText("jLabel1");

        javax.swing.GroupLayout ALayout = new javax.swing.GroupLayout(A);
        A.setLayout(ALayout);
        ALayout.setHorizontalGroup(
            ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ALayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(option1)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        ALayout.setVerticalGroup(
            ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(option1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        B.setBackground(new java.awt.Color(255, 255, 255));
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMouseClicked(evt);
            }
        });

        option2.setText("jLabel1");

        javax.swing.GroupLayout BLayout = new javax.swing.GroupLayout(B);
        B.setLayout(BLayout);
        BLayout.setHorizontalGroup(
            BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(option2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BLayout.setVerticalGroup(
            BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(option2)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        C.setBackground(new java.awt.Color(255, 255, 255));
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMouseClicked(evt);
            }
        });

        option3.setText("jLabel1");

        javax.swing.GroupLayout CLayout = new javax.swing.GroupLayout(C);
        C.setLayout(CLayout);
        CLayout.setHorizontalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(option3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CLayout.setVerticalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(option3)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        D.setBackground(new java.awt.Color(255, 255, 255));
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DMouseClicked(evt);
            }
        });

        option4.setText("jLabel3");

        javax.swing.GroupLayout DLayout = new javax.swing.GroupLayout(D);
        D.setLayout(DLayout);
        DLayout.setHorizontalGroup(
            DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(option4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DLayout.setVerticalGroup(
            DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(option4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(nextbutton)
                                .addGap(61, 61, 61))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(questionNoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(questionLabel)
                        .addGap(0, 181, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionLabel)
                    .addComponent(questionNoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(nextbutton)
                .addGap(36, 36, 36))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonActionPerformed
            this.done = true;
            nextQuestion();
            
    }//GEN-LAST:event_nextbuttonActionPerformed
    
    private void nextQuestion(){
        if(QuestionNo>= allQuestions.length){
                questionLabel.setText("Score :"+ score +"/"+allQuestions.length);
                
                questionNoLabel.setVisible(false);
                option1.setVisible(false);
                option2.setVisible(false);
                option3.setVisible(false);
                option4.setVisible(false);
                nextbutton.setVisible(false);
                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);

            }  
        else{
            option1.setForeground(Color.black);
            option2.setForeground(Color.black);
            option3.setForeground(Color.black);
            option4.setForeground(Color.black);
            loadQuestion(QuestionNo++);
        }
    }
   
    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
        this.currentAns = option1.getText();
        int q = QuestionNo-1;
        if(option1.getText().equals(allQuestions[q].correctAns)){
            score++;
            option1.setForeground(Color.green);

        }
        else option1.setForeground(Color.red);        
    }//GEN-LAST:event_AMouseClicked

    private void BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseClicked
        this.currentAns = option2.getText();
        int q = QuestionNo-1;
        if(option2.getText().equals(allQuestions[q].correctAns)){
            score++;
            option2.setForeground(Color.green);
            
        }
        else option2.setForeground(Color.red);
    }//GEN-LAST:event_BMouseClicked

    private void CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseClicked
        this.currentAns = option3.getText();
        int q = QuestionNo-1;
        if(option3.getText().equals(allQuestions[q].correctAns)){
            score++;
            option3.setForeground(Color.green);
        }
        else option3.setForeground(Color.red);
        
    }//GEN-LAST:event_CMouseClicked

    private void DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseClicked
        this.currentAns = option4.getText();
        int q = QuestionNo-1;
        if(option4.getText().equals(allQuestions[q].correctAns)){
            score++;
            option4.setForeground(Color.green);}
        else option4.setForeground(Color.red);
    
    }//GEN-LAST:event_DMouseClicked
    
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel A;
    private javax.swing.JPanel B;
    private javax.swing.JPanel C;
    private javax.swing.JPanel D;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton nextbutton;
    private javax.swing.JLabel option1;
    private javax.swing.JLabel option2;
    private javax.swing.JLabel option3;
    private javax.swing.JLabel option4;
    public javax.swing.JLabel questionLabel;
    private javax.swing.JLabel questionNoLabel;
    // End of variables declaration//GEN-END:variables
    public boolean done = false;

}
