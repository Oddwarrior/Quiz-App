/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizPackage;


public class Data {
    
    public static Question[] getQuestionData(){
        
        
            
            Question q1 = new Question();
            q1.questionLabel.setText("Out of these packages, which one contains an abstract keyword?");
            q1.option1.setText("java.util");
            q1.option2.setText("java.lang");
            q1.option3.setText("java.system");
            q1.option4.setText("java.io");
            q1.correctAns = "java.lang";
            
            Question q2 = new Question();
            q2.questionLabel.setText("<html>Out of these methods, which one can be used for converting all the characters present in a String into an Array of characters?</html>");
            q2.option1.setText("both getChars() & toCharArray()");
            q2.option2.setText(" both charAt() & getChars()");
            q2.option3.setText("charAt()");
            q2.option4.setText("all of the mentioned");
            q2.correctAns = "both getChars() & toCharArray()";
            
            Question q3 = new Question();
            q3.questionLabel.setText("<html>What value is returned by the compareTo() function in case the invoking string happens to be greater than the compared string?</html>");
            q3.option1.setText("a value that is greater than zero");
            q3.option2.setText(" a value that is less than zero");
            q3.option3.setText("zero");
            q3.option4.setText("none of the above");
            q3.correctAns = "a value that is greater than zero";
            
            Question allQuestions[]= {q1, q2, q3};
            
           return allQuestions;
    }
    
}
