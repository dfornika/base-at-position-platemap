(ns base-by-position-platemap.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))

(defonce app-db (r/atom {}))

(defn root []
  [:div])

(rdom/render [root] (js/document.getElementById "app"))

(comment
  
  )
