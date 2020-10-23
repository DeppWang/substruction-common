package wang.depp.substruction.common.exceptions;

/**
 * Created by DEPP WANG on 23/10/2020
 */
public abstract class BaseException extends RuntimeException {
    private int code;
    private String message;
    private Object[] args;
    private IResponseEnum responseEnum;

    public BaseException(IResponseEnum iResponseEnum, Object[] args, String message) {
        super(message);
        this.code = iResponseEnum.getCode();
        this.message = message;
        this.responseEnum = iResponseEnum;
        this.args = args;
    }

    public BaseException(IResponseEnum iResponseEnum, Object[] args, String message, Throwable cause) {
        super(message, cause);
        this.code = iResponseEnum.getCode();
        this.message = message;
        this.responseEnum = iResponseEnum;
        this.args = args;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Object[] getArgs() {
        return this.args;
    }

    public IResponseEnum getResponseEnum() {
        return this.responseEnum;
    }
}
