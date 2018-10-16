#### Refactoring ch 2

#### Refactoring 이란

input 값과 output 값을 유지한 채, 내부 구조를 수정하는 행위를 말한다.

> 가독성과 원할한 유지보수를 위함.

유의할 점은 되도록 Input 값, 즉 API 부분이 바뀌는건 피해야한다.
단순히 내부 로직이면 해당 부분을 찾아 수정하면 되지만, 만약 어디서 쓰이는지 알 수 없는 상황이라면 문제가 된다.

> 당장 큰 시스템에서 reflection 을 사용한다고하면, 어디서 사용되는지 알기 어렵다.

또한 input 값이 바뀔 경우, TC도 바뀌어야하는데 이게 생각보다 비용이 높다.

#### 모자 두개

사람이 2개의 모자를 쓸 수 없다는 듯, 개발자도 리팩토링과 기능추가 중 하나만 진행해야한다.

> 리팩토링 과 기능추가를 각각 모자로 비유한다.

#### 왜 하는가

```
1. 소프트웨어 설계가 개선됨
2. 버그를 찾기 쉬워짐
3. 개발속도 증가
```

#### 1. 소프트웨어 설계가 개선됨

소프트웨어, 즉 개발 코드들은 출시 이후에도 지속적으로 변경된다. 때문에 점점 설계가 노후화된다.
리팩토링은 이러한 설계 노후화를 막고, 나아가 더 읽기 쉽고 변경가능하게 바꾸는 역할을 한다.

> 요즘 느끼는거지만 잘못된 리팩토링은 더 읽기 어렵게 만들어주는거 같다  ..

#### 2. 버그를 찾기 쉬워짐

위 내용과 이어지는 항목으로, 리팩토링을 통해 코드가 읽기 쉬워지면 문제가 있는 부분을 찾기가 더 쉬워진다.

#### 3. 개발속도 증가

리팩토링을 하면 오히려 시간이 더 소요되는게 아닐까 ? 라는 생각을 할 수 있지만, 장기적으로 봤을 때 가독성이 증가된다는건 그만큼 초기 코드를 파악하는 시간이 줄어든다는걸 의미한다.

#### 그럼 언제해야하는가 ?

```
1. 삼진아웃
2. 새 기능 추가
3. 버그 수정
```

#### 삼진 아웃

삼진 아웃은 중복된 코드를 3변 봤을 때, 리팩토링을 수행한다는 의미이다.

> 실제로 이번에 작업하면서 2번 이상 복붙한 코드를 리팩토링 했었다.

#### 새 기능 추가 및 버그 수정

새 기능을 추가할 때, 혹은 버그를 수정할때 리팩토링을 하는 이유는 코드를 보다 쉽게 읽기 위해서이다.
또한 리팩토링을 진행하다보면 세부 구현에 대해 더욱 깊은 이해를 할 수 있다.

> 확실히 그냥 지나쳤을 부분을 한번 더 보게 된다.


#### Indirection

인다이렉션을 개인적으로는 코드를 잘게 분리하는 것 이라고 이해했다.
코드를 잘게 분리할 경우 각 함수가 수행하는 책임들을 분할 할 수 있고, 각 실행부에 이름을 부여할 수 있으므로 조금더 가독성이 올라간다.