(ns hacker-rank-clojure.filter-elements-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.filter-elements :refer :all]))

(deftest test-filter-elements
  (testing "sample I/O."
    (is (= [4 5 3]
           (filter-elements 9 2 [4 5 2 5 4 3 1 3 4]))
        (= []
           (filter-elements 9 4 [4 5 2 5 4 3 1 3 4]))
        (= [5 4 3 2 1]
           (filter-elements 10 2 [5 4 3 2 1 1 2 3 4 5])))))
