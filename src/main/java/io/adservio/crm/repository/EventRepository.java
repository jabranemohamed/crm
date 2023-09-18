package io.adservio.crm.repository;

import io.adservio.crm.domain.UserEvent;
import io.adservio.crm.enumeration.EventType;

import java.util.Collection;


public interface EventRepository {
    Collection<UserEvent> getEventsByUserId(Long userId);
    void addUserEvent(String email, EventType eventType, String device, String ipAddress);
    void addUserEvent(Long userId, EventType eventType, String device, String ipAddress);
}
