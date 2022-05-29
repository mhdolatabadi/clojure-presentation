(ns desktop.core
  (:gen-class)
  (:require [seesaw.core :refer [grid-panel text vertical-panel frame show!]]))
(def window (frame
             :title "First Example"
             :content
             (vertical-panel :background "white" :items ["This" "is" "a" "clojure" "demo"])
             :width 500
             :height 200))
(defn -main
  [& args]
  (show! window))







;; (grid-panel
;;  :border "Properties"
;;  :columns 2
;;  :items ["Name" (text)
;;          "Address" (text "123 Main St")])

