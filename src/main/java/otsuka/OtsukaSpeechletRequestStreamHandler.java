package otsuka;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;
import otsuka.OtsukaSpeechlet;


/**
public class OtsukaSpeechletRequestStreamHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);

        // TODO: implement your handler
        return input;
    }

}
**/

/**
 * This class is created by the Lambda environment when a request comes in. All calls will be
 * dispatched to the Speechlet passed into the super constructor.
 */
public final class OtsukaSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {

		
	private static final Set<String> supportedApplicationIds;

    static {
        /*
         * This Id can be found on https://developer.amazon.com/edw/home.html#/ "Edit" the relevant
         * Alexa Skill and put the relevant Application Ids in this Set.
         *
         *  arn:aws:lambda:us-east-1:653848917847:function:CPG-Skill
         *  amzn1.ask.skill.45fc3391-0000-44c8-b024-f76d041832e5
         *  
         */
    	
        supportedApplicationIds = new HashSet<String>();
        //amzn1.echo-sdk-ams.app.[]
         supportedApplicationIds.add("amzn1.ask.skill.c7f22ed7-ba9e-450a-a0d8-dff647c3a282");
    }

    public OtsukaSpeechletRequestStreamHandler() {
        super(new OtsukaSpeechlet(), supportedApplicationIds);
    }
}



