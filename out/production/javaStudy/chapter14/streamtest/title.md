# 스트림의 연산
- 중간연산과 최종연산이있다.
- 중간연산의 결과는 스트림이고 최종연산은 스트림을 소모한다.
- 중간연산의 결과가 스트림이기에 중간연산한뒤 또 다시 중간연산을하거나 최종연산을 할수있다.
- 최종연산은 스트림을 소모하여 연산하기에 마지막에 한번밖에 연산을 할수 없다.
- 중간연산은 n번, 최종연산은 1번 가능하다.