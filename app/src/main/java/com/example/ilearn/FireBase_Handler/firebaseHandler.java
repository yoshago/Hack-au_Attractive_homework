package com.example.ilearn.FireBase_Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class firebaseHandler {
    private FirebaseAuth firebaseAuth;
    private FirebaseUser firebaseUser;

    firebaseHandler(){
        firebaseAuth = FirebaseAuth.getInstance();
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
    }

    public void addData(data , String path){

    }

    public void setData(newData , String path){

    }

    public void addUser(name, email, imageUrl) {
        firebase.database().ref('users/' + userId).set({
                username: name,
                email: email,
                profile_picture : imageUrl
  });
    }


}
