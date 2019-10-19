package com.richard.feature.java8.optional;

import com.richard.feature.java8.lambda.Person;

import java.util.Optional;

/**
 * @Description TODO
 * @Author Richard
 * @Date 2019/10/19 9:46
 **/
public class OptionalTest {

    public static void main(String[] args) {
        /***
         * boolean equals(Object obj)：判断其他对象是否等于 Optional；
         * 2. Optional<T> filter(Predicate<? super <T> predicate)：如果值存在，并且这个值匹配给定的 predicate，返回一个Optional用以描述这个值，否则返回一个空的Optional；
         * 3. <U> Optional<U> flatMap(Function<? super T,Optional<U>> mapper)：如果值存在，返回基于Optional包含的映射方法的值，否则返回一个空的Optional；
         * 4. T get()：如果在这个Optional中包含这个值，返回值，否则抛出异常：NoSuchElementException；
         * 5. int hashCode()：返回存在值的哈希码，如果值不存在 返回 0；
         * 6. void ifPresent(Consumer<? super T> consumer)：如果值存在则使用该值调用 consumer , 否则不做任何事情；
         * 7. boolean isPresent()：如果值存在则方法会返回true，否则返回 false；
         * 8. <U>Optional<U> map(Function<? super T,? extends U> mapper)：如果存在该值，提供的映射方法，如果返回非null，返回一个Optional描述结果；
         * 9. T orElse(T other)：如果存在该值，返回值， 否则返回 other；
         * 10. T orElseGet(Supplier<? extends T> other)：如果存在该值，返回值， 否则触发 other，并返回 other 调用的结果；
         * 11. <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier)：如果存在该值，返回包含的值，否则抛出由 Supplier 继承的异常；
         * 12. String toString()：返回一个Optional的非空字符串，用来调试
         *
         *
         */

        Optional<Person> p = Optional.of(new Person());
        System.out.println(p.map(Person::getName).orElse(null));

        p.flatMap(t->{
            return Optional.of(t.getName());
        });

    }
}
