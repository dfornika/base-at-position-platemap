(ns cljs-starter.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))

(defonce db (r/atom {}))

(defn root []
  [:div])

(rdom/render [root] (js/document.getElementById "app"))

(comment
  (js/console.log "Hello, world!")
  (js/alert "Alert!")
  )
