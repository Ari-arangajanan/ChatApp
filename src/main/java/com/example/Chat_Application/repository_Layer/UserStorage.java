package com.example.Chat_Application.repository_Layer;import java.util.HashSet;import java.util.Set;public class UserStorage {    private static UserStorage instance;    private Set<String> users;    private UserStorage (){        users = new HashSet<>();    }    public static synchronized UserStorage getInstance(){        if (instance==null){            instance=new UserStorage();        }        return instance;    }    public Set<String> getUsers() {        return users;    }    public void setUsers(String userName) throws Exception {        if(users.contains(userName)){            try {                throw new Exception("user is alreasdy exist :s" + userName);            } catch (Exception e) {                throw new RuntimeException(e);            }        }        users.add(userName);    }}