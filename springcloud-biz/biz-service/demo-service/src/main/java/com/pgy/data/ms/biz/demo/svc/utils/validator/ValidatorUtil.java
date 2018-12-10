package com.pgy.data.ms.biz.demo.svc.utils.validator;


import com.pgy.data.ms.biz.demo.svc.exception.CommonException;
import org.hibernate.validator.HibernateValidator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @author ginko
 * @date 2018/12/10 14:59
 */
public class ValidatorUtil {
    private static Validator validator = Validation
            .byProvider(HibernateValidator.class)
            .configure()
            .failFast(true)
            .buildValidatorFactory()
            .getValidator();

    /**
     * 实体校验
     *
     * @param obj
     * @throws CommonException
     */
    public static <T> void validate(T obj) throws CommonException {
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(obj);
        if (constraintViolations.size() > 0) {
            ConstraintViolation<T> validateInfo = constraintViolations.iterator().next();
            // validateInfo.getMessage() 校验不通过时的信息，即message对应的值
            throw new CommonException("0001", validateInfo.getMessage());
        }
    }
}