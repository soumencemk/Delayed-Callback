# Delayed Callback API

![Java CI with Maven](https://github.com/soumencemk/Delayed-Callback/workflows/Java%20CI%20with%20Maven/badge.svg)

An API that can register a delayed event and process that when delay expired.

## How to use

* Use Maven and add dependency --

``` xml
<groupId>io.github.soumencemk</groupId>
<artifactId>DelayedCallback</artifactId>
<version>1.0</version>
```

* Register the callbacks using -

``` java
DelayedCallbacks.registerDelayedCallback(DELAY_TIME,callback);
```

Thats it!
When Delay is done, the callback api will be invoked automatically.
