# 開始コマンド
```bash
gradle init --type=java-application
```

# HOW TO RUN
```bash
./gradlew :app:run
```

# 利用するライブラリ
- https://qiita.com/niwasawa/items/ba09e1a00dc59d894024 これをやる

# 実行結果
```
> Task :app:run
Hello World!
20:05:15.435 [main] INFO  c.l.gradle.java.helloworld.App - Hello Info
20:05:15.437 [main] WARN  c.l.gradle.java.helloworld.App - Hello Warn
20:05:15.438 [main] ERROR c.l.gradle.java.helloworld.App - Hello Error
20:05:15.438 [main] DEBUG c.l.g.java.helloworld.DebugLogClass - Hello Debug
20:05:15.438 [main] INFO  c.l.g.java.helloworld.DebugLogClass - Hello Info
20:05:15.438 [main] WARN  c.l.g.java.helloworld.DebugLogClass - Hello Warn
20:05:15.438 [main] ERROR c.l.g.java.helloworld.DebugLogClass - Hello Error
20:05:15.439 [main] INFO  c.l.g.java.helloworld.InfoLogClass - Hello Info
20:05:15.439 [main] WARN  c.l.g.java.helloworld.InfoLogClass - Hello Warn
20:05:15.439 [main] ERROR c.l.g.java.helloworld.InfoLogClass - Hello Error
20:05:15.440 [main] WARN  c.l.g.java.helloworld.WarnLogClass - Hello Warn
20:05:15.440 [main] ERROR c.l.g.java.helloworld.WarnLogClass - Hello Error
20:05:15.443 [main] ERROR c.l.g.java.helloworld.ErrorLogClass - Hello Error
```
