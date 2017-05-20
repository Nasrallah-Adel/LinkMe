/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author nasrallah
 */
@Entity
public class contact_us {
    @Id
    int id;
    String user_name;
    String email;
    String msg;
    
}
