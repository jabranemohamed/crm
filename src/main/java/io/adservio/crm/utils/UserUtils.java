package io.adservio.crm.utils;

import io.adservio.crm.domain.UserPrincipal;
import io.adservio.crm.dto.UserDTO;
import org.springframework.security.core.Authentication;


public class UserUtils {
    public static UserDTO getAuthenticatedUser(Authentication authentication) {
        return ((UserDTO) authentication.getPrincipal());
    }

    public static UserDTO getLoggedInUser(Authentication authentication) {
        return ((UserPrincipal) authentication.getPrincipal()).getUser();
    }
}
