### Design Patterns

#### Decorator

- 新しい振る舞いや責務を追加するためにオブジェクトをラップする。

#### Adaptor

- 相互性のない interface のためにそのままでは連携できないクラスを連携させる。つまり interface を連携できる形へ変換するためにオブジェクトをラップする。

#### Facade

- サブシステムの一連のインターフェースに対する、連続されたインターフェースを提供。ファサードは、サブシステムをより使いやすくする高水準インターフェースを定義する。(クライアントを複雑なサブシステムから分離する)

#### Template method

- アルゴリズムの手順を定義し、１つ以上の手順をサブクラスで提供できるようにする（共通部分を汎化する。スーパークラスはアルゴリズムに関する知識に集中し、完全な実装の提供をサブクラスに任せる。）

### 設計原則

- `Principle of Least Knowledge` : オブジェクト間のやりとりを少数の身近な「友達」だけに減らすようにする

```java
// NO!!!
public float getTemp(){
  Thermometer thermometer = station.getThermometer();
  return thermometer.getTemperature(); // 友達の友達を読み出さない
}
// YES!
public float getTempt(){
  return station.getTemperature(); // 依存するクラス数を減らす
}
```

### 用語

- `Component`: インスタンス変数で参照されるあらゆるオブジェクト。言い換えれば、`has-a`関係である。
- `hook`: デフォルトで何もしないメソッド。 サブクラスはオーバーライドしないといけないわけではないため`フック`と呼ばれる。
  - アルゴリズムの一部がオプションである場合は hook を使う
