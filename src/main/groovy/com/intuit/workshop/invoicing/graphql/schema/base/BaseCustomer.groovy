package com.intuit.workshop.invoicing.graphql.schema.base

import graphql.annotations.GraphQLField

class BaseCustomer implements Entity {

    @GraphQLField
    public String id

    @GraphQLField
    public String businessName
}
