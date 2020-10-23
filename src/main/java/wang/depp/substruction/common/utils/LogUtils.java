package wang.depp.substruction.common.utils;

import org.slf4j.MDC;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by DEPP WANG on 23/10/2020
 */
public class LogUtils {
    private static final String MDC_TRACE_ID = "mdc.trace";
    private static ThreadLocal<String> keys = ThreadLocal.withInitial(() -> "trace_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS")));

    public LogUtils() {
    }

    public static void reset() {
        keys.remove();
    }

    public static String getTraceId() {
        return (String)keys.get();
    }

    public static void addTrace(String traceId) {
        MDC.put("mdc.trace", traceId);
    }

    public static void addTrace() {
        MDC.put("mdc.trace", getTraceId());
    }

    public static void resetTrace() {
        MDC.remove("mdc.trace");
    }
}
