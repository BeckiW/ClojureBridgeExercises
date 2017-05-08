(ns drawing.lines
  (:require [quil.core :as q]))

(defn setup []
  (q/frame-rate 30)
  (q/color-mode :rgb)
  (q/stroke 255 0 0)
  (q/background 345)
  (q/fill 1 1 1 3)) 
  

(defn draw []
   ; Do some things 
  (q/rect -1 -1 512 512)
  (q/line 0 0 (q/mouse-x) (q/mouse-y))
  (q/line 300 0 (q/mouse-x) (q/mouse-y))
  (q/line 0 100 (q/mouse-x) (q/mouse-y))
  (q/line 100 250 (q/mouse-x) (q/mouse-y)))

(q/defsketch hello-lines
  ; Set the title of the sketch
  :title "You can see more lines"
  ; Set the size of the sketch
  :size [500 500]
  ; setup function is called setup
  :setup setup
  ; draw function is called draw
  :draw draw
  :features [:keep-on-top])

