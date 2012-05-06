(defproject id-game-engine "0.1.0-SNAPSHOT"
            :description "Instruction Designer NEO/Clojure - Game Engine"
            :dependencies [[org.clojure/clojure "1.3.0"]
                           [org.clojure/clojure-contrib "1.1.0"]
                           [noir "1.2.1"]
                           [congomongo "0.1.9"]
                           ;;[mongoika "0.6.9"]
                           ]
            :main id-game-engine.server
            :dev-dependencies [[lein-eclipse "1.0.0"]])
