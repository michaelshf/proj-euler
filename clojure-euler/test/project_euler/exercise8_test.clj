(ns project-euler.exercise8-test
  (:require [clojure.test :refer :all]
            [project-euler.core :refer :all]
            [project-euler.exercise8 :as e8]))

(deftest exercise8-test
  (testing "example"
    (is (= 5832 (e8/max-window-multiplier 4))))
  (testing "real test:"
    (println "Exercise 8: " (e8/max-window-multiplier 13))))
