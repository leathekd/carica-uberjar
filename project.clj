(defproject carica-uberjar "0.1.0"
  :description "An uberjar example for Carica"
  :url "https://github.com/leathekd/carica-uberjar"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [sonian/carica "1.2.1"]]
  :min-lein-version "2.0.0"
  :main carica-uberjar.core
  :aot [carica-uberjar.core])
