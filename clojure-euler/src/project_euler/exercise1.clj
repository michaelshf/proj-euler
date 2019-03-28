(ns exercise1
  "A place to solve the first problem"
  (:require [clojure.string :as string]))

(comment
  If we list all the natural numbers below 10 that are
  multiples of 3 or 5, we get 3, 5, 6 and 9. The sum
  of these multiples is 23.

  Find the sum of all the multiples of 3 or 5 below 1000.)

(defn threes-or-fives
  "Finds all multiples of three or five given a max number"
  [num-limit]
  (let [possibles (range 1 num-limit)]
    (filter 
     #(if (or (= 0 (mod % 3)) (= 0 (mod % 5))) %) 
     possibles)))


(println "Exercise 1:" (reduce + (threes-or-fives 1000)))

