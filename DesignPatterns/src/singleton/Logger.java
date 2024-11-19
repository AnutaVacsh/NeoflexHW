package singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger log;
    private Logger() {}

    public static Logger getLog(){
        if(log == null) log = new Logger();
        return log;
    }

    public void ClassLog(Object obj, String info){
        String className = obj.getClass().getSimpleName();

        String date = new SimpleDateFormat("dd.MM.yy").format(new Date());

        System.out.printf("Log info: %s - %s - %s%n", date, className, info);

    }
}
