package priv.lint.Dome8;

import java.lang.reflect.Field;

public class Tool {
    public void setProperty(Object obj , String propertyName , Object value) throws NoSuchFieldException, IllegalAccessException {
        Class<?> aClass = obj.getClass(); //获取字节码对象

        // 获取该对象的propertyName 属性
        Field declaredField = aClass.getDeclaredField(propertyName);

        // 取消访问检查
        declaredField.setAccessible(true);
        // 对象赋值
        declaredField.set(obj,value);
    }
}
