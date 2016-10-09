package examples.weldservlet.bean;

import java.time.ZonedDateTime;

import examples.weldservlet.interceptor.ZonedInterceptorBinding;

@ZonedInterceptorBinding
public class NowBean {

    public ZonedDateTime get() {
        return ZonedDateTime.now();
    }

}
