(ns hacker-rank-clojure.fp-sum-of-odd-elements-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.fp-sum-of-odd-elements :refer :all]))

(deftest test-fp-sum-of-odd-elements
  (testing "sample I/O."
    (is (= 16 (fp-sum-of-odd-elements [3 2 4 6 5 7 8 0 1])))))
