(ns hacker-rank-clojure.pascals-triangle-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.pascals-triangle :refer :all]))

(deftest test-pascals-triangle
  (testing "sample I/O."
    (is (= 15 (c 6 4))
        (= 3 (c 3 2)))))
