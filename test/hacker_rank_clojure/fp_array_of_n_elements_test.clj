(ns hacker-rank-clojure.fp-array-of-n-elements-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.fp-array-of-n-elements :refer :all]))

(deftest test-fp-array-of-n-elements
  (testing "sample I/O."
    (is (= [0 1 2 3 4] (fp-array-of-n-elements 5)))))
