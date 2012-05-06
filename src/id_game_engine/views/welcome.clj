(ns id-game-engine.views.welcome
  (:require [id-game-engine.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/welcome-layout
           [:p "Instruction Designer NEO/Clojure"]))
