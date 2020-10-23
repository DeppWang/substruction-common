package wang.depp.substruction.common.exceptions;

/**
 * Created by DEPP WANG on 23/10/2020
 */
public interface Assert {
    BaseException newException(Object... var1);

    BaseException newException(Throwable var1, Object... var2);

    default void assertNotNull(Object obj) {
        if (obj == null) {
            throw this.newException((Object[])null);
        }
    }

    default void assertNotNull(Object obj, Object... args) {
        if (obj == null) {
            throw this.newException(args);
        }
    }

    default void assertTrue(boolean flag) {
        if (!flag) {
            throw this.newException((Object[])null);
        }
    }

    default void assertTrue(boolean flag, Object... args) {
        if (!flag) {
            throw this.newException((Object[])null);
        }
    }
}
