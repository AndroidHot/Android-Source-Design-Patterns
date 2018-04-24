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

## [抽象工厂模式](https://github.com/AndroidHot/Design-Patterns/tree/master/abstractfactory)
抽象工厂模式是工厂方法模式的进一步延伸，它提供了功能更为强大的工厂类，并且具备较好的可扩展性。

**优点**：
- 实现了对象创建和使用的分离
- 易于扩展和维护
- 增加新的产品族很方便

**缺点**：
- 增加新的产品等级结构麻烦，不完全符合“开闭原则”

**适用场景**：
- 客户端不需要知道它所创建对象的类
- 在意系统的可扩展性
- 系统中的产品族不止一个，而客户端每次只使用其中一个产品族
- 产品等级结构稳定，设计完成之后不会向系统中增加或删除产品等级结构

## [适配器模式](https://github.com/AndroidHot/Design-Patterns/tree/master/adapter)
适配器模式将现有接口转换为客户端所期望的接口，实现了对现有类的复用。

**适用场景**：
- 进行不兼容的类型转换
- 输入有很多种情况，但输出类型是统一的

## [组合模式](https://github.com/AndroidHot/Design-Patterns/tree/master/composite)
组合模式使用面向对象的思想来实现树形结构的构建和处理，描述了如何将容器对象和叶子对象进行递归组合，实现简单，灵活性好。
**优点**：
- 组合模式可以清楚地定义分层次的复杂对象，表示对象的全部或部分层次，它让客户端忽略了层次的差异，方便对整个层次结构进行控制。
- 客户端可以一致地使用一个组合结构或其中单个对象，不必关心处理的是单个对象还是整个组合结构，简化了客户端代码。
- 在组合模式中增加新的容器构件和叶子构件都很方便，无须对现有类库进行任何修改，符合“开闭原则”。
- 组合模式为树形结构的面向对象实现提供了一种灵活的解决方案，通过叶子对象和容器对象的递归组合，可以形成复杂的树形结构，但对树形结构的控制却非常简单。

**缺点**：
- 在增加新构件时很难对容器中的构件类型进行限制。有时候我们希望一个容器中只能有某些特定类型的对象，例如在某个文件夹中只能包含文本文件，使用组合模式时，不能依赖类型系统来施加这些约束，因为它们都来自于相同的抽象层，在这种情况下，必须通过在运行时进行类型检查来实现，这个实现过程较为复杂。

**适用场景**：
- 在具有整体和部分的层次结构中，希望通过一种方式忽略整体与部分的差异，客户端可以一致地对待它们。
- 在一个使用面向对象语言开发的系统中需要处理一个树形结构。
- 在一个系统中能够分离出叶子对象和容器对象，而且它们的类型不固定，需要增加一些新的类型。

## [外观模式](https://github.com/AndroidHot/Design-Patterns/tree/master/facade)
外观模式是一种使用频率非常高的设计模式，它通过引入一个外观角色来简化客户端与子系统之间的交互，为复杂的子系统调用提供一个统一的入口，使子系统与客户端的耦合度降低，且客户端调用非常方便。外观模式并不给系统增加任何新功能，它仅仅是简化调用接口。

**Wikipedia**:

> A facade is an object that provides a simplified interface to a larger body of code, such as a class library.
