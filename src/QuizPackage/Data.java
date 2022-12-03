package QuizPackage;

import java.util.*;


public class Data {
    
    //questions for java
    public static Question[] getJavaData(){
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
    //questions for dsa
    public static Question[] getDsaData(){
            Question q1 = new Question();
            q1.questionLabel.setText("<html>Which one of the following is the process of inserting an element in the stack?</html>");
            q1.option1.setText("Insert");
            q1.option2.setText("Add");
            q1.option3.setText("Push");
            q1.option4.setText("None of the above");
            q1.correctAns = "Push";
            
            Question q2 = new Question();
            q2.questionLabel.setText("<html>When the user tries to delete the element from the empty stack then the condition is said to be a ____</html>");
            q2.option1.setText("Underflow");
            q2.option2.setText("Garbage collection");
            q2.option3.setText("Overflow");
            q2.option4.setText("None of the above");
            q2.correctAns = "Underflow";
            
            Question q3 = new Question();
            q3.questionLabel.setText("<html>If the elements '1', '2', '3' and '4' are added in a stack, so what would be the order for the removal?</html>");
            q3.option1.setText("1234");
            q3.option2.setText("2134");
            q3.option3.setText("4321");
            q3.option4.setText("None of the above");
            q3.correctAns = "4321";
            
            Question q4 = new Question();
            q4.questionLabel.setText("<html>Which of the following principle does Queue use?</html>");
            q4.option1.setText("LIFO principle");
            q4.option2.setText("FIFO principle");
            q4.option3.setText("Linear tree");
            q4.option4.setText("Ordered array");
            q4.correctAns = "FIFO principle";
            
            Question q5 = new Question();
            q5.questionLabel.setText("<html>Which one of the following is not the type of the Queue?</html>");
            q5.option1.setText("Linear Queue");
            q5.option2.setText("Circular Queue");
            q5.option3.setText("Linear tree");
            q5.option4.setText("Double ended Queue");
            q5.correctAns = "Single ended Queue";
            
            Question q6 = new Question();
            q6.questionLabel.setText("<html>What would be the time complexity if user tries to insert the element at the end of the linked list (head pointer is known)?</html>");
            q6.option1.setText("O(1)");
            q6.option2.setText("O(n)");
            q6.option3.setText("O(logn)");
            q6.option4.setText("O(nlogn)");
            q6.correctAns = "O(n)";
        
            Question q7 = new Question();
            q7.questionLabel.setText("<html>Which of the following statement is not true about the doubly linked list?</html>");
            q7.option1.setText("We can traverse in both the directions.");
            q7.option2.setText("It requires extra space");
            q7.option3.setText("<html>Implementation of doubly linked list is easier than the singly linked list<html>");
            q7.option4.setText("It stores the addresses of the next and the previous node");
            q7.correctAns = "<html>Implementation of doubly linked list is easier than the singly linked list</html>";
            
            Question q8 = new Question();
            q8.questionLabel.setText("<html>What is the maximum number of children that a node can have in a binary tree?</html>");
            q8.option1.setText("3");
            q8.option2.setText("1");
            q8.option3.setText("4");
            q8.option4.setText("2");
            q8.correctAns = "2";            
            
            Question q9 = new Question();
            q9.questionLabel.setText("<html> Which of the following options is not true about the Binary Search tree?</html>");
            q9.option1.setText("The value of the left child should be less than the root node");
            q9.option2.setText("The value of the right child should be greater than the root node.");
            q9.option3.setText("The left and right sub trees should also be a binary search tree");
            q9.option4.setText("None of the above");
            q9.correctAns = "None of the above";
            
            Question q10 = new Question();
            q10.questionLabel.setText("<html> Which of the following is the advantage of the array data structure?</html>");
            q10.option1.setText("Elements of mixed data types can be stored.");
            q10.option2.setText("Easier to access the elements in an array");
            q10.option3.setText("Index of the first element starts from 1.");
            q10.option4.setText("Elements of an array cannot be sorted");
            q10.correctAns = "<html>Easier to access the elements in an array</html>";
            
            Question allQuestions[]= {q1, q2, q3, q4, q5 ,q6 ,q7, q8, q9, q10};
            
        return allQuestions;
    }
    
    //questions for javascript
    public static Question[] getJsData(){
        return null;
    }
    
    public static Question[] shuffleQuestions(Question[] array){
        List<Question> l = (Arrays.asList(array));
        Collections.shuffle(l);
        Question[] q = new Question[l.size()];
        return l.toArray(q);
        
    }
}   
    
