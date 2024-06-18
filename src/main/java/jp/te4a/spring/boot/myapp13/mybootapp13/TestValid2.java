package jp.te4a.spring.boot.myapp13.mybootapp13;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

public class TestValid2{
@Documented
@Constraint(validatedBy = TestValidator2.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Writter {
 String ok();
 String message() default "input other than {ok}.";
 // Classオブジェクトを得る（戻り値とする）メソッドgroups()
 // デフォルト値は空のクラス
 Class<?>[] groups() default {};
 // Payloadクラスを継承したClassオブジェクトを得る
 // （戻り値とする）メソッドpayload()、デフォルト値は空のクラス
 Class<? extends Payload>[] payload() default{};
}
}