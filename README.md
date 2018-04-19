# Design Patterns

:tokyo_tower: Learn design patterns through Java / Kotlin

## [简单工厂模式](https://github.com/AndroidHot/Design-Patterns/tree/master/simplefactory)

简单工厂模式提供了专门的工厂类用于创建对象，将对象的创建和对象的使用分离开，是工厂模式中最简单的一种。

**优点**：
- 实现了对象创建和使用的分离

**缺点**：
- 工厂类过度复杂
- 不利于扩展和维护

**适用场景**：
- 工厂类负责创建的对象比较少
- 客户端只知道传入工厂类的参数，对于如何创建对象并不关心。

## [工厂方法模式](https://github.com/AndroidHot/Design-Patterns/tree/master/factorymethod)
工厂方法模式是简单工厂模式的延伸，它继承了简单工厂模式的优点，同时还弥补了一些简单工
厂模式的不足。工厂方法模式是使用频率最高的设计模式之一，是很多开源框架和 API 类库的
核心模式，在 Android 源码里也能经常看见它的身影。

**优点**：
- 实现了对象创建和使用的分离
- 易于扩展和维护

**缺点**：
- 在一定程度上增加了系统的复杂度

**适用场景**：
- 客户端不需要知道它所创建对象的类
- 在意系统的可扩展性
