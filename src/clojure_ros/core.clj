(ns clojure-ros.core
  (require
   [org.httpkit.server :as server]
   [compojure
    [core :as compojure :refer [defroutes GET POST]]
    [handler :refer [api]]]
   [necessary-evil.core :as xml-rpc]
   [clojurewerkz.buffy.core :refer :all])
  (:gen-class))
;; implement ros client api

(defroutes handler
  (GET "/ros-client-api" [] "coming soon...."))


(defn -main [& args]
  (server/run-server (-> #'handler api) {:port 8080}))