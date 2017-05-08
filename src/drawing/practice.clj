(ns drawing.practice
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  {:flake (q/load-image "images/white_flake.png")
   :background (q/load-image "images/blue_background.png")
   :littleFlake(q/load-image "images/snowflake10.png")})

(defn draw [state]
  (q/background-image (:background state))
  (q/image (:flake state) 200 200)
  (q/image (:littleFlake state) 100 100 20 20)
  (q/image (:littleFlake state) 100 300 20 20)
  (q/image (:littleFlake state) 300 100 20 20)
  (q/image (:littleFlake state) 300 300 20 20)
  (q/image (:littleFlake state) 80 200 20 20)
  (q/image (:littleFlake state) 200 80 20 20)
  (q/image (:littleFlake state) 200 350 20 20)
  (q/image (:littleFlake state) 300 300 20 20))

(defn update [state]
  (if (>= (:y-param state) (q/height))
    (assoc state :y-param 0)
    (clojure.core/update state :y-param #(+ (rand-int 4) %))))

(q/defsketch practice
  :title "Quil practice"
  :size [500 500]
  :setup setup
  :update update
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
