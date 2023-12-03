(ns ronniedroid.dayone
  (:gen-class)
  (:require [clojure.string :as str]))

(def input (slurp "resources/dayoneinput.txt"))

(def parsed-input (str/split input #"\n\n"))


