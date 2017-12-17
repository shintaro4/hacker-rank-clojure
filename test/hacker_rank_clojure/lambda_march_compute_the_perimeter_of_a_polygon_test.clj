(ns hacker-rank-clojure.lambda-march-compute-the-perimeter-of-a-polygon-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.lambda-march-compute-the-perimeter-of-a-polygon :refer :all]))

(deftest test-lambda-march-compute-the-perimeter-of-a-polygon
  (testing "sample I/O."
    (is (= 4
           (Math/round (perimeter [[0 0] [0 1] [1 1] [1 0]])))
        (= (Math/round 1556.3949033)
           (Math/round (perimeter [[1043 770] [551 990] [681 463]]))))))
