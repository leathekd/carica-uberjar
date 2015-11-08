(ns carica-uberjar.core
  (:gen-class)
  (:require [carica.core :as cfg]
            [clojure.java.io :as io]
            [clojure.pprint :refer [pprint]]))

(defn config-fn [config-file]
  (cfg/configurer (concat [config-file]
                          (cfg/resources "config.edn"))))

(defn -main [& args]
  (let [config-file (and (first args) (io/file (first args)))
        config (if (and config-file (.exists config-file))
                 (config-fn (.getAbsolutePath config-file))
                 cfg/config)]
    (println :config-file (and config-file
                               (.getName config-file)))
    (pprint (config))))
