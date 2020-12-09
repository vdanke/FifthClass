package org.step.oop.annotations;

import java.lang.annotation.*;

/*
SOURCE - на этапе написания кода
CLASS - на этапе компиляции
RUNTIME - во время работы приложения
 */
@Documented // В JavaDoc
@Target(value = {ElementType.FIELD}) // Вешаем на Field
@Retention(RetentionPolicy.RUNTIME) // Доступны в RUNTIME
@Inherited // Все классы кто наследуется от класса с аннотацией наследуют и ее логику
public @interface IdMaker {}
