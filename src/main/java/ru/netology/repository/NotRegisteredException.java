package ru.netology.repository;

public class NotRegisteredException extends RuntimeException {

    public NotRegisteredException (String msg) {
        super(msg);
    }
}
