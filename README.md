# carica-uberjar

## Usage

```
~/tmp/carica-uberjar $ lein uberjar
Compiling carica-uberjar.core
Compiling carica-uberjar.core
Created ~/tmp/carica-uberjar/target/carica-uberjar-0.1.0.jar
Created ~/tmp/carica-uberjar/target/carica-uberjar-0.1.0-standalone.jar

~/tmp/carica-uberjar $ java -jar target/carica-uberjar-0.1.0-standalone.jar
:config-file nil
{:config-value "set in resources",
 :resources-config "another value set in resources"}

~/tmp/carica-uberjar $ java -jar target/carica-uberjar-0.1.0-standalone.jar test/resources/config.edn 
:config-file config.edn
{:config-value "set on the cli",
 :resources-config "another value set in resources",
 :cli-test "also set on the cli"}
```

## License

Copyright © 2015 David Leatherman
