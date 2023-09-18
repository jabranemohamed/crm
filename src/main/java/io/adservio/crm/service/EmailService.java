package io.adservio.crm.service;

import io.adservio.crm.enumeration.VerificationType;



public interface EmailService {
    void sendVerificationEmail(String firstName, String email, String verificationUrl, VerificationType verificationType);
}
