(ns hacker-rank-clojure.pentagonal-numbers-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.pentagonal-numbers :refer :all]))

(deftest test-pentagonal-numbers
  (testing "sample I/O."
    (is (= 1 (pentagonal-numbers 1)))
    (is (= 5 (pentagonal-numbers 2)))
    (is (= 12 (pentagonal-numbers 3)))
    (is (= 22 (pentagonal-numbers 4)))
    (is (= 35 (pentagonal-numbers 5)))))
