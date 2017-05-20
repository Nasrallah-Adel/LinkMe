/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 *
 * @author mina george
 */
@Entity
public class exam implements Serializable {

    @Id
    private int exam_id;
    private String question;
    private String A;
    private String B;
    private String C;
    private String D;
    private String answer;
    private String level;
    private String type;
    
    
//    @ManyToMany(cascade = CascadeType.ALL, targetEntity = user.class)
//    private Set<user> users = new HashSet<>(0);
//
//    @JoinTable(name = "user_exam", joinColumns = {
//        @JoinColumn(name = "exam_id")}, inverseJoinColumns = {
//        @JoinColumn(name = "user_id")}
//    )
//    public Set<user> getTest() {
//        return users;
//    }
//
//    public void setTest(Set<user> users) {
//        this.users = users;
//    }
    
    
    

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getA() {
        return A;
    }

    public void setA(String A) {
        this.A = A;
    }

    public String getB() {
        return B;
    }

    public void setB(String B) {
        this.B = B;
    }

    public String getC() {
        return C;
    }

    public void setC(String C) {
        this.C = C;
    }

    public String getD() {
        return D;
    }

    public void setD(String D) {
        this.D = D;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
