/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.team.BigStore.Controllers;

import com.software.team.BigStore.DBConnections.Connection;
import com.software.team.BigStore.model.Answer;
import com.software.team.BigStore.model.Question;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 *
 * @author Saad
 */
public class QuestionController {

    private Connection con = null;
    private Session session = null;

    public QuestionController() {
        con = new Connection();
        session = con.getSession();
    }

    public void commitChanges() {
        session.getTransaction().commit();
    }

    public void saveQuestion(Question q) {
        int qid = getLastQuestionID();
        qid +=1;
        q.setQuestionId(qid);

        q.toString();

        session.save(q);
//        String sql = "INSERT INTO `question` (`questionId`, `question_content`, `question_date`, `owner_user_id`) VALUES ('"+qid+"', '"+content+"', '"+date+"', '"+id+"')";
//        System.out.println("question sql ==> "+sql);
//        SQLQuery query = session.createSQLQuery(sql);
//        query.executeUpdate();

    }

    public int getLastQuestionID(){
        SQLQuery query = session.createSQLQuery("SELECT `questionId` FROM `question` ORDER BY `questionId` DESC LIMIT 1");
        List<Integer> ids = query.list();
        if(ids.isEmpty()){
            return 0;
        }else{
            int q = ids.get(ids.size()-1);
            System.out.println("question id = "+q);
            return q;
        }
    }

    public void deleteQustion(Question q) {
        session.delete(q);
    }

    public void updateQustion(Question q) {
        session.update(q);
    }

    public ArrayList<Question> getAllQuestions(){
        ArrayList<Question> questions = new ArrayList();
        Query query = session.createQuery("from Question Order By question_date DESC");
        questions = (ArrayList<Question>) query.list();
        return questions;
    }

    public void saveAnswer(Answer a){
        int id = getLastAnswerID();
        id +=1;
        a.setAnswer_id(id);

        session.save(a);
    }

    public Question getQuestion(int id){
        Query q = session.createQuery("from Question where questionId = "+id);
        List<Question> qs = q.list();
        return qs.get(0);
    }

    public void deleteAnswer(Answer a) {
        session.delete(a);
    }

    public void updateAnswer(Answer a) {
        session.update(a);
    }

    public ArrayList<Answer> getAllAnswersForThatQuestion(int qid){
        ArrayList<Answer> answers = new ArrayList();
        Query query = session.createQuery("from Answer Where question_id = "+qid+" Order By date DESC");
        answers = (ArrayList<Answer>) query.list();
        return answers;
    }

    public ArrayList<Answer> getAllAnswers(){
        ArrayList<Answer> answers = new ArrayList();
        Query query = session.createQuery("from Answer");
        answers = (ArrayList<Answer>) query.list();
        return answers;
    }

    private int getLastAnswerID() {
        SQLQuery query = session.createSQLQuery("SELECT `answer_id` FROM `answer` ORDER BY `answer_id` DESC LIMIT 1");
        List<Integer> ids = query.list();
        if(ids.isEmpty()){
            return 0;
        }else{
            int a = ids.get(ids.size()-1);
            System.out.println("answer id = "+a);
            return a;
        }
    }

}
