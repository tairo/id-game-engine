(ns id-game-engine.views.login
  (:require [id-game-engine.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage [:post "/login"] {:keys [UserId Password]}
         (common/layout
           [:p "UserId " UserId]
           [:p "Password " Password]))
