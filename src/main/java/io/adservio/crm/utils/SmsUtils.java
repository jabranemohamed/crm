package io.adservio.crm.utils;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import static com.twilio.rest.api.v2010.account.Message.creator;


public class SmsUtils {
    public static final String FROM_NUMBER = "0015177422073";
    public static final String SID_KEY = "ACb2ef457dffda7986af7caf0a9170a74d";
    public static final String TOKEN_KEY = "c9104ace7ad40d48abafbcb86d8ea45f";

    public static void sendSMS(String to, String messageBody) {
        Twilio.init(SID_KEY, TOKEN_KEY);
        Message message = creator(new PhoneNumber("+" + to), new PhoneNumber(FROM_NUMBER), messageBody).create();
        System.out.println(message);
    }
}
