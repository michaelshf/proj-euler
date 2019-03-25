(ns project-euler.ex9
  (:require [clojure.java.io]
            [clojure.math.numeric-tower :as math]))


;A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

;a^2 + b^2 = c^2
;For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
(defn pythagorean-triplets? [a b]
  (let [c (math/sqrt (+ (* a a) (* b b)))]
    (if (and (< a b c) (integer? c))
      (Boolean/TRUE)
      (Boolean/FALSE))))

; There exists exactly one Pythagorean triplet for which a + b + c = 1000.
; Find the product abc.
(def pythasum 1000)
(defn the-triplet? [a b c]
  (if (= pythasum (+ a b c))
    (if (pythagorean-triplets? a b)
      (Boolean/TRUE)
      (Boolean/FALSE))))

(defn triplet-finder []
  (let [x (vec (range 1 pythasum))]
    (doseq [a (range (count x))
            b (range (inc a) (count x))]
      (let [c (math/sqrt (+ (* a a) (* b b)))]
        (if (the-triplet? a b c)
          (do (println "the trip:" (str a "," b "," c))
              (println "the sum:" (str (+ a b c)))
              (println "the prod:" (str (* a b c)))))))))

(triplet-finder)
(println "************************************")
