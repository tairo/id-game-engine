(ns id-game-engine.views.welcome
  (:require [id-game-engine.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to id-game-engine"]))
