(defproject cljobjc "0.1.0-SNAPSHOT"
  :plugins [[lein-objcbuild "0.1.7"]]
  :aot :all
  :objcbuild {:archs [:i386 :x86_64]
              :frameworks [:Foundation :Security]
              :main cljobjc.core/main}
  :dependencies [[galdolber/clojure-objc "1.7.0-beta2"]])
