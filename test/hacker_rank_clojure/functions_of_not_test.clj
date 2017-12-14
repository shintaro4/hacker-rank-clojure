(ns hacker-rank-clojure.functions-or-not-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.functions-or-not :refer :all]))

(deftest test-functions-or-not
  (testing "sample I/O."
    (is (= "YES" (functions-or-not [[1 1] [2 2] [3 3]])))
    (is (= "YES" (functions-or-not [[1 2] [2 4] [3 6] [4 8]])))))
