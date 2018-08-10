package contracts.products

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return very first product"

    request {
        url "/getProduct"
        method "POST"
    }

    response {
        status 200
        headers {
            contentType "application/json"
        }
        body (
                name: "Nintendo 64",
                price: 65
        )
    }
}
