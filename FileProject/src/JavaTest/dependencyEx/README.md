### 직접 만든 의존성에 대한 간단한 예제
- Paper class
  + Paper class의 생성자에서, new 생성자를 통해 Pen 객체를 생성해줌.
  + Paper draw() 메소드를 실행하기 위해, Pen class의 draw() 메소드가 필요함.

**-> Paper class가 Pen class에 의존성을 가지고 있음.**

- 의존성으로 인해 Unit Test 및 Code 변경이 어려워짐.
***
### DI란
- 객체를 직접 생성하는 게 아니라 외부에서 생성한 후 주입 시켜주는 방식
- DI를 통해 모듈 간의 결합도가 낮아지고 유연성이 높아짐. .