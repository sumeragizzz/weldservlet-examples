package examples.weldservlet.bean;

import java.time.format.DateTimeFormatter;

import javax.inject.Inject;

public class DateTimeFormatBean {

    @Inject
    private NowBean nowBean;

    public String get() {
        return nowBean.get().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

}
