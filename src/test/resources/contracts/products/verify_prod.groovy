package contracts.products

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return product by name"

    request {
        url "/getProduct/1"
        method "POST"
    }

    response {
        status 200
        headers {
            contentType "application/json"
        }
        body (
                name: "Playstation",
                price: 120
        )
    }
}
