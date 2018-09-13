(ns project-euler.ex1
  (:require [clojure.java.io :as io]))

;;problem:
;If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
;Find the sum of all the multiples of 3 or 5 below 1000.

(defn multiple-lister [number]
  (filter (fn [x]
            (or
             (= 0 (mod x 3))
             (= 0 (mod x 5))))
            (range 1 number)))

(defn multiple-summer [number]
  (reduce + (multiple-lister number)))

(reduce + '(1 2 3))
(multiple-summer 10)
(multiple-summer 1000)
