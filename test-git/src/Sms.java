



import java.util.*;

import com.twilio.sdk.*;
import com.twilio.sdk.resource.factory.*;
import com.twilio.sdk.resource.instance.*;
import com.twilio.sdk.resource.list.*;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class Sms {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID = "AC3391e2288ecc91b0a7bf02bc600b64f0";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

        // Build the parameters
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("To", "+14159352345"));
        params.add(new BasicNameValuePair("From", "+14158141829"));
        params.add(new BasicNameValuePair("Body", "Where's Wallace?"));

      MessageFactory messageFactory = client.getAccount().getMessageFactory();
       Message message = messageFactory.create(params);

        System.out.println(message.getSid());
    }
}