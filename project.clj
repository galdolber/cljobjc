(defproject cljobjc "0.1.0-SNAPSHOT"
  :plugins [[lein-objcbuild "0.1.9"]]
  :aot :all
  :objcbuild {:main cljobjc.core/main}
  :dependencies [[galdolber/clojure-objc "1.7.0-RC1"]])
