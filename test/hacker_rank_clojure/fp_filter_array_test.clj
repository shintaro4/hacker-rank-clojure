(ns hacker-rank-clojure.fp-filter-array-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.fp-filter-array :refer :all]))

(deftest test-fp-filter-array
  (testing "sample I/O."
    (is (= [2 1 0]
           (fp-filter-array 3 [10 9 8 2 7 5 1 3 0])))))
