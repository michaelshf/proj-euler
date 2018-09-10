(ns project-euler.core-test
  (:require [clojure.test :refer :all]
            [project-euler.core :refer :all]
            [project-euler.ex1 :as ex1]))


(deftest example-one
  (testing "example 1 example"
    (is (= 23 (ex1/multiple-summer 10)))))
