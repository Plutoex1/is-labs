package ru.itmo.marines.event;

/** Событие изменения данных */
public record ChangeEvent(String entity, String action, Long id) {
}
