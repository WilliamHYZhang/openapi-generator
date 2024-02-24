/*
 * fruity
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 * Generated by: https://openapi-generator.tech
 */

use std::rc::Rc;
use std::borrow::Borrow;
use std::pin::Pin;
#[allow(unused_imports)]
use std::option::Option;

use hyper;
use futures::Future;

use crate::models;
use super::{Error, configuration};
use super::request as __internal_request;

pub struct DefaultApiClient<C: hyper::client::connect::Connect>
    where C: Clone + std::marker::Send + Sync + 'static {
    configuration: Rc<configuration::Configuration<C>>,
}

impl<C: hyper::client::connect::Connect> DefaultApiClient<C>
    where C: Clone + std::marker::Send + Sync {
    pub fn new(configuration: Rc<configuration::Configuration<C>>) -> DefaultApiClient<C> {
        DefaultApiClient {
            configuration,
        }
    }
}

pub trait DefaultApi {
    fn root_get(&self, ) -> Pin<Box<dyn Future<Output = Result<models::Fruit, Error>>>>;
    fn test(&self, body: Option<serde_json::Value>) -> Pin<Box<dyn Future<Output = Result<(), Error>>>>;
}

impl<C: hyper::client::connect::Connect>DefaultApi for DefaultApiClient<C>
    where C: Clone + std::marker::Send + Sync {
    #[allow(unused_mut)]
    fn root_get(&self, ) -> Pin<Box<dyn Future<Output = Result<models::Fruit, Error>>>> {
        let mut req = __internal_request::Request::new(hyper::Method::GET, "/".to_string())
        ;

        req.execute(self.configuration.borrow())
    }

    #[allow(unused_mut)]
    fn test(&self, body: Option<serde_json::Value>) -> Pin<Box<dyn Future<Output = Result<(), Error>>>> {
        let mut req = __internal_request::Request::new(hyper::Method::PUT, "/".to_string())
        ;
        req = req.with_body_param(body);
        req = req.returns_nothing();

        req.execute(self.configuration.borrow())
    }

}