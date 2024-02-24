/*
 * Example
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(tag = "fruitType")]
pub enum Fruit {
    #[serde(rename="green_apple")]
    GreenApple(Box<models::Apple>),
    #[serde(rename="red_apple")]
    RedApple(Box<models::Apple>),
    #[serde(rename="banana")]
    Banana(Box<models::Banana>),
}

impl Default for Fruit {
    fn default() -> Self {
        Self::GreenApple(Box::default())
    }
}

