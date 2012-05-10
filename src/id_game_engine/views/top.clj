(ns id-game-engine.views.top
  (:require [id-game-engine.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]
        [hiccup.form-helpers]))

(defpage "/" []
         (common/layout 
           (common/id-title-banner "alpha 1.0")
           (form-to [:post "/create"]
                    [:center
                     [:table
                      [:tr
                       [:td "Login"]
                       [:td (text-field "username")]]
                      [:tr
                       [:td "Password"]
                       [:td (password-field "password")]]]
                     (submit-button "Login")])))