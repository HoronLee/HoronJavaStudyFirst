# 面向对象
## 继承 多态

1. Super调用父类构造方法，必须在构造方法中的第一个
2. super只能出现在子类的方法或者构造方法中
3. super和this不能痛失调用构造方法
4. this：本身调用着这个对象
5. 没有继承也能使用 
6. this();本类的对象 
7. super：代表父类对象的应用 
8. 比如有继承关系才能用 
9. super();父类的对象

## 重写
1. 需要有继承关系，子类重写父类的方法
2. 方法名·参数列表必须相同
3. 修饰符：范围可以扩大不能缩小（private=>public）
4. 抛出的异常：可以被缩小，但不能扩大（CLassNotFoundExpection=>Expection）
### 子类和父类的方法必须一致，方法体不同
#### 为什么需要重写？
1. 父类的功能，子类不一定需要，或者不一定满足
Alt + Insert => @Obberide