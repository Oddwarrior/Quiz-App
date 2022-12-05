package QuizPackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.sql.*;


public class Question extends javax.swing.JPanel implements ActionListener{
    
    String nickName;
    private String currentAns;
    public String correctAns;
    public  Question[] allQuestions = null ;
    private  int QuestionNo = 0;
    private  int score = 0;

    public Question() {
        initComponents();
         
    }
    
    //reading and loading all questions from data base
    //this method is currrently not in use. 
    public  Question[] createQuestionsFromDatabase(String quizName, int numberOfQuestions){
        ResultSet rs = null;
        Statement stmt;
         Question[] questions = new Question[numberOfQuestions];
         try{  
            Class.forName("com.mysql.jdbc.Driver");  
//            Connection con=DriverManager.getConnection("jdbc:mysql://www.sql6.freemysqlhosting.net:3306/sql6580891?useSSL=false&allowPublicKeyRetrieval=true","sql6580891","VJKjeUIqSq"); 
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root","2000");  
            //here mydb is database name, root is username and 2000 is password  
            
            stmt=con.createStatement(); 
            
            for(int id = 1; id<=numberOfQuestions; id++){
            String query = "SELECT * FROM "+quizName+" WHERE id= "+id;
            rs=stmt.executeQuery(query);
     
            if(rs.next()){
             String question = "<html><p>"+(rs.getString("question"))+"</html></p>";
             String op1 = rs.getString("op1");
             String op2 = rs.getString("op2");
             String op3 = rs.getString("op3");
             String op4 = rs.getString("op4");
             String correct = rs.getString("correct");
            
            Question q = new Question();
            q.questionLabel.setText(question);
            q.option1.setText(op1);
            q.option2.setText(op2);
            q.option3.setText(op3);
            q.option4.setText(op4);
            q.correctAns = correct;
            questions[id-1] = q;
            }
            
        }
            con.close();
    }
    catch(Exception e){ 
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(this, "Something went wrong");
    }
         
       return questions;
    }
    
    //display Question
    public void loadQuestionOnPanel(int i){

        if(i== allQuestions.length-1) nextButton.setText("Submit");
        questionNoLabel.setText("Question No. "+String.valueOf(i+1));
        questionLabel.setText(allQuestions[i].questionLabel.getText());
        option1.setText(allQuestions[i].option1.getText());
        option2.setText(allQuestions[i].option2.getText());
        option3.setText(allQuestions[i].option3.getText());
        option4.setText(allQuestions[i].option4.getText());
        nextButton.setText("Skip");
         
    }

    
//load components
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        questionLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        questionNoLabel = new javax.swing.JLabel();
        option1 = new javax.swing.JRadioButton();
        option2 = new javax.swing.JRadioButton();
        option3 = new javax.swing.JRadioButton();
        option4 = new javax.swing.JRadioButton();
        answerMessage = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        correctAnsMessage = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(481, 300));

        questionLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        questionLabel.setText("What is your Name ?");
        questionLabel.setNextFocusableComponent(nextButton);
        questionLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        nextButton.setBackground(new java.awt.Color(0, 204, 204));
        nextButton.setText("Next");
        nextButton.setBorderPainted(false);
        nextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.setFocusPainted(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 188, 188));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        questionNoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        questionNoLabel.setForeground(new java.awt.Color(0, 102, 102));
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

        answerMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        answerMessage.setText("1");

        closeButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        closeButton.setForeground(new java.awt.Color(204, 204, 204));
        closeButton.setText("X");
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        correctAnsMessage.setForeground(new java.awt.Color(86, 157, 157));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(option1)
                                    .addComponent(option2)
                                    .addComponent(option3)
                                    .addComponent(option4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                                .addComponent(nextButton)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(questionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(correctAnsMessage)
                                    .addComponent(answerMessage))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(questionNoLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton)
                .addGap(14, 14, 14)
                .addComponent(answerMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(correctAnsMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(questionNoLabel)
                .addGap(15, 15, 15)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(option1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(option4)))
                .addGap(64, 64, 64))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
            this.done = true;
            nextQuestion();  
    }//GEN-LAST:event_nextButtonActionPerformed

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

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked
    
    //verify answer
    private void checkAnswer(){
       Enumeration<AbstractButton> optionsEnumeration = buttonGroup1.getElements();
 
        AbstractButton selectedOption = null; 
            if(option1.isSelected()) selectedOption = option1;
            if(option2.isSelected()) selectedOption = option2;
            if(option3.isSelected()) selectedOption = option3;
            if(option4.isSelected()) selectedOption = option4;
            
            int q = QuestionNo-1;
            if(q== allQuestions.length-1) nextButton.setText("Submit");
            else nextButton.setText("Next");
            while(optionsEnumeration.hasMoreElements()){
                    AbstractButton btn = optionsEnumeration.nextElement();
                    if(btn!=selectedOption) btn.setEnabled(false);
                 }
            
            currentAns = selectedOption.getText();
            if(currentAns.equals(allQuestions[q].correctAns)){
                selectedOption.setForeground(Color.decode("#38b814"));
                answerMessage.setText("✔️ Correct Answer !");
                answerMessage.setForeground(Color.decode("#38b814"));
                score++;  
            }
            else {
                selectedOption.setForeground(Color.red);
                answerMessage.setText("Opps! wrong Answer !");
                correctAnsMessage.setText("Correct answer is "+allQuestions[q].correctAns);
                answerMessage.setForeground(Color.red);
            }
    }  
    //Move to next Question
    public void nextQuestion(){
        if(QuestionNo>= allQuestions.length){
                
                Result result = new Result();
                result.show();
                result.showResult(score, allQuestions.length, nickName);
                
                    this.setVisible(false);
  //           
            }  
        else{
            enableOptions();
            loadQuestionOnPanel(QuestionNo++);
        }
    }
    // enable all options for next question
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
            correctAnsMessage.setText("");
    }
    }
    
    //not used till now
    @Override
     public void actionPerformed(ActionEvent ae) {
         
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerMessage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel correctAnsMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JButton nextButton;
    public javax.swing.JRadioButton option1;
    public javax.swing.JRadioButton option2;
    public javax.swing.JRadioButton option3;
    public javax.swing.JRadioButton option4;
    public javax.swing.JLabel questionLabel;
    private javax.swing.JLabel questionNoLabel;
    // End of variables declaration//GEN-END:variables
    public boolean done = false;

}
