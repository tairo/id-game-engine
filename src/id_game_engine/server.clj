(ns id-game-engine.server
  (:require [noir.server :as server]
            [id-game-engine.models :as models]))

(server/load-views "src/id_game_engine/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8090"))]
    (models/initialize)
    (server/start port {:mode mode
                        :ns 'id-game-engine})))

