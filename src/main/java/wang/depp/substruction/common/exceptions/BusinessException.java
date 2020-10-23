package wang.depp.substruction.common.exceptions;

/**
 * Created by DEPP WANG on 23/10/2020
 */
public class BusinessException extends BaseException {
    private static final long serialVersionUID = 1L;

    public BusinessException(IResponseEnum responseEnum, Object[] args, String message) {
        super(responseEnum, args, message);
    }

    public BusinessException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {
        super(responseEnum, args, message, cause);
    }
}
