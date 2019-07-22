package templates;

import java.util.List;
import java.util.Locale;

import java.util.TimeZone;
import java.math.MathContext.*;


public class Settings
{
    private String     policy;
    private Locale     locale;
    private TimeZone   timeZone;

    public String   getPolicy  () {
        return policy;
    }

    Settings( String policy )
    {this.policy = policy;
    }

    public void setPolicy(  String policy  ) {
        this.policy = policy;
    }

    public Locale getLocale() {
        return locale;
    }

    public
    void setLocale ( Locale locale ) {
        this.locale = locale;
    }

    public TimeZone
    getTimeZone (  ) {
        return timeZone;
    }



    public void setTimeZone( TimeZone timeZone )
    { this.timeZone = timeZone; }
}
