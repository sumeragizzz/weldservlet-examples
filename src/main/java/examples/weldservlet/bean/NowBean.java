package examples.weldservlet.bean;

import java.time.ZonedDateTime;

import javax.enterprise.context.Dependent;

import examples.weldservlet.interceptor.ZonedInterceptorBinding;

@Dependent
@ZonedInterceptorBinding
public class NowBean {

    public ZonedDateTime get() {
        return ZonedDateTime.now();
    }

}
