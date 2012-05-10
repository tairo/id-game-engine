(ns id-game-engine.views.login
  (:require [id-game-engine.views.common :as common]
            [id-game-engine.models.users :as users])
  (:use [noir.core :only [defpage]]
        [noir.response :only [redirect]]
        [hiccup.core :only [html]]
        [hiccup.form-helpers]))

(defpage [:post "/login"] {:keys [username password]}
         (if (users/login! {:username username :password password})
           ;; If Exist, 
           (redirect "/main")
           ;; IF Not exist, create this user - experimental
           (common/welcome-layout
             (form-to [:post "/create"]
                    [:center
                     [:table
                      [:tr
                       [:td "Login"]
                       [:td (text-field "username" username)]]
                      [:tr
                       [:td "Password"]
                       [:td (text-field "password" password)]]]
                     (submit-button "Create")]))))

(defpage [:post "/create"] {:keys [username password]}
         (do
           (users/add! {:username username :password password :level 0})
           (redirect "/login")))
