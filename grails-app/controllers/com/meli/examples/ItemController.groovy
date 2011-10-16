package com.meli.examples

import groovyx.net.http.RESTClient

class ItemController {

    def item = {

      def client = new RESTClient('https://api.mercadolibre.com/')

      def resp = client.get(path: 'items/MLA127244054')
      
      render (view:'item', model:['item':resp.data] )

    }
}
