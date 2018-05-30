(ns clojure-for-ml.core
  (:require
    [clojure.core.matrix :refer [matrix]]
    [incanter.core :refer [view]]
    [incanter.charts :refer [histogram scatter-plot]]
    [incanter.stats :refer [linear-model]]))


(def X (matrix [8.401 14.475 13.396 12.127 5.044
                    8.339 15.692 17.108 9.253 12.029]))
(def Y (matrix [-1.57 2.32 0.424 0.814 -2.3
                    0.01 1.954 2.296 -0.635 0.328]))

(def linear-samp-scatter
  (scatter-plot X Y))

(defn plot-scatter []
  (view linear-samp-scatter))
