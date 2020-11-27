package org.nutz.mapl;

/**
 * 将输入理解成Map+List
 * @author juqkai(juqkai@gmail.com)
 */
public interface IMaplCompile<T> {
    public Object parse(T t);
}
