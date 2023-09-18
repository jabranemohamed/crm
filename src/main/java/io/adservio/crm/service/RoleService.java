package io.adservio.crm.service;

import io.adservio.crm.domain.Role;

import java.util.Collection;


public interface RoleService {
    Role getRoleByUserId(Long id);
    Collection<Role> getRoles();
}
