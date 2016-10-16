package examples.weldservlet.bean;

import java.time.format.DateTimeFormatter;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Dependent
public class DateTimeFormatBean {

    @Inject
    private NowBean nowBean;

    public String get() {
        return nowBean.get().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

}
