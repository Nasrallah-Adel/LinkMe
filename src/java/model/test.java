/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.imageio.spi.ServiceRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author mina george
 */
public class test {

    static SessionFactory sf = new Configuration().configure().buildSessionFactory();   //init
    static Session s = sf.openSession();
//        
//        static    Transaction tx = s.beginTransaction();

    public static void main(String[] args) {
//        UserCRUD c= new UserCRUD();
//        user user= new user();
//        user.setL_name("ms");
//        user.setF_name("ms");
//        user.setEmail("ms");
//        user.setCareer("ms");
//        user.setUsername("ms");
//        user.setPass("sm");
//        user.setPic("sm");
////        
////        
//      int x=  c.InsertUser(user,s);
//////        
//        if(x>0){
//            System.out.println("done");
//        }
//       if( c.CheckUsername("snns",s,tx)){
//             System.out.println("used");
//////          
////          }
//          else{
//          System.out.println("not");
////
//          }
//               List<user> per=c.CheckUserPassword("sbnns",s);
//               for(user u:per){
////               
//                   System.out.println(u.getPass());
//               }
//
//           if(c.CheckEmail("dd",s,tx)){
//                         System.out.println("used");
////
//           
//           }
//           else{
//                         System.out.println("not used");
//}
//                 List<user> l= c.getOneUserData("sbnns",s);
//                 for(user u : l){
//                     System.out.println(u.getCareer());
////                 
//                 }

        //////////////////////////////////////////////update
//                      
////                     user up =c.updateuser("ms", s);
////                    up.setEmail("zzzzaaa");
////                      s.getTransaction().commit();
//                     
//                      c.DeleteUser("snns",s);
//                   System.out.println( c.CheckUserPassword("sbnns",s)); 
//        s.beginTransaction();
//
//        exam e1 = new exam();
//        exam e2 = new exam();
//        e1.setA("A");
//        e1.setB("B");
//        e1.setC("C");
//        e1.setD("D");
//        e1.setExam_id(1);
//        e1.setLevel("2");
//        e1.setQuestion("e1e1e1e1e1");
//        e1.setType("Type1");
//
//        e2.setA("A");
//        e2.setB("B");
//        e2.setC("C");
//        e2.setD("D");
//        e2.setExam_id(2);
//        e2.setLevel("2");
//        e2.setQuestion("e2e2e2e2e2");
//        e2.setType("Type2");
//
//        user u1 = new user();
//        user u2 = new user();
//
//        u1.setCareer("android");
//        u1.setEmail("user1");
//        u1.setF_name("firstuser");
//        u1.setL_name("fisrt");
//        u1.setPass("slvkmdf");
//        u1.setPic("lskfvma");
//        u1.setUser_id(1);
//        u1.setUsername(";flbvkam");
//
//        u2.setCareer("android");
//        u2.setEmail("user2");
//        u2.setF_name("firstuser");
//        u2.setL_name("fisrt");
//        u2.setPass("slvkmdf");
//        u2.setPic("lskfvma");
//        u2.setUser_id(2);
//        u2.setUsername(";flbooovkam");
//
////        u1.getExam().add(e1);
////        u2.getExam().add(e2);
////
////        e1.getTest().add(u1);
////        e2.getTest().add(u2);
//
//        s.save(u1);
//        s.save(u2);
//
//        s.getTransaction().commit();
//        s.close();
//        sf.close();

    }

}
