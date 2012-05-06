(ns id-game-engine.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
  (html5
    [:head
     [:title "id-game-engine"]
     (include-css "/css/reset.css")]
    [:body
     [:div#wrapper
      content]]))

(defpartial welcome-layout [& content]
  (html5
    [:head
     [:title "id-game-engine"]
     (include-css "/css/reset.css")]
    [:body
     [:div#wrapper
      content]]))

(defpartial basic [& content]
  (html5
    [:head
     [:title "id-game-engine"]
     (include-css "/css/reset.css")]
    [:body
     [:div#wrapper
      content]]))

(defpartial id-title-banner [& version]
  (html5
    [:center
     [:p "Instruction Designer NEO/Clojure"]
     [:img {:src "/img/isx_icon_alpha.png"}]
     [:p (str "Version. " (first version))]
     ]))
    