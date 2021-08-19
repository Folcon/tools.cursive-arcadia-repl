(defproject eponai/tools.cursive-arcadia-repl "0.1.0-SNAPSHOT"
  :description "nREPL bridge for Arcadia Unity"
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [nrepl "0.9.0-beta1"]
                 [org.clojure/tools.cli "1.0.206"]]
  :main ^:skip-aot eponai.tools.cursive-arcadia-repl
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
