(ns project-euler.exercise7
  (:require [clojure.string :as string]
            [clojure.math.numeric-tower :as math]))


;; By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

;; What is the 10 001st prime number

(comment
  todo
  X determine if a number is prime
  - need to return number if yes
  build a coll of prime numbers
  deliver the max)

(defn prime?
  [number]
  (if (not-any? zero?
                (map (fn [n] (mod number n)) (range 2 number)))
    number
    false))

(defn specific-start-range
  [start]
  (iterate inc start))

(defn prime-list-lazy
  []
  (filter prime? (specific-start-range 2)))

(defn specific-prime-number
  [specific-number]
  (apply max (take specific-number (prime-list-lazy))))


(specific-prime-number 10001) ; => 104743... could be faster
