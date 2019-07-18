(ns project-euler.exercise6-test
  (:require [clojure.test :refer :all]
            [project-euler.core :refer :all]
            [project-euler.exercise6 :as e6]))

(deftest exercise6-test
  (testing "The example is solved"
    (is (= 2640 (e6/sum-first-minus-square-first 10))))

  (testing "The answer to problem."
    (println (str "Exercise6 is: " (e6/sum-first-minus-square-first 100)))))
