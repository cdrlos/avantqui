(ns avantqui.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [avantqui.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[avantqui started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[avantqui has shut down successfully]=-"))
   :middleware wrap-dev})
