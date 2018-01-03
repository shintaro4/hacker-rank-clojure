(ns hacker-rank-clojure.sequence-full-of-colors-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.sequence-full-of-colors :refer :all]))

(deftest test-sequence-full-of-colors
  (testing "sample I/O."
    (is (= "True"
           (sequence-full-of-colors "RGGR"))
        (= "True"
           (sequence-full-of-colors "RYBG"))
        (= "False"
           (sequence-full-of-colors "RYRB"))
        (= "False"
           (sequence-full-of-colors "YGYGRBRB")))))
