(ns hacker-rank-clojure.fp-solve-me-first-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.fp-solve-me-first :refer :all]))

(deftest test-fp-solve-me-first
  (testing "sample I/O."
    (is (= 5 (fp-solve-me-first 2 3)))))
