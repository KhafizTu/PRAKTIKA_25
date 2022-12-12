package classes;

import enums.WhatsAppStatus;

public class Profil {
    private long id;
    private String phoneNumber;
    private String userName;
    private WhatsAppStatus whatsAppStatus;
    private Profil profil;

    public Profil(long id, String phoneNumber, String userName, WhatsAppStatus whatsAppStatus, Profil profil) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.whatsAppStatus = whatsAppStatus;
        this.profil = profil;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public WhatsAppStatus getWhatsAppStatus() {
        return whatsAppStatus;
    }

    public void setWhatsAppStatus(WhatsAppStatus whatsAppStatus) {
        this.whatsAppStatus = whatsAppStatus;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }

    @Override
    public String toString() {
        return "Profil{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", whatsAppStatus=" + whatsAppStatus +
                ", profil=" + profil +
                '}';
    }
}

