(ns id-game-engine.models
  (:require [somnium.congomongo :as mongodb]
            [id-game-engine.models.db :as id-db]
            [id-game-engine.models.users :as users]))

(defn initialize []
  (id-db/init!)
  (when (empty? (mongodb/fetch :users :where {:username "admin"}))
    ;;db values need to be initialized.. this should only happen once.
    (id-db/init!)
    (users/init!)
    ))
