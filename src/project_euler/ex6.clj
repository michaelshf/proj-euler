(ns project-euler.ex6
  (:require [clojure.java.io :as io]
            [clojure.math.numeric-tower :as math]))

;;problem:
;The sum of the squares of the first ten natural numbers is,
;1^2 + 2^2 + ... + 102 = 385

;The square of the sum of the first ten natural numbers is,
;(1 + 2 + ... + 10)^2 = 552 = 3025
;Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

(defn sum-o-sqs [number]
  (reduce + (map (fn [x] (* x x)) (range 1 (inc number)))))
(sum-o-sqs 10)

(defn sqs-o-sum [number]
  (math/expt (reduce + (range 1 (inc number))) 2))
(sqs-o-sum 10)

(defn diff-calc [number]
  (- (sqs-o-sum number) (sum-o-sqs number)))
(diff-calc 10)


;Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
(println (diff-calc 100))

