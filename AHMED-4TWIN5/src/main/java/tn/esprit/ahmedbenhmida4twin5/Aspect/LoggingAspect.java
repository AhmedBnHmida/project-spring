package tn.esprit.ahmedbenhmida4twin5.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    @Before("execution(* tn.esprit.ahmedbenhmida4twin5.services.*.*(..))")
    public void MethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method : " + name);
    }

    @After("execution(* tn.esprit.ahmedbenhmida4twin5.services.*.*(..))")
    public void outOfMethod(JoinPoint joinPoint) {
        log.info("Out of method : " + joinPoint.getSignature().getName());
    }

}

