/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author nasrallah
 */
class SMTP extends Authenticator {

    String d_user = "linkme.n8mh", d_pass = "LinkMe123456789", d_host = "smtp.gmail.com", from = "linkme.n8mh@gmail.com", to = "naseradel54@gmail.com";
    int port = 465;

    public String getD_user() {
        return d_user;
    }

    public void setD_user(String d_user) {
        this.d_user = d_user;
    }

    public String getD_pass() {
        return d_pass;
    }

    public void setD_pass(String d_pass) {
        this.d_pass = d_pass;
    }

    public String getD_host() {
        return d_host;
    }

    public void setD_host(String d_host) {
        this.d_host = d_host;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public PasswordAuthentication getpassaut() {
        return new PasswordAuthentication(d_user, d_pass);
    }
}