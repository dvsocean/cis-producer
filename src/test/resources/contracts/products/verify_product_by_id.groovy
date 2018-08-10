package contracts.products

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return product by"

    request {
        url "/find/1"
        method "GET"
    }

    response {
        status 200
        headers {
            contentType "application/json"
        }
        body (
                name: "Mongoose"
        )
    }
}


