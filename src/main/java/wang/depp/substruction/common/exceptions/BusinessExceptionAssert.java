package wang.depp.substruction.common.exceptions;

import java.text.MessageFormat;

/**
 * Created by DEPP WANG on 23/10/2020
 */
public interface BusinessExceptionAssert extends IResponseEnum, Assert {
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BusinessException(this, args, msg);
    }

    default BaseException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BusinessException(this, args, msg, t);
    }
}
