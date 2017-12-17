(ns hacker-rank-clojure.lambda-march-compute-the-area-of-a-polygon-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.lambda-march-compute-the-area-of-a-polygon :refer :all]))

(deftest test-lambda-march-compute-the-are-of-a-polygon
  (testing "sample I/O."
    (is (= 1
           (Math/round (area [[0 0] [0 1] [1 1] [1 0]]))))))
