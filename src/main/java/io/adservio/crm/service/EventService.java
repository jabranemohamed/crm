package io.adservio.crm.service;

import io.adservio.crm.domain.UserEvent;
import io.adservio.crm.enumeration.EventType;

import java.util.Collection;



public interface EventService {
    Collection<UserEvent> getEventsByUserId(Long userId);
    void addUserEvent(String email, EventType eventType, String device, String ipAddress);
    void addUserEvent(Long userId, EventType eventType, String device, String ipAddress);
}
