package com.company;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;


    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
        this.callback = callback;
    }

    public void start() {
        for (int i = 0; i < 67; i++) {
            callback.onDone("Task " + i + " is done");
        }
        for (int i = 67; i < 100; i++) {
            errorCallback.onError("Task " + i + " is error");
        }

    }
}


