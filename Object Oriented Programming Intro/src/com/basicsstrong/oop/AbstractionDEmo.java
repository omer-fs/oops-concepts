package com.basicsstrong.oop;

import java.util.ArrayList;

interface Mobile{

    public void calling(String number);

    public void sendMessage(String msg);
}

class Apple implements Mobile{
    private ArrayList<String> contacts = new ArrayList<String>();

    public void addContacts(String number){
        contacts.add(number);
    }
    @Override
    public void calling(String number) {
        System.out.println("Calling ... "+number);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("Sending message to ... "+msg);
    }
}

public class AbstractionDEmo {
    public static void main(String[] args) {
        Apple myPhone = new Apple();
        myPhone.calling("4234234234");
        myPhone.sendMessage("hello world");
        myPhone.addContacts("4242343634");

        Samsung myNewPhone = new Samsung();
        myNewPhone.calling("3423423");
        myNewPhone.sendMessage("my new phone is good");
        myNewPhone.addContact("423423423");
    }
}
abstract class Mobilee{
    ArrayList<String> list = new ArrayList<String>();
    abstract void calling(String number);
    abstract void sendMessage(String message);

    public void addContact(String contact) {
        list.add(contact);
    }
}

class Samsung extends Mobilee{
    @Override
    void calling(String number) {
        System.out.println("Calling ..."+number);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("Sending message ..."+message);
    }
}