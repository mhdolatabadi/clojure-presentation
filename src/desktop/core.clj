(ns desktop.core
  (:gen-class)
  (:require [seesaw.core :refer [grid-panel text vertical-panel frame show!]]))
(def window (frame
             :title "First Example"
             :content
             (grid-panel
              :border "Properties"
              :columns 2
              :items ["Name" (text)
                      "Address" (text "123 Main St")])
             :width 500
             :height 200
             ))
(defn -main
  [& args]
  (show! window))







; (vertical-panel :background "red" :items ["This" "is" "a" "vertical" "stack of" "JLabels"])
