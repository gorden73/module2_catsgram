package ru.yandex.practicum.catsgram.exceptions;

public class IncorrectParameterException extends RuntimeException {

    public IncorrectParameterException(String parameter) {
        super(parameter);
    }
}
