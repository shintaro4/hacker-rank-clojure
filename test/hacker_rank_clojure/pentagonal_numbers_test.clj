(ns hacker-rank-clojure.pentagonal-numbers-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.pentagonal-numbers :refer :all]))

(pentagonal-numbers)
(def dp (into [] DP))
(deftest test-pentagonal-numbers
  (testing "sample I/O."
    (is (= 1 (get dp 1)))
    (is (= 5 (get dp 2)))
    (is (= 12 (get dp 3)))
    (is (= 22 (get dp 4)))
    (is (= 35 (get dp 5)))))
