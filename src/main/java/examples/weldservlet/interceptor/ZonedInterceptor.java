package examples.weldservlet.interceptor;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@ZonedInterceptorBinding
public class ZonedInterceptor {

    @AroundInvoke
    public Object invoke(InvocationContext context) throws Exception {
        ZonedDateTime result = ZonedDateTime.class.cast(context.proceed());
        return result.withZoneSameInstant(ZoneId.of("America/New_York"));
    }

}
