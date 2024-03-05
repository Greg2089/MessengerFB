package com.example.messengerfb;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class ChatViewModelFactory implements ViewModelProvider.Factory {
    private String currentUserID;
    private String otherUserID;

    public ChatViewModelFactory(String currentUserID, String otherUserID) {
        this.currentUserID = currentUserID;
        this.otherUserID = otherUserID;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new ChatViewModel(currentUserID, otherUserID);
    }
}
