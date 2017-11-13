(ns hacker-rank-clojure.fp-filter-positions-in-a-list-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.fp-filter-positions-in-a-list :refer :all]))

(deftest test-fp-filter-positions-in-a-list
  (testing "sample I/O."
    (is (= [5 4 7 8] (fp-filter-positions-in-a-list [2 5 3 4 6 7 9 8])))))
