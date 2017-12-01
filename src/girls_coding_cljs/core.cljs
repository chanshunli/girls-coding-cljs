(ns girls-coding-cljs.core
  (:require [reagent.core :as reagent :refer [atom]]))
(enable-console-print!)

(defonce app-state (atom {:text "Hello world!"}))

(defn hello-world []
  [:div
   [:h1 (:text @app-state)]
   [:h3 "Edit this and watch it change!"]])

(defn column-sm
  []
  "两个柱子"
  [:div.row>div.col-sm-2>div.row
   [:div.col-sm-6 "第一个柱子"]
   [:div.col-sm-6 "第二个柱子"]])

(reagent/render-component
 [#_(fn []
      ) hello-world]
 (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
  )
