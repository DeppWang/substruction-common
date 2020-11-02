package wang.depp.substruction.common;

import java.util.Optional;

/**
 * Created by DEPP WANG on 23/10/2020
 */
public class ApiResponse<T> {
    private int code;
    private String message;
    private T data;

    private ApiResponse(int code, String message, T data) {
        this.code = code;
        this.message = (String) Optional.ofNullable(message).orElse("");
        this.data = data;
    }

    private ApiResponse(int code, T data) {
        this(code, (String)null, data);
    }

    public static ApiResponse<Void> success() {
        return success(null);
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse(200, data);
    }

    public static <T> ApiResponse<T> fail(int code) {
        return fail(code, (String)null);
    }

    public static <T> ApiResponse<T> fail(int code, String failMsg) {
        return new ApiResponse(code, failMsg, (Object)null);
    }

    public static <T> ApiResponse<T> fail(int code, String failMsg, T data) {
        return new ApiResponse(code, failMsg, data);
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public String toString() {
        return "ApiResponse(code=" + this.getCode() + ", message=" + this.getMessage() + ", data=" + this.getData() + ")";
    }

    private ApiResponse() {
    }
}
