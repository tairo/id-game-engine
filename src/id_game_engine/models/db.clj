(ns id-game-engine.models.db
  (:require [somnium.congomongo :as mongodb]))

(def id-db-conn
  (mongodb/make-connection "id-test"
                   :host "127.0.0.1"
                   :port 27017))

(defn init! []
  (mongodb/set-connection! id-db-conn))