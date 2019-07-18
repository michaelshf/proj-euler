(ns project-euler.exercise6
  (:require [clojure.string :as string]
            [clojure.math.numeric-tower :as math]))


;; The sum of the squares of the first ten natural numbers is,
;; 1^2 + 2^2 + ... + 10^2 = 385

;; The square of the sum of the first ten natural numbers is,
;; (1 + 2 + ... + 10)2 = 552 = 3025

;; Hence the difference between the sum of the squares of the
;; first ten natural numbers and the square of the sum is
;; 3025 − 385 = 2640.


;; Find the difference between the sum of the squares of the
;; first one hundred natural numbers and the square of the sum.

(defn sum-squarer
  [upper]
  (reduce + (map (fn [n] (* n n)) (range (inc upper)))))

(sum-squarer 10)

(defn square-summer
  [upper]
  (math/expt (reduce + (range (inc upper))) 2))

(square-summer 10)

(defn sum-first-minus-square-first
  [upper]
  (- (square-summer upper) (sum-squarer upper)))

(sum-first-minus-square-first 100)
