package org.butu.exception;

import org.butu.api.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author BUTU
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 捕获自定义异常
     */
    @ResponseBody
    @ExceptionHandler(value = ApiException.class)
    public R<Map<String, Object>> handle(ApiException e) {
        if (e.getErrorCode() != null) {
            return R.failed(e.getErrorCode());
        }
        return R.failed(e.getMessage());
    }
}
