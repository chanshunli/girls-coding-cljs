(ns girls-coding-cljs.core
  (:require [reagent.core :as reagent :refer [atom]]))

;; TODOS remove
(enable-console-print!)
(defonce app-state (atom {:text "Hello world!"}))
(defn on-js-reload [])
(defn hello-world []
  [:div
   [:h1 (:text @app-state)]
   [:h3 "Edit this and watch it change!"]])

;; The cljs books
(defn column-sm
  []
  "两个柱子"
  [:div.row>div.col-sm-2>div.row
   [:div.col-sm-6 "第一个柱子"]
   [:div.col-sm-6 "第二个柱子"]])

(defn panel
  []
  [:div.panel.panel-default>div.panel-body "基础面板---带边框文本显示块"])

(defn list-group
  []
  [:div.list-group>a.list-group-item
   [:h4.list-group-item-heading "自定义列表组"]
   [:p.list-group-item-text "这里是..."]])

(defn list-group-ul-li
  []
  [:ul.list-group>li.list-group-item "导航栏" [:span.badge "徽章1"]])

(defn ul-li-list
  []
  [:ul.media-list (map #(vector :li.media %) (range 5))])

(defn media-pull-right
  []
  [:div.media
   [:div.media-body
    [:h4.media-heading "媒体图片"]
    [:div "........."]]
   [:a.pull-right>img.media-object
    {:src "./img/post-bg.jpg"
     :style {:width "50%"
             :height "50%"
             :float "right"}}]])

(reagent/render-component
 [(fn []
    
    ) #_hello-world]
 (. js/document (getElementById "app")))
