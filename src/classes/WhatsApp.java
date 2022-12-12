package classes;

import enums.Country;
import enums.Gender;
import enums.WhatsAppStatus;
import service.WhatsAppService;

import java.time.LocalDate;
import java.util.ArrayList;

public class WhatsApp {


    private int id;
    private String phoneNumber;
    private WhatsAppStatus whatsAppStatus;
    private String userName;
    private String password;
    private ArrayList<String>massage;

    public WhatsApp() {
    }

    public WhatsApp(int id, String phoneNumber, WhatsAppStatus whatsAppStatus, String userName, String password, ArrayList<String> massage) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.whatsAppStatus = whatsAppStatus;
        this.userName = userName;
        this.password = password;
        this.massage = massage;
    }

    public WhatsApp(int id, String phoneNumber, WhatsAppStatus whatsAppStatus, String userName, ArrayList<String> massage) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.whatsAppStatus = whatsAppStatus;
        this.userName = userName;
        this.massage = massage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public WhatsAppStatus getWhatsAppStatus() {
        return whatsAppStatus;
    }

    public void setWhatsAppStatus(WhatsAppStatus whatsAppStatus) {
        this.whatsAppStatus = whatsAppStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<String> getMassage() {
        return massage;
    }

    public void setMassage(ArrayList<String> massage) {
        this.massage = massage;
    }

    @Override
    public String  toString() {
        return "WhatsApp{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", whatsAppStatus=" + whatsAppStatus +
                ", userName='" + userName + '\'' +
                ", massage=" + massage +
                '}';
    }
}

