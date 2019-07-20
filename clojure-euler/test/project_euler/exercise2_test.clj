(ns project-euler.exercise2-test
  (:require [clojure.test :refer :all]
            [project-euler.core :refer :all]
            [project-euler.exercise2 :as e2]))

(deftest exercise2-test
  (testing "The example is solved"
    (is (=  (e2/fibonacci-generator 90))))
  (testing "exercise"
    (println "Exercise 2: " (e2/fibonacci-generator 4000000))))
